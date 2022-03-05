package com.samuelnunes.rickandmortytoodoo.core.remote

import com.samuelnunes.rickandmortytoodoo.core.remote.response.CharacterResponse
import retrofit2.http.GET

interface RickAndMortyService {

    @GET("character")
    suspend fun getAllCharacters(): CharacterResponse

}