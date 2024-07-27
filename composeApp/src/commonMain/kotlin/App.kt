import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.base_app.BaseApp
import utils.CustomColorTokens

@Composable
@Preview
fun App() {
    MaterialTheme(
        colorScheme = colorScheme
    ) {
        Navigator(screen = BaseApp()) { navigator ->
            SlideTransition(navigator = navigator)
        }
    }
}

private val colorScheme = lightColorScheme(
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


private val customColorScheme = lightColorScheme(
    primary = Color(0xFF03A9F4), // Bright blue
    onPrimary = Color(0xFFFFFFFF), // White
    primaryContainer = Color(0xFF8BC34A), // Light green
    onPrimaryContainer = Color(0xFF000000), // Black
    inversePrimary = Color(0xFF6200EE), // Deep blue (not used in this scheme, but kept for consistency)
    secondary = Color(0xFFFFC107), // Vibrant orange-yellow
    onSecondary = Color(0xFF000000), // Black
    secondaryContainer = Color(0xFF8BC34A), // Light green
    onSecondaryContainer = Color(0xFF000000), // Black
    tertiary = Color(0xFF03A9F4), // Reusing primary as no tertiary color provided
    onTertiary = Color(0xFFFFFFFF), // White
    tertiaryContainer = Color(0xFF8BC34A), // Light green
    onTertiaryContainer = Color(0xFF000000), // Black
    background = Color(0xFFFFFFFF), // White
    onBackground = Color(0xFF000000), // Black
    surface = Color(0xFFF7F7F7), // Light gray
    onSurface = Color(0xFF000000), // Black
    surfaceVariant = Color(0xFF455A64), // Dark gray-blue
    onSurfaceVariant = Color(0xFFFFFFFF), // White
    surfaceTint = Color(0xFF03A9F4), // Bright blue
    inverseSurface = Color(0xFF000000), // Black
    inverseOnSurface = Color(0xFFFFFFFF), // White
    error = Color(0xFFB00020), // Error color (not defined in the original scheme, but added for consistency)
    onError = Color(0xFFFFFFFF), // White
    errorContainer = Color(0xFF8BC34A), // Light green
    onErrorContainer = Color(0xFF000000), // Black
    outline = Color(0xFF000000), // Black
    outlineVariant = Color(0xFF455A64), // Dark gray-blue
    scrim = Color(0xFF000000), // Black
    surfaceBright = Color(0xFFFFFFFF), // White
    surfaceContainer = Color(0xFF8BC34A), // Light green
    surfaceContainerHigh = Color(0xFF8BC34A), // Light green
    surfaceContainerHighest = Color(0xFF8BC34A), // Light green
    surfaceContainerLow = Color(0xFF8BC34A), // Light green
    surfaceContainerLowest = Color(0xFF8BC34A), // Light green
    surfaceDim = Color(0xFF455A64), // Dark gray-blue
)