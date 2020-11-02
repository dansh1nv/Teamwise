package com.vladimir.teamwise.feature.auth

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AuthViewModel : ViewModel() {

    /**Введенный логин*/
    val enteredLogin = MutableLiveData("")

    /**Введенный пароль*/
    val enteredPassword = MutableLiveData("")

}