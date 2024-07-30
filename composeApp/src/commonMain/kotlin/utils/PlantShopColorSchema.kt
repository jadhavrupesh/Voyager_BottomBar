package utils

import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

class PlantShopColorSchema {

    object PlanterShopColorTokens {
        val Primary = Color(0xFF0D7B5E)        // Dark Green
        val OnPrimary = Color.White
        val PrimaryContainer = Color(0xFFB3E5D3)  // Lighter Green
        val OnPrimaryContainer = Color(0xFF00382F)

        val Secondary = Color(0xFFFFD700)      // Yellow
        val OnSecondary = Color.Black
        val SecondaryContainer = Color(0xFFFFF9B3) // Light Yellow
        val OnSecondaryContainer = Color(0xFF3F3700)

        val Background = Color(0xFF00261C)     // Dark Green Background
        val OnBackground = Color.White

        val Surface = Color.White
        val OnSurface = Color.Black
        val SurfaceVariant = Color(0xFFF0F0F0) // Light Grey
        val OnSurfaceVariant = Color(0xFF3F3F3F)

        val Error = Color(0xFFB00020)          // Red
        val OnError = Color.White
        val ErrorContainer = Color(0xFFFFD7D7) // Light Red
        val OnErrorContainer = Color(0xFF680003)

        val Outline = Color(0xFF757575)        // Grey
        val OutlineVariant = Color(0xFFBDBDBD)

        val Scrim = Color(0xFF000000)
        val SurfaceBright = Color(0xFFF4F4F4)
        val SurfaceContainer = Color(0xFFE0E0E0)
        val SurfaceContainerHigh = Color(0xFFC0C0C0)
        val SurfaceContainerHighest = Color(0xFFA0A0A0)
        val SurfaceContainerLow = Color(0xFFD0D0D0)
        val SurfaceContainerLowest = Color(0xFFE0E0E0)
        val SurfaceDim = Color(0xFFB0B0B0)
    }

    val planterShopColorScheme = lightColorScheme(
        primary = PlanterShopColorTokens.Primary,
        onPrimary = PlanterShopColorTokens.OnPrimary,
        primaryContainer = PlanterShopColorTokens.PrimaryContainer,
        onPrimaryContainer = PlanterShopColorTokens.OnPrimaryContainer,
        inversePrimary = PlanterShopColorTokens.OnPrimary,

        secondary = PlanterShopColorTokens.Secondary,
        onSecondary = PlanterShopColorTokens.OnSecondary,
        secondaryContainer = PlanterShopColorTokens.SecondaryContainer,
        onSecondaryContainer = PlanterShopColorTokens.OnSecondaryContainer,

        tertiary = PlanterShopColorTokens.Primary,  // Reusing primary as no tertiary color provided
        onTertiary = PlanterShopColorTokens.OnPrimary,
        tertiaryContainer = PlanterShopColorTokens.PrimaryContainer,
        onTertiaryContainer = PlanterShopColorTokens.OnPrimaryContainer,

        background = PlanterShopColorTokens.Background,
        onBackground = PlanterShopColorTokens.OnBackground,

        surface = PlanterShopColorTokens.Surface,
        onSurface = PlanterShopColorTokens.OnSurface,
        surfaceVariant = PlanterShopColorTokens.SurfaceVariant,
        onSurfaceVariant = PlanterShopColorTokens.OnSurfaceVariant,
        surfaceTint = PlanterShopColorTokens.Primary,

        inverseSurface = PlanterShopColorTokens.SurfaceContainer,
        inverseOnSurface = PlanterShopColorTokens.OnSurfaceVariant,

        error = PlanterShopColorTokens.Error,
        onError = PlanterShopColorTokens.OnError,
        errorContainer = PlanterShopColorTokens.ErrorContainer,
        onErrorContainer = PlanterShopColorTokens.OnErrorContainer,

        outline = PlanterShopColorTokens.Outline,
        outlineVariant = PlanterShopColorTokens.OutlineVariant,

        scrim = PlanterShopColorTokens.Scrim,
        surfaceBright = PlanterShopColorTokens.SurfaceBright,
        surfaceContainer = PlanterShopColorTokens.SurfaceContainer,
        surfaceContainerHigh = PlanterShopColorTokens.SurfaceContainerHigh,
        surfaceContainerHighest = PlanterShopColorTokens.SurfaceContainerHighest,
        surfaceContainerLow = PlanterShopColorTokens.SurfaceContainerLow,
        surfaceContainerLowest = PlanterShopColorTokens.SurfaceContainerLowest,
        surfaceDim = PlanterShopColorTokens.SurfaceDim,
    )
}

