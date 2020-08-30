package com.vladimir.teamwise.di

import com.vladimir.teamwise.feature.addition.AdditionViewModel
import com.vladimir.teamwise.feature.auth.AuthViewModel
import com.vladimir.teamwise.feature.chat.ChatViewModel
import com.vladimir.teamwise.feature.chatroom.ChatRoomViewModel
import com.vladimir.teamwise.feature.information.InformationViewModel
import com.vladimir.teamwise.feature.informationdetail.InformationDetailViewModel
import com.vladimir.teamwise.feature.profile.ProfileViewModel
import com.vladimir.teamwise.feature.registration.RegistrationViewModel
import com.vladimir.teamwise.feature.search.SearchViewModel
import com.vladimir.teamwise.feature.settings.SettingsViewModel
import com.vladimir.teamwise.feature.start.StartViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(it: AdditionViewModel)
    fun inject(it: AuthViewModel)
    fun inject(it: ChatViewModel)
    fun inject(it: ChatRoomViewModel)
    fun inject(it: InformationViewModel)
    fun inject(it: InformationDetailViewModel)
    fun inject(it: ProfileViewModel)
    fun inject(it: RegistrationViewModel)
    fun inject(it: SearchViewModel)
    fun inject(it: SettingsViewModel)
    fun inject(it: StartViewModel)
}