package utils

import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

class PinkSoftColorSchema {

    object PinkSoftColorTokens {
        val Primary = Color(0xFFFAD1D2)        // Soft Pink
        val OnPrimary = Color.Black
        val PrimaryContainer = Color(0xFFFEE0E1)  // Slightly darker pink for container
        val OnPrimaryContainer = Color(0xFF4D0001) // Darker color for contrast

        val Secondary = Color(0xFFECEFF1)      // Light Grey for secondary elements
        val OnSecondary = Color.Black
        val SecondaryContainer = Color(0xFFDADFE1) // Slightly darker grey for container
        val OnSecondaryContainer = Color(0xFF1B1C1D) // Darker color for contrast

        val Background = Color.White           // White background
        val OnBackground = Color.Black

        val Surface = Color(0xFFECEFF1)        // Light grey surface
        val OnSurface = Color.Black
        val SurfaceVariant = Color(0xFFF5F5F5) // Very light grey for variants
        val OnSurfaceVariant = Color(0xFF4F4F4F)

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


    val pinkSoftColorScheme = lightColorScheme(
        primary = PinkSoftColorTokens.Primary,
        onPrimary = PinkSoftColorTokens.OnPrimary,
        primaryContainer = PinkSoftColorTokens.PrimaryContainer,
        onPrimaryContainer = PinkSoftColorTokens.OnPrimaryContainer,
        inversePrimary = PinkSoftColorTokens.OnPrimary,

        secondary = PinkSoftColorTokens.Secondary,
        onSecondary = PinkSoftColorTokens.OnSecondary,
        secondaryContainer = PinkSoftColorTokens.SecondaryContainer,
        onSecondaryContainer = PinkSoftColorTokens.OnSecondaryContainer,

        tertiary = PinkSoftColorTokens.Secondary,  // Reusing secondary as no tertiary color provided
        onTertiary = PinkSoftColorTokens.OnSecondary,
        tertiaryContainer = PinkSoftColorTokens.SecondaryContainer,
        onTertiaryContainer = PinkSoftColorTokens.OnSecondaryContainer,

        background = PinkSoftColorTokens.Background,
        onBackground = PinkSoftColorTokens.OnBackground,

        surface = PinkSoftColorTokens.Surface,
        onSurface = PinkSoftColorTokens.OnSurface,
        surfaceVariant = PinkSoftColorTokens.SurfaceVariant,
        onSurfaceVariant = PinkSoftColorTokens.OnSurfaceVariant,
        surfaceTint = PinkSoftColorTokens.Primary,

        inverseSurface = PinkSoftColorTokens.SurfaceContainer,
        inverseOnSurface = PinkSoftColorTokens.OnSurfaceVariant,

        error = PinkSoftColorTokens.Error,
        onError = PinkSoftColorTokens.OnError,
        errorContainer = PinkSoftColorTokens.ErrorContainer,
        onErrorContainer = PinkSoftColorTokens.OnErrorContainer,

        outline = PinkSoftColorTokens.Outline,
        outlineVariant = PinkSoftColorTokens.OutlineVariant,

        scrim = PinkSoftColorTokens.Scrim,
        surfaceBright = PinkSoftColorTokens.SurfaceBright,
        surfaceContainer = PinkSoftColorTokens.SurfaceContainer,
        surfaceContainerHigh = PinkSoftColorTokens.SurfaceContainerHigh,
        surfaceContainerHighest = PinkSoftColorTokens.SurfaceContainerHighest,
        surfaceContainerLow = PinkSoftColorTokens.SurfaceContainerLow,
        surfaceContainerLowest = PinkSoftColorTokens.SurfaceContainerLowest,
        surfaceDim = PinkSoftColorTokens.SurfaceDim,
    )

}

