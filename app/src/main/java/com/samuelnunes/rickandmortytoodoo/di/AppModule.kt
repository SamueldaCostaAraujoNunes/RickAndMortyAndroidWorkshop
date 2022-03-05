package com.samuelnunes.rickandmortytoodoo.di

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.samuelnunes.rickandmortytoodoo.core.remote.RickAndMortyService
import com.samuelnunes.rickandmortytoodoo.core.remote.converters.DateTimeRemoteConverter
import com.samuelnunes.rickandmortytoodoo.core.util.Constants.RICK_AND_MORTY_BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.time.LocalDateTime
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideGson(): Gson =
        GsonBuilder()
            .registerTypeAdapter(
                LocalDateTime::class.java,
                DateTimeRemoteConverter().nullSafe())
            .create()


    @Provides
    @Singleton
    fun provideRetrofit(gson: Gson): Retrofit {
        return Retrofit.Builder()
            .baseUrl(RICK_AND_MORTY_BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

    @Provides
    @Singleton
    fun provideRickAndMortyService(retrofit: Retrofit): RickAndMortyService =
        retrofit.create(RickAndMortyService::class.java)

}