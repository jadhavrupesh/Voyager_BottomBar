package utils

import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

class DeepRedColorSchema {

    object DeepRedColorTokens {
        val Primary = Color(0xFFB71C1C)        // Deep Red
        val OnPrimary = Color.White
        val PrimaryContainer = Color(0xFFEF9A9A)  // Lighter Red for container
        val OnPrimaryContainer = Color(0xFFB71C1C) // Darker red for contrast

        val Secondary = Color(0xFFE0E0E0)      // Light Grey for secondary elements
        val OnSecondary = Color.Black
        val SecondaryContainer = Color(0xFFBDBDBD) // Slightly darker grey for container
        val OnSecondaryContainer = Color(0xFF212121) // Darker color for contrast

        val Background = Color(0xFFF5F5F5)     // Very light beige or off-white background
        val OnBackground = Color.Black

        val Surface = Color.White              // White surface
        val OnSurface = Color.Black
        val SurfaceVariant = Color(0xFFE0E0E0) // Light grey for variants
        val OnSurfaceVariant = Color(0xFF757575)

        val Error = Color(0xFFD32F2F)          // Red
        val OnError = Color.White
        val ErrorContainer = Color(0xFFEF9A9A) // Light Red
        val OnErrorContainer = Color(0xFFB71C1C)

        val Outline = Color(0xFFBDBDBD)        // Grey
        val OutlineVariant = Color(0xFF757575)

        val Scrim = Color(0xFF000000)
        val SurfaceBright = Color(0xFFF5F5F5)
        val SurfaceContainer = Color(0xFFE0E0E0)
        val SurfaceContainerHigh = Color(0xFFBDBDBD)
        val SurfaceContainerHighest = Color(0xFF9E9E9E)
        val SurfaceContainerLow = Color(0xFFD6D6D6)
        val SurfaceContainerLowest = Color(0xFFE0E0E0)
        val SurfaceDim = Color(0xFFB0B0B0)
    }

    val deepRedColorScheme = lightColorScheme(
        primary = DeepRedColorTokens.Primary,
        onPrimary = DeepRedColorTokens.OnPrimary,
        primaryContainer = DeepRedColorTokens.PrimaryContainer,
        onPrimaryContainer = DeepRedColorTokens.OnPrimaryContainer,
        inversePrimary = DeepRedColorTokens.OnPrimary,

        secondary = DeepRedColorTokens.Secondary,
        onSecondary = DeepRedColorTokens.OnSecondary,
        secondaryContainer = DeepRedColorTokens.SecondaryContainer,
        onSecondaryContainer = DeepRedColorTokens.OnSecondaryContainer,

        tertiary = DeepRedColorTokens.Secondary,  // Reusing secondary as no tertiary color provided
        onTertiary = DeepRedColorTokens.OnSecondary,
        tertiaryContainer = DeepRedColorTokens.SecondaryContainer,
        onTertiaryContainer = DeepRedColorTokens.OnSecondaryContainer,

        background = DeepRedColorTokens.Background,
        onBackground = DeepRedColorTokens.OnBackground,

        surface = DeepRedColorTokens.Surface,
        onSurface = DeepRedColorTokens.OnSurface,
        surfaceVariant = DeepRedColorTokens.SurfaceVariant,
        onSurfaceVariant = DeepRedColorTokens.OnSurfaceVariant,
        surfaceTint = DeepRedColorTokens.Primary,

        inverseSurface = DeepRedColorTokens.SurfaceContainer,
        inverseOnSurface = DeepRedColorTokens.OnSurfaceVariant,

        error = DeepRedColorTokens.Error,
        onError = DeepRedColorTokens.OnError,
        errorContainer = DeepRedColorTokens.ErrorContainer,
        onErrorContainer = DeepRedColorTokens.OnErrorContainer,

        outline = DeepRedColorTokens.Outline,
        outlineVariant = DeepRedColorTokens.OutlineVariant,

        scrim = DeepRedColorTokens.Scrim,
        surfaceBright = DeepRedColorTokens.SurfaceBright,
        surfaceContainer = DeepRedColorTokens.SurfaceContainer,
        surfaceContainerHigh = DeepRedColorTokens.SurfaceContainerHigh,
        surfaceContainerHighest = DeepRedColorTokens.SurfaceContainerHighest,
        surfaceContainerLow = DeepRedColorTokens.SurfaceContainerLow,
        surfaceContainerLowest = DeepRedColorTokens.SurfaceContainerLowest,
        surfaceDim = DeepRedColorTokens.SurfaceDim,
    )

}

