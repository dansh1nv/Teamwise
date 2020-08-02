package com.vladimir.teamwise.feature.registration

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegistrationViewModel : ViewModel() {

    val enteredEmail = MutableLiveData("")

    val enteredPersonData = MutableLiveData("")

    val enteredLogin = MutableLiveData("")

    val enteredPassword = MutableLiveData("")
}
