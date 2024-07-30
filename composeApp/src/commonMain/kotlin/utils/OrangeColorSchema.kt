package utils

import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

class OrangeColorSchema {

    object CustomColorTokens {
        val Primary = Color(0xFFF89344)
        val OnPrimary = Color.White
        val PrimaryContainer = Color(0xFFFFD6A3)
        val OnPrimaryContainer = Color(0xFF8C3F00)
        val InversePrimary = Color(0xFF8C3F00)
        val Secondary = Color(0xFFFF642F)
        val OnSecondary = Color.White
        val SecondaryContainer = Color(0xFFFFB3A3)
        val OnSecondaryContainer = Color(0xFF8C2F00)
        val Background700 = Color(0xFF393A3A)
        val Background500 = Color(0xFF575959)
        val Background300 = Color(0xFFF4F4F4)
        val Error = Color(0xFFB00020)
        val OnError = Color.White
        val ErrorContainer = Color(0xFFFFD7D7)
        val OnErrorContainer = Color(0xFF680003)
        val Background = Background300
        val OnBackground = Color.Black
        val Surface = Background300
        val OnSurface = Color.Black
        val SurfaceVariant = Background500
        val OnSurfaceVariant = Color.Black
        val SurfaceTint = Primary
        val InverseSurface = Background500
        val InverseOnSurface = Color.White
        val Outline = Background700
        val OutlineVariant = Background500
        val Scrim = Background700
        val SurfaceBright = Background300
        val SurfaceContainer = Background700
        val SurfaceContainerHigh = Background500
        val SurfaceContainerHighest = Background700
        val SurfaceContainerLow = Background500
        val SurfaceContainerLowest = Background700
        val SurfaceDim = Background500
    }

    val orangeColorSchema = lightColorScheme(
        primary = CustomColorTokens.Primary,
        onPrimary = CustomColorTokens.OnPrimary,
        primaryContainer = CustomColorTokens.PrimaryContainer,
        onPrimaryContainer = CustomColorTokens.OnPrimaryContainer,
        inversePrimary = CustomColorTokens.InversePrimary,
        secondary = CustomColorTokens.Secondary,
        onSecondary = CustomColorTokens.OnSecondary,
        secondaryContainer = CustomColorTokens.SecondaryContainer,
        onSecondaryContainer = CustomColorTokens.OnSecondaryContainer,
        tertiary = CustomColorTokens.Primary,  // Reusing primary as no tertiary color provided
        onTertiary = CustomColorTokens.OnPrimary,
        tertiaryContainer = CustomColorTokens.PrimaryContainer,
        onTertiaryContainer = CustomColorTokens.OnPrimaryContainer,
        background = CustomColorTokens.Background,
        onBackground = CustomColorTokens.OnBackground,
        surface = CustomColorTokens.Surface,
        onSurface = CustomColorTokens.OnSurface,
        surfaceVariant = CustomColorTokens.SurfaceVariant,
        onSurfaceVariant = CustomColorTokens.OnSurfaceVariant,
        surfaceTint = CustomColorTokens.SurfaceTint,
        inverseSurface = CustomColorTokens.InverseSurface,
        inverseOnSurface = CustomColorTokens.InverseOnSurface,
        error = CustomColorTokens.Error,
        onError = CustomColorTokens.OnError,
        errorContainer = CustomColorTokens.ErrorContainer,
        onErrorContainer = CustomColorTokens.OnErrorContainer,
        outline = CustomColorTokens.Outline,
        outlineVariant = CustomColorTokens.OutlineVariant,
        scrim = CustomColorTokens.Scrim,
        surfaceBright = CustomColorTokens.SurfaceBright,
        surfaceContainer = CustomColorTokens.SurfaceContainer,
        surfaceContainerHigh = CustomColorTokens.SurfaceContainerHigh,
        surfaceContainerHighest = CustomColorTokens.SurfaceContainerHighest,
        surfaceContainerLow = CustomColorTokens.SurfaceContainerLow,
        surfaceContainerLowest = CustomColorTokens.SurfaceContainerLowest,
        surfaceDim = CustomColorTokens.SurfaceDim,
    )
}