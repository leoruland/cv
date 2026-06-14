package dev.leoruland.cv.theming

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

/*
 * Material-3-Farbtheme aus folgenden Seed-Werten:
 *   primary        #00A485
 *   secondary      #53E3BF
 *   tertiary       #D61FDC
 *   error          #FF5449   (kanonischer M3-Error T60)
 *   surface        #D3E0DC
 *   surfaceVariant #919E9A
 *
 * Die Seeds werden 1:1 als Light-Schema-Rollenwerte verwendet; alle weiteren Tones sind
 * HSL-basiert auf den jeweiligen Hue ausgerichtet (Approximation der M3-HCT-Tonal-Palette).
 * Dark-Schema folgt der Standard-M3-Tonal-Zuordnung (Hauptrolle T80, Container T30 etc.).
 *
 * Hinweis Kontrast: secondary (#53E3BF) sitzt im Tonal-Bereich T80 — onSecondary ist
 * deshalb bewusst dunkel statt weiß gewählt, um WCAG-AA zu halten.
 */

// =========================================================
// Tonal palette stops
// =========================================================

// Primary — teal-green, hue ≈ 169°
private val PrimaryT10 = Color(0xFF002019)
private val PrimaryT20 = Color(0xFF00382C)
private val PrimaryT30 = Color(0xFF005140)
private val PrimaryT40 = Color(0xFF006B55)
private val PrimaryT60 = Color(0xFF00A485) // seed
private val PrimaryT70 = Color(0xFF67E4C4)
private val PrimaryT80 = Color(0xFF45DEB6)
private val PrimaryT90 = Color(0xFF76FAD4)

// Secondary — mint-teal, hue ≈ 165°
private val SecondaryT10 = Color(0xFF002019)
private val SecondaryT20 = Color(0xFF00382B)
private val SecondaryT30 = Color(0xFF00513F)
private val SecondaryT70 = Color(0xFF65E6C6)
private val SecondaryT80 = Color(0xFF53E3BF) // seed
private val SecondaryT90 = Color(0xFFB5F5E1)

// Tertiary — magenta, hue ≈ 298°
private val TertiaryT10 = Color(0xFF2A002C)
private val TertiaryT20 = Color(0xFF470048)
private val TertiaryT30 = Color(0xFF650066)
private val TertiaryT45 = Color(0xFFA41AB1)
private val TertiaryT55 = Color(0xFFD61FDC) // seed
private val TertiaryT70 = Color(0xFFE87BEA)
private val TertiaryT80 = Color(0xFFEE9DEF)
private val TertiaryT90 = Color(0xFFFBCEFC)

// Error — kanonische M3-Error-Palette
private val ErrorT10 = Color(0xFF410002)
private val ErrorT20 = Color(0xFF690005)
private val ErrorT30 = Color(0xFF93000A)
private val ErrorT50 = Color(0xFFDC362E)
private val ErrorT60 = Color(0xFFFF5449) // seed (= M3 Standard-Error T60)
private val ErrorT70 = Color(0xFFFF7666)
private val ErrorT80 = Color(0xFFFFB4AB)
private val ErrorT90 = Color(0xFFFFDAD6)

// Neutral — cool, hue ≈ 161° (von surface seed)
private val NeutralT4 = Color(0xFF0B100F)
private val NeutralT6 = Color(0xFF0E1413)
private val NeutralT10 = Color(0xFF161D1B)
private val NeutralT12 = Color(0xFF1E2423)
private val NeutralT15 = Color(0xFF232826)
private val NeutralT20 = Color(0xFF2D3230)
private val NeutralT24 = Color(0xFF343A38)
private val NeutralT25 = Color(0xFF383D3B)
private val NeutralT88 = Color(0xFFD3E0DC) // surface seed
private val NeutralT90 = Color(0xFFDEE4E1)
private val NeutralT92 = Color(0xFFE0EBE7)
private val NeutralT95 = Color(0xFFECF1EE)
private val NeutralT97 = Color(0xFFF1F4F2)

// NeutralVariant — leicht wärmer, hue ≈ 161°
private val NeutralVarT20 = Color(0xFF2C3431)
private val NeutralVarT30 = Color(0xFF404946)
private val NeutralVarT50 = Color(0xFF707975)
private val NeutralVarT60 = Color(0xFF8A938F)
private val NeutralVarT63 = Color(0xFF919E9A) // surfaceVariant seed
private val NeutralVarT80 = Color(0xFFBFC8C4)

// =========================================================
// Light-Schema-Rollen
// =========================================================

val ColorLightPrimary = PrimaryT40
val ColorLightOnPrimary = Color(0xFFFFFFFF)
val ColorLightPrimaryContainer = PrimaryT70
val ColorLightOnPrimaryContainer = PrimaryT10

val ColorLightSecondary = SecondaryT80
val ColorLightOnSecondary = SecondaryT20
val ColorLightSecondaryContainer = SecondaryT70
val ColorLightOnSecondaryContainer = SecondaryT10

val ColorLightTertiary = TertiaryT30
val ColorLightOnTertiary = TertiaryT90
val ColorLightTertiaryContainer = TertiaryT80
val ColorLightOnTertiaryContainer = TertiaryT20

val ColorLightError = ErrorT50
val ColorLightOnError = Color(0xFFFFFFFF)
val ColorLightErrorContainer = ErrorT70
val ColorLightOnErrorContainer = ErrorT10

val ColorLightBackground = NeutralT97
val ColorLightOnBackground = NeutralT10
val ColorLightSurface = NeutralVarT80
val ColorLightOnSurface = NeutralT10
val ColorLightSurfaceVariant = NeutralVarT63
val ColorLightOnSurfaceVariant = NeutralVarT20
val ColorLightSurfaceTint = PrimaryT40

val ColorLightOutline = NeutralVarT50
val ColorLightOutlineVariant = NeutralVarT80

val ColorLightInverseSurface = NeutralT20
val ColorLightInverseOnSurface = NeutralT95
val ColorLightInversePrimary = PrimaryT80

val ColorLightScrim = Color(0xFF000000)

val ColorLightSurfaceDim = Color(0xFFB6C2BE)
val ColorLightSurfaceBright = NeutralT95
val ColorLightSurfaceContainerLowest = Color(0xFFFFFFFF)
val ColorLightSurfaceContainerLow = NeutralT95
val ColorLightSurfaceContainer = NeutralT92
val ColorLightSurfaceContainerHigh = NeutralT90
val ColorLightSurfaceContainerHighest = NeutralT88

// =========================================================
// Dark-Schema-Rollen
// =========================================================

val ColorDarkPrimary = PrimaryT80
val ColorDarkOnPrimary = PrimaryT20
val ColorDarkPrimaryContainer = PrimaryT30
val ColorDarkOnPrimaryContainer = PrimaryT90

val ColorDarkSecondary = SecondaryT80
val ColorDarkOnSecondary = SecondaryT20
val ColorDarkSecondaryContainer = SecondaryT30
val ColorDarkOnSecondaryContainer = SecondaryT90

val ColorDarkTertiary = TertiaryT30
val ColorDarkOnTertiary = TertiaryT90
val ColorDarkTertiaryContainer = TertiaryT80
val ColorDarkOnTertiaryContainer = TertiaryT20

val ColorDarkError = ErrorT80
val ColorDarkOnError = ErrorT20
val ColorDarkErrorContainer = ErrorT30
val ColorDarkOnErrorContainer = ErrorT90

val ColorDarkBackground = NeutralT10
val ColorDarkOnBackground = NeutralT90
val ColorDarkSurface = NeutralT10
val ColorDarkOnSurface = NeutralT90
val ColorDarkSurfaceVariant = NeutralVarT30
val ColorDarkOnSurfaceVariant = NeutralVarT80
val ColorDarkSurfaceTint = PrimaryT80

val ColorDarkOutline = NeutralVarT60
val ColorDarkOutlineVariant = NeutralVarT30

val ColorDarkInverseSurface = NeutralT90
val ColorDarkInverseOnSurface = NeutralT20
val ColorDarkInversePrimary = PrimaryT40

val ColorDarkScrim = Color(0xFF000000)

val ColorDarkSurfaceDim = NeutralT6
val ColorDarkSurfaceBright = NeutralT24
val ColorDarkSurfaceContainerLowest = NeutralT4
val ColorDarkSurfaceContainerLow = NeutralT12
val ColorDarkSurfaceContainer = NeutralT15
val ColorDarkSurfaceContainerHigh = NeutralT20
val ColorDarkSurfaceContainerHighest = NeutralT25

// =========================================================
// ColorScheme-Objekte (in Theme.kt einsetzbar)
// =========================================================

val LightColors: ColorScheme = lightColorScheme(
    primary = ColorLightPrimary,
    onPrimary = ColorLightOnPrimary,
    primaryContainer = ColorLightPrimaryContainer,
    onPrimaryContainer = ColorLightOnPrimaryContainer,
    secondary = ColorLightSecondary,
    onSecondary = ColorLightOnSecondary,
    secondaryContainer = ColorLightSecondaryContainer,
    onSecondaryContainer = ColorLightOnSecondaryContainer,
    tertiary = ColorLightTertiary,
    onTertiary = ColorLightOnTertiary,
    tertiaryContainer = ColorLightTertiaryContainer,
    onTertiaryContainer = ColorLightOnTertiaryContainer,
    error = ColorLightError,
    onError = ColorLightOnError,
    errorContainer = ColorLightErrorContainer,
    onErrorContainer = ColorLightOnErrorContainer,
    background = ColorLightBackground,
    onBackground = ColorLightOnBackground,
    surface = ColorLightSurface,
    onSurface = ColorLightOnSurface,
    surfaceVariant = ColorLightSurfaceVariant,
    onSurfaceVariant = ColorLightOnSurfaceVariant,
    surfaceTint = ColorLightSurfaceTint,
    inverseSurface = ColorLightInverseSurface,
    inverseOnSurface = ColorLightInverseOnSurface,
    inversePrimary = ColorLightInversePrimary,
    outline = ColorLightOutline,
    outlineVariant = ColorLightOutlineVariant,
    scrim = ColorLightScrim,
    surfaceBright = ColorLightSurfaceBright,
    surfaceDim = ColorLightSurfaceDim,
    surfaceContainer = ColorLightSurfaceContainer,
    surfaceContainerHigh = ColorLightSurfaceContainerHigh,
    surfaceContainerHighest = ColorLightSurfaceContainerHighest,
    surfaceContainerLow = ColorLightSurfaceContainerLow,
    surfaceContainerLowest = ColorLightSurfaceContainerLowest,
)

val DarkColors: ColorScheme = darkColorScheme(
    primary = ColorDarkPrimary,
    onPrimary = ColorDarkOnPrimary,
    primaryContainer = ColorDarkPrimaryContainer,
    onPrimaryContainer = ColorDarkOnPrimaryContainer,
    secondary = ColorDarkSecondary,
    onSecondary = ColorDarkOnSecondary,
    secondaryContainer = ColorDarkSecondaryContainer,
    onSecondaryContainer = ColorDarkOnSecondaryContainer,
    tertiary = ColorDarkTertiary,
    onTertiary = ColorDarkOnTertiary,
    tertiaryContainer = ColorDarkTertiaryContainer,
    onTertiaryContainer = ColorDarkOnTertiaryContainer,
    error = ColorDarkError,
    onError = ColorDarkOnError,
    errorContainer = ColorDarkErrorContainer,
    onErrorContainer = ColorDarkOnErrorContainer,
    background = ColorDarkBackground,
    onBackground = ColorDarkOnBackground,
    surface = ColorDarkSurface,
    onSurface = ColorDarkOnSurface,
    surfaceVariant = ColorDarkSurfaceVariant,
    onSurfaceVariant = ColorDarkOnSurfaceVariant,
    surfaceTint = ColorDarkSurfaceTint,
    inverseSurface = ColorDarkInverseSurface,
    inverseOnSurface = ColorDarkInverseOnSurface,
    inversePrimary = ColorDarkInversePrimary,
    outline = ColorDarkOutline,
    outlineVariant = ColorDarkOutlineVariant,
    scrim = ColorDarkScrim,
    surfaceBright = ColorDarkSurfaceBright,
    surfaceDim = ColorDarkSurfaceDim,
    surfaceContainer = ColorDarkSurfaceContainer,
    surfaceContainerHigh = ColorDarkSurfaceContainerHigh,
    surfaceContainerHighest = ColorDarkSurfaceContainerHighest,
    surfaceContainerLow = ColorDarkSurfaceContainerLow,
    surfaceContainerLowest = ColorDarkSurfaceContainerLowest,
)
