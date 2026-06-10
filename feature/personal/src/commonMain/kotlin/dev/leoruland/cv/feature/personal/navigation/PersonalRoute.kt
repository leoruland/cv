package dev.leoruland.cv.feature.personal.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector
import cv_app.feature.personal.generated.resources.Res
import cv_app.feature.personal.generated.resources.nav_personal
import dev.leoruland.cv.navigation.NavigationTarget
import kotlinx.serialization.Serializable
import org.jetbrains.compose.resources.StringResource

@Serializable
data object PersonalRoute : NavigationTarget {
    override val labelRes: StringResource get() = Res.string.nav_personal
    override val icon: ImageVector get() = Icons.Outlined.Person
}
