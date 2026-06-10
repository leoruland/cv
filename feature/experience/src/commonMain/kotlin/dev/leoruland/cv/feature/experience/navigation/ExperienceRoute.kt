package dev.leoruland.cv.feature.experience.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Work
import androidx.compose.ui.graphics.vector.ImageVector
import cv_app.feature.experience.generated.resources.Res
import cv_app.feature.experience.generated.resources.nav_experience
import dev.leoruland.cv.navigation.NavigationTarget
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.StringResource

@Serializable
data object ExperienceRoute : NavigationTarget {
    override val labelRes: StringResource get() = Res.string.nav_experience
    override val icon: ImageVector get() = Icons.Outlined.Work
}
