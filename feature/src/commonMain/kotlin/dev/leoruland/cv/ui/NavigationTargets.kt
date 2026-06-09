package dev.leoruland.cv.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.outlined.Work
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed interface NavigationTarget : NavKey {
    val label: String
    val icon: ImageVector

    @Serializable
    data object Personal : NavigationTarget {
        override val label: String get() = "Personalien"
        override val icon: ImageVector get() = Icons.Outlined.Person
    }

    @Serializable
    data object Skills : NavigationTarget {
        override val label: String get() = "Kenntnisse"
        override val icon: ImageVector get() = Icons.Outlined.Star
    }

    @Serializable
    data object Experience : NavigationTarget {
        override val label: String get() = "Erfahrung"
        override val icon: ImageVector get() = Icons.Outlined.Work
    }

    companion object {
        val entries: List<NavigationTarget> = listOf(Personal, Skills, Experience)
    }
}
