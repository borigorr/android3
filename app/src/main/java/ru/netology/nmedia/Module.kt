package ru.netology.nmedia

import com.google.android.gms.common.GoogleApiAvailability
import com.google.firebase.messaging.FirebaseMessaging
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object Module {
    @Provides
    fun firebase(): FirebaseMessaging = FirebaseMessaging.getInstance()

    @Provides
    fun googleApiAvailability(): GoogleApiAvailability = GoogleApiAvailability.getInstance()
}