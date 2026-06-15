package dev.leoruland.cv.feature.personal.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cv_app.feature.personal.generated.resources.Res
import cv_app.feature.personal.generated.resources.section_contact
import cv_app.feature.personal.generated.resources.section_education
import cv_app.feature.personal.generated.resources.section_languages
import dev.leoruland.cv.core.components.SectionTitle
import dev.leoruland.cv.feature.personal.data.DefaultPersonalDataSource
import dev.leoruland.cv.feature.personal.domain.DefaultPersonalRepository
import dev.leoruland.cv.theming.AppTheme
import org.jetbrains.compose.resources.stringResource

@Composable
fun PersonalScreen(
    modifier: Modifier = Modifier,
    viewModel: PersonalViewModel = remember {
        PersonalViewModel(DefaultPersonalRepository(DefaultPersonalDataSource()))
    },
) {
    val data by viewModel.personalData
    val uriHandler = LocalUriHandler.current
    Column(
        modifier = modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
    ) {
        Surface(
            color = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.onPrimaryContainer,
            shape = RoundedCornerShape(24.dp),
            modifier = Modifier.fillMaxWidth(),
        ) {
            Column(Modifier.padding(20.dp)) {
                Text(
                    text = data.name,
                    style = MaterialTheme.typography.headlineMedium,
                    fontWeight = FontWeight.Medium,
                )
                Spacer(Modifier.height(4.dp))
                Text(
                    text = data.role,
                    style = MaterialTheme.typography.titleMedium,
                    color = MaterialTheme.colorScheme.primary,
                )
                Spacer(Modifier.height(12.dp))
                Surface(
                    color = MaterialTheme.colorScheme.surfaceVariant,
                    contentColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    shape = RoundedCornerShape(16.dp),
                ) {
                    Text(
                        text = data.tagline,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(14.dp),
                    )
                }
            }
        }

        SectionTitle(stringResource(Res.string.section_contact))
        InfoCard {
            LabeledLine(label = "Adresse", value = data.address)
            LabeledLink(
                label = "Telefon",
                value = data.phone,
                onClick = { uriHandler.openUri("tel:${data.phone}") },
            )
            LabeledLink(
                label = "E-Mail",
                value = data.email,
                onClick = { uriHandler.openUri("mailto:${data.email}") },
            )
        }

        SectionTitle(stringResource(Res.string.section_languages))
        InfoCard {
            data.languages.forEach { lang ->
                Text(lang, style = MaterialTheme.typography.bodyMedium)
            }
        }

        SectionTitle(stringResource(Res.string.section_education))
        data.education.forEach { e ->
            InfoCard {
                Text(
                    e.degree,
                    style = MaterialTheme.typography.titleSmall,
                    fontWeight = FontWeight.Medium,
                )
                Text(
                    "${e.institution} · ${e.period}",
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                )
            }
        }
    }
}

@Composable
private fun InfoCard(content: @Composable () -> Unit) {
    Card(
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.onSurface,
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
        modifier = Modifier.fillMaxWidth(),
    ) {
        Column(
            modifier = Modifier.padding(14.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
        ) { content() }
    }
}

@Composable
private fun LabeledLine(label: String, value: String) {
    Column {
        Text(
            label,
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )
        Text(value, style = MaterialTheme.typography.bodyMedium)
    }
}

@Composable
private fun LabeledLink(label: String, value: String, onClick: () -> Unit) {
    Column(modifier = Modifier.clickable(onClick = onClick)) {
        Text(
            label,
            style = MaterialTheme.typography.labelSmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
        )
        Text(
            value,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.primary,
//            textDecoration = TextDecoration.Underline,
        )
    }
}

@Preview
@Composable
private fun PersonalScreenPreview() {
    AppTheme {
        PersonalScreen()
    }
}

@Preview
@Composable
private fun InfoCardPreview() {
    AppTheme {
        Box(modifier = Modifier.padding(4.dp)) {
            InfoCard {
                Text("Beispieltext in einer InfoCard")
            }
        }
    }
}

@Preview
@Composable
private fun LabeledLinePreview() {
    AppTheme {
        Box(modifier = Modifier.padding(4.dp)) {
            LabeledLine(label = "E-Mail", value = "leoruland@web.de")
        }
    }
}
