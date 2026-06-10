package dev.leoruland.cv.feature.skills.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Star
import androidx.compose.ui.graphics.vector.ImageVector
import cv_app.feature.skills.generated.resources.Res
import cv_app.feature.skills.generated.resources.nav_skills
import dev.leoruland.cv.navigation.NavigationTarget
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.StringResource

@Serializable
data object SkillsRoute : NavigationTarget {
    override val labelRes: StringResource get() = Res.string.nav_skills
    override val icon: ImageVector get() = Icons.Outlined.Star
}
