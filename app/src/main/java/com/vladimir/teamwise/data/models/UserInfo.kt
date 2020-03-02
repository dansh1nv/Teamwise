package com.vladimir.teamwise.data.models

data class UserInfo(
    var userName: String?,
    var userLogin: String?,
    var userCity: String?,
    var userPhoto: String?,
    var userDescription: String?,
    var userOrganizer: Int?,
    var userMember: Int?,
    var userSubscription : Int?,
    var userSubscriber: Int?
)