package com.voitheia.domain.task

import android.Manifest
import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import android.os.Looper
import androidx.core.app.ActivityCompat
import com.voitheia.api.model.RequestDto
import io.reactivex.Flowable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class GetAllOpenTasks : AbstractBackendApi() {

    @SuppressLint("MissingPermission")
    fun execute(locationManager: LocationManager): Single<Array<RequestDto>> {
        return Single.defer {
            Single.unsafeCreate<Location> {
                val locationListener = object: LocationListener {
                    override fun onLocationChanged(location: Location?) {
                        location?.let { loc ->
                            it.onSuccess(loc)
                        }
                    }

                    override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {
                    }

                    override fun onProviderEnabled(provider: String?) {
                    }

                    override fun onProviderDisabled(provider: String?) {
                    }
                }
                locationManager.requestSingleUpdate(LocationManager.GPS_PROVIDER, locationListener, Looper.getMainLooper())
            }.observeOn(Schedulers.io())
                .map {
                    requestApi.requestGet(it.longitude, it.latitude, 20, 500).requests!!
                }
                .observeOn(AndroidSchedulers.mainThread())
        }
    }
}