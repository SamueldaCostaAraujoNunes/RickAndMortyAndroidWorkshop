package com.samuelnunes.rickandmortytoodoo.core.remote.dto


data class PaggingInfoDTO(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: String
)