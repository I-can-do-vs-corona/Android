package com.voitheia.view.login

import android.Manifest
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import androidx.core.app.ActivityCompat
import com.voitheia.MainActivity
import com.voitheia.R
import com.voitheia.api.model.CredentialsDTO
import com.voitheia.databinding.LandingPageBinding
import com.voitheia.domain.PreferencesKeys
import com.voitheia.domain.user.LoginUser

class LandingFragment : Fragment() {

    private lateinit var binding: LandingPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LandingPageBinding.inflate(inflater)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        hideActionBar()
        binding.landingRegisterButton.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()?.addToBackStack(null)?.replace(R.id.content_frame, RegisterFragment())?.commit()
        }
        binding.landingLoginButton.setOnClickListener {
            val email = binding.landingUserName.text.toString()
            val password = binding.landingPassword.text.toString()
            val credentialsDTO = CredentialsDTO(email, password)
            LoginUser().execute(credentialsDTO).subscribe { token ->
                activity?.getPreferences(Context.MODE_PRIVATE)?.edit()?.putString(PreferencesKeys.TOKEN.key, token)?.commit()
                activity?.supportFragmentManager?.beginTransaction()?.addToBackStack(null)?.replace(R.id.content_frame, MainFragment())?.commit()
            }
        }
    }

    fun hideActionBar() {
        (activity as? MainActivity)?.supportActionBar?.hide()
    }

    fun showActionBar() {
        (activity as? MainActivity)?.supportActionBar?.show()
    }
}
