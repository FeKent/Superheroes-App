package com.example.superheroesapp.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroesapp.model.HeroesRepository.heroes


@Composable
fun HeroesScreen() {
    LazyColumn(Modifier.verticalScroll(rememberScrollState())) {
        itemsIndexed(heroes) { index, hero ->
            HeroListItem(
                hero = hero,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HeroScreenPreview() {
    HeroesScreen()
}