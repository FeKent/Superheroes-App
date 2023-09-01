@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.superheroesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.superheroesapp.composables.HeroesScreen
import com.example.superheroesapp.model.HeroesRepository.heroes
import com.example.superheroesapp.ui.theme.SuperheroesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperheroesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SuperheroesApp()
                }
            }
        }
    }
}


@Composable
fun SuperheroesApp() {
    Scaffold(
        topBar = { SuperBar() },
        content = {paddingValues -> 
            Column(modifier = Modifier.padding(paddingValues)) {
              HeroesScreen(heroes = heroes)  
            }
            
        }
    )
}




@Composable
fun SuperBar() {
    CenterAlignedTopAppBar(title = {
        Text(text = "Superheroes", style = MaterialTheme.typography.displayLarge)
    })
}