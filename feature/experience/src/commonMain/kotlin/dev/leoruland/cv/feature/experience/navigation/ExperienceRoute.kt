package dev.leoruland.cv.feature.experience.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Work
import androidx.compose.ui.graphics.vector.ImageVector
import dev.leoruland.cv.navigation.NavigationTarget
import kotlinx.serialization.Serializable

@Serializable
data object ExperienceRoute : NavigationTarget {
    override val label: String get() = "Erfahrung"
    override val icon: ImageVector get() = Icons.Outlined.Work
}
