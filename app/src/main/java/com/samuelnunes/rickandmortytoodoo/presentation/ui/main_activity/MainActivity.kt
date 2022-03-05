package com.samuelnunes.rickandmortytoodoo.presentation.ui.main_activity

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.samuelnunes.rickandmortytoodoo.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainActivityViewModel by viewModels()

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)
        }
        lifecycleScope.launchWhenCreated {
            val allCharacters = viewModel.service.getAllCharacters()
            allCharacters.results.forEach {
                Timber.i(it.toString())
            }
        }
    }
}