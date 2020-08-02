package com.vladimir.teamwise.feature.addition

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AdditionViewModel : ViewModel() {

    /**Название мероприятия*/
    val eventTitle = MutableLiveData("")

    /**Описание мероприятия*/
    val eventDescription = MutableLiveData("")

    /**Дата проведения*/
    val eventDate = MutableLiveData("")

    /**Теги поиска*/
    val addedTags = MutableLiveData("")

}
