package com.vladimir.teamwise.feature.registration

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.parse.ParseUser
import com.parse.SignUpCallback

class RegistrationViewModel : ViewModel() {

    val enteredEmail = MutableLiveData<String>()
    val enteredLogin = MutableLiveData<String>()
    val enteredPassword = MutableLiveData<String>()

    fun registration() {
        val email = enteredEmail.value.orEmpty()
        val login = enteredLogin.value.orEmpty()
        val password = enteredPassword.value.orEmpty()
        if (!email.isBlank() && !login.isBlank() && !password.isBlank()) {
            val user = ParseUser()
            user.username = login
            user.setPassword(password)
            user.email = email
            user.signUpInBackground { error ->
                if (error == null) {
                    Log.d("Регистрация", "Регистрация прошла успешно, $login")
                } else {
                    ParseUser.logOut()
                    Log.d("Регистрация", "Не удалось зарегистрировать пользователя $login")
                }

            }
        }
    }

}