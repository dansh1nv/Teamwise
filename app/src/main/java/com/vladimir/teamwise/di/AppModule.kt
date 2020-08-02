package com.vladimir.teamwise.di

import dagger.Module

@Module(includes = [AppModule.Declarations::class])
class AppModule {

    @Module
    internal interface Declarations {

    }
}