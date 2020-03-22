package com.voitheia.view.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.voitheia.MainActivity
import com.voitheia.R
import com.voitheia.api.model.RegisterUserDTO
import com.voitheia.databinding.RegisterPageBinding
import com.voitheia.domain.user.RegisterUser

class RegisterFragment : Fragment() {

    private lateinit var binding: RegisterPageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = RegisterPageBinding.inflate(inflater)
        return binding.root
    }

    override fun onResume() {
        super.onResume()
        hideActionBar()

        binding.registerCreateUserButton.setOnClickListener {
            val email = binding.registerEmailField.text.toString()
            val firstName = binding.registerFirstNameField.text.toString()
            val lastName = binding.registerLastNameField.text.toString()
            val password = binding.registerPasswordField.text.toString()
            val street = binding.registerStreetField.text.toString()
            val city = binding.registerCityField.text.toString()
            val registerUserDTO = RegisterUserDTO(email, firstName, lastName, password, street, "zip", city, "Deutschland")
            RegisterUser().execute(registerUserDTO).subscribe {
                activity?.supportFragmentManager?.beginTransaction()?.addToBackStack(null)?.replace(R.id.content_frame, LandingFragment())?.commit()
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
