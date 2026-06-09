package dev.leoruland.cv.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import dev.leoruland.cv.ui.CvDestination

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationContainer() {
    var selected by remember { mutableStateOf(CvDestination.Personal) }

    BoxWithConstraints(
        modifier = Modifier.fillMaxSize(),
    ) {
        val isLandscape = maxWidth > maxHeight

        if (isLandscape) {
            Row(modifier = Modifier.fillMaxSize()) {
                CvNavigationRail(
                    selected = selected,
                    onSelect = { selected = it },
                )
                Surface(
                    color = MaterialTheme.colorScheme.background,
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Scaffold(
                        topBar = { CvAppBar(selected.label) },
                        containerColor = MaterialTheme.colorScheme.background,
                    ) { inner ->
                        ScreenContent(selected, Modifier.padding(inner))
                    }
                }
            }
        } else {
            Scaffold(
                topBar = { CvAppBar(selected.label) },
                bottomBar = {
                    CvBottomBar(
                        selected = selected,
                        onSelect = { selected = it },
                    )
                },
                containerColor = MaterialTheme.colorScheme.background,
            ) { inner ->
                ScreenContent(selected, Modifier.padding(inner))
            }
        }
    }
}

@Composable
private fun ScreenContent(destination: CvDestination, modifier: Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        when (destination) {
            CvDestination.Personal -> PersonalScreen()
            CvDestination.Skills -> SkillsScreen()
            CvDestination.Experience -> ExperienceScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun CvAppBar(title: String) {
    TopAppBar(
        title = { Text(title) },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
            titleContentColor = MaterialTheme.colorScheme.onSurface,
        ),
    )
}

@Composable
private fun CvBottomBar(
    selected: CvDestination,
    onSelect: (CvDestination) -> Unit,
) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surfaceVariant,
        contentColor = MaterialTheme.colorScheme.onSurface,
    ) {
        CvDestination.values().forEach { dest ->
            NavigationBarItem(
                selected = dest == selected,
                onClick = { onSelect(dest) },
                icon = { Icon(dest.icon, contentDescription = dest.label) },
                label = { Text(dest.label) },
            )
        }
    }
}

@Composable
private fun CvNavigationRail(
    selected: CvDestination,
    onSelect: (CvDestination) -> Unit,
) {
    NavigationRail(
        containerColor = MaterialTheme.colorScheme.surfaceVariant,
        contentColor = MaterialTheme.colorScheme.onSurface,
    ) {
        CvDestination.values().forEach { dest ->
            NavigationRailItem(
                selected = dest == selected,
                onClick = { onSelect(dest) },
                icon = { Icon(dest.icon, contentDescription = dest.label) },
                label = { Text(dest.label) },
            )
        }
    }
}
