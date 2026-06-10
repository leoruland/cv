package dev.leoruland.cv.feature.skills.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.ui.graphics.vector.ImageVector
import dev.leoruland.cv.navigation.NavigationTarget
import kotlinx.serialization.Serializable

@Serializable
data object SkillsRoute : NavigationTarget {
    override val label: String get() = "Kenntnisse"
    override val icon: ImageVector get() = Icons.Outlined.Star
}
