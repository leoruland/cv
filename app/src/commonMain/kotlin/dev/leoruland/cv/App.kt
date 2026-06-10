package dev.leoruland.cv

import androidx.compose.runtime.Composable
import dev.leoruland.cv.feature.experience.navigation.ExperienceRoute
import dev.leoruland.cv.feature.experience.ui.ExperienceScreen
import dev.leoruland.cv.feature.personal.navigation.PersonalRoute
import dev.leoruland.cv.feature.personal.ui.PersonalScreen
import dev.leoruland.cv.feature.skills.navigation.SkillsRoute
import dev.leoruland.cv.feature.skills.ui.SkillsScreen
import androidx.navigation3.runtime.entryProvider
import dev.leoruland.cv.navigation.NavigationContainer
import dev.leoruland.cv.ui.theme.CvTheme
import kotlinx.serialization.modules.subclass

@Composable
fun App() {
    CvTheme {
        NavigationContainer(
            destinations = listOf(PersonalRoute, SkillsRoute, ExperienceRoute),
            startDestination = PersonalRoute,
            serializerSubclasses = {
                subclass(PersonalRoute::class)
                subclass(SkillsRoute::class)
                subclass(ExperienceRoute::class)
            },
            entryProvider = entryProvider {
                entry<PersonalRoute> { PersonalScreen() }
                entry<SkillsRoute> { SkillsScreen() }
                entry<ExperienceRoute> { ExperienceScreen() }
            },
        )
    }
}
