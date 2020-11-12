package com.vladimir.teamwise.data.models

data class UserInfo(
    val userName: String?,
    val userLogin: String?,
    val userCity: String?,
    val userPhoto: String?,
    val userDescription: String?,
    val userOrganizer: Int?,
    val userMember: Int?,
    val userSubscription : Int?,
    val userSubscriber: Int?
)