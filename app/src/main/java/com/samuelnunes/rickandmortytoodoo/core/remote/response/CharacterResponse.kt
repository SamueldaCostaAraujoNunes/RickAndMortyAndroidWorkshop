package com.samuelnunes.rickandmortytoodoo.core.remote.response


import com.samuelnunes.rickandmortytoodoo.core.remote.dto.PaggingInfoDTO
import com.samuelnunes.rickandmortytoodoo.core.remote.dto.CharacterDTO

data class CharacterResponse(
    val info: PaggingInfoDTO,
    val results: List<CharacterDTO>
)