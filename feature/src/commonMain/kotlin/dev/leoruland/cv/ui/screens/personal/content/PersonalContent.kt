package dev.leoruland.cv.ui.screens.personal.content

import dev.leoruland.cv.data.EducationEntry
import dev.leoruland.cv.data.Personal

object PersonalContent {
    val personal: Personal = Personal(
        name = "Leonardo Ruland",
        role = "Software Engineer Mobile",
        tagline = "Android Engineer mit über 5 Jahren Kotlin- und Compose-Praxis. " +
            "Von Architektur-Refactorings über BFSG-Accessibility bis zur kompletten " +
            "Neuentwicklung produktiver Apps mit Millionen-Reichweite – etwa für " +
            "C&A, Mercedes und Deutsche Bahn.",
        address = "Arndtstraße 10, 10965 Berlin",
        phone = "+49 176 712 166 10",
        email = "leoruland@web.de",
        languages = listOf("Deutsch (Muttersprache)", "Englisch (C1)"),
        education = listOf(
            EducationEntry(
                degree = "B.Sc. Angewandte Informatik",
                institution = "HTW Berlin",
                period = "2016 – 2022",
            ),
            EducationEntry(
                degree = "B.A. Klassische Archäologie / Religionswissenschaft",
                institution = "Uni Heidelberg",
                period = "Abschluss 2016",
            ),
        ),
    )
}
