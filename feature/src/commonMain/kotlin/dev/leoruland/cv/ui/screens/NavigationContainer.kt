package dev.leoruland.cv.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.WideNavigationRailItem
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.ui.NavDisplay
import androidx.savedstate.serialization.SavedStateConfiguration
import dev.leoruland.cv.ui.NavigationTarget
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

private val navConfig = SavedStateConfiguration {
    serializersModule = SerializersModule {
        polymorphic(NavKey::class) {
            subclass(NavigationTarget.Personal::class)
            subclass(NavigationTarget.Skills::class)
            subclass(NavigationTarget.Experience::class)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavigationContainer() {
    val backStack = rememberNavBackStack(navConfig, NavigationTarget.Personal)
    val current: NavigationTarget = backStack.lastOrNull() as? NavigationTarget ?: NavigationTarget.Personal

    BoxWithConstraints(
        modifier = Modifier.fillMaxSize(),
    ) {
        val isLandscape = maxWidth > maxHeight

        if (isLandscape) {
            Row(modifier = Modifier.fillMaxSize()) {
                NavigationRail(
                    selected = current,
                    onSelect = { backStack.switchTab(it) },
                )
                Surface(
                    color = MaterialTheme.colorScheme.background,
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Scaffold(
                        containerColor = MaterialTheme.colorScheme.background,
                    ) { inner ->
                        NavContent(backStack, Modifier.padding(inner))
                    }
                }
            }
        } else {
            Scaffold(
                topBar = { AppBar(current.label) },
                bottomBar = {
                    BottomBar(
                        selected = current,
                        onSelect = { backStack.switchTab(it) },
                    )
                },
                containerColor = MaterialTheme.colorScheme.background,
            ) { inner ->
                NavContent(backStack, Modifier.padding(inner))
            }
        }
    }
}

@Composable
private fun NavContent(backStack: NavBackStack<NavKey>, modifier: Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        NavDisplay(
            backStack = backStack,
            entryProvider = entryProvider {
                entry<NavigationTarget.Personal> { PersonalScreen() }
                entry<NavigationTarget.Skills> { SkillsScreen() }
                entry<NavigationTarget.Experience> { ExperienceScreen() }
            },
        )
    }
}

private fun NavBackStack<NavKey>.switchTab(destination: NavigationTarget) {
    if (lastOrNull() == destination) return
    clear()
    add(destination)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AppBar(title: String) {
    TopAppBar(
        title = { Text(title) },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
            titleContentColor = MaterialTheme.colorScheme.onSurface,
        ),
    )
}

@Composable
private fun BottomBar(
    selected: NavigationTarget,
    onSelect: (NavigationTarget) -> Unit,
) {
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surfaceVariant,
        contentColor = MaterialTheme.colorScheme.onSurface,
    ) {
        NavigationTarget.entries.forEach { target ->
            NavigationBarItem(
                selected = target == selected,
                onClick = { onSelect(target) },
                icon = { Icon(target.icon, contentDescription = target.label) },
                label = { Text(target.label) },
            )
        }
    }
}

@Composable
private fun NavigationRail(
    selected: NavigationTarget,
    onSelect: (NavigationTarget) -> Unit,
) {
    NavigationRail(
        containerColor = MaterialTheme.colorScheme.surfaceVariant,
        contentColor = MaterialTheme.colorScheme.onSurface,
    ) {
        Column(
            modifier = Modifier.fillMaxHeight(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NavigationTarget.entries.forEach { dest ->
                WideNavigationRailItem(
                    modifier = Modifier.padding(end = 8.dp),
                    selected = dest == selected,
                    onClick = { onSelect(dest) },
                    icon = { Icon(dest.icon, contentDescription = dest.label) },
                    label = { Text(dest.label) },
                    railExpanded = true,
                )
                Spacer(Modifier.size(16.dp))
            }
        }
    }
}
