package com.vladimir.teamwise.data.models

data class User (
    val name : String?,
    val login : String?,
    val location : String?,
    val url : String?,
    val descriptionProfile : String?,
    val subscribe : Boolean?,
    val countOrganizer : Int?,
    val countMember : Int?,
    val countSubscription : Int?,
    val countSubscriber : Int?
)