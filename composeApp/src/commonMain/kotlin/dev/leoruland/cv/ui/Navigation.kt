package dev.leoruland.cv.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.outlined.Work

enum class CvDestination(
    val label: String,
    val icon: androidx.compose.ui.graphics.vector.ImageVector,
) {
    Personal("Personalien", Icons.Outlined.Person),
    Skills("Kenntnisse", Icons.Outlined.Star),
    Experience("Erfahrung", Icons.Outlined.Work),
}
