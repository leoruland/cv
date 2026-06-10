package dev.leoruland.cv.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation3.runtime.NavKey
import org.jetbrains.compose.resources.StringResource

interface NavigationTarget : NavKey {
    val labelRes: StringResource
    val icon: ImageVector
}
