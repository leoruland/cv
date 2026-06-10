package dev.leoruland.cv.feature.personal.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.vector.ImageVector
import dev.leoruland.cv.navigation.CvDestination
import kotlinx.serialization.Serializable

@Serializable
data object PersonalRoute : CvDestination {
    override val label: String get() = "Personalien"
    override val icon: ImageVector get() = Icons.Outlined.Person
}
