package com.voitheia

import android.Manifest
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.voitheia.domain.PreferencesKeys
import com.voitheia.view.login.LandingFragment
import com.voitheia.view.login.MainFragment
import org.openapitools.client.infrastructure.ApiClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tokenKey = getPreferences(Context.MODE_PRIVATE)!!.getString(PreferencesKeys.TOKEN.key, null)
        if (getPreferences(Context.MODE_PRIVATE)!!.contains(PreferencesKeys.TOKEN.key)) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.content_frame, MainFragment())
                .commit()
            ApiClient.accessToken = tokenKey
        } else {
            supportFragmentManager.beginTransaction()
                .replace(R.id.content_frame, LandingFragment())
                .commit()
        }

        ActivityCompat.requestPermissions(this,
            arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),1);
    }
}
