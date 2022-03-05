package com.samuelnunes.rickandmortytoodoo.presentation.ui.main_activity

import androidx.lifecycle.ViewModel
import com.samuelnunes.rickandmortytoodoo.core.remote.RickAndMortyService
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(val service: RickAndMortyService): ViewModel() {


}