package dev.leoruland.cv.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation3.runtime.NavKey

interface CvDestination : NavKey {
    val label: String
    val icon: ImageVector
}
