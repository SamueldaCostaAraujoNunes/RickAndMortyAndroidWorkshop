package com.samuelnunes.rickandmortytoodoo.core.remote.dto

import java.time.LocalDateTime


data class CharacterDTO(
    val created: LocalDateTime,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: LocationDTO,
    val name: String,
    val origin: OriginDTO,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)