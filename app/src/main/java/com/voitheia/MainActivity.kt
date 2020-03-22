package com.voitheia

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.voitheia.domain.PreferencesKeys
import com.voitheia.view.login.LandingFragment
import com.voitheia.view.login.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tokenKey = getPreferences(Context.MODE_PRIVATE)!!.getString(PreferencesKeys.TOKEN.key, "asdf")
        if (getPreferences(Context.MODE_PRIVATE)!!.contains(PreferencesKeys.TOKEN.key)) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.content_frame, MainFragment())
                .commit()
        } else {
            supportFragmentManager.beginTransaction()
                .replace(R.id.content_frame, LandingFragment())
                .commit()
        }
    }
}
