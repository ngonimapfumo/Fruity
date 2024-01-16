package com.ngonim.fruity.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.ngonim.fruity.util.Constants.BASE_URL
import com.ngonim.fruity.util.Constants.NETWORK_TIMEOUT
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @Singleton
    fun provideBaseUrl() = BASE_URL

    @Provides
    @Singleton
    fun connectionTimeOut() = NETWORK_TIMEOUT

    @Provides
    @Singleton
    fun provideGson() :Gson = GsonBuilder().setLenient().create()

    @Provides
    @Singleton
    fun provideOkHttp() = ""

}