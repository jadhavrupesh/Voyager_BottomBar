import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.base_app.BaseApp
import utils.CustomColorTokens
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
@Preview
fun App() {
    val isDarkTheme = isSystemInDarkTheme()
    val colorScheme = remember { mutableStateOf(cashbackLightColorScheme) }
    LaunchedEffect(true) {
        colorScheme.value =
            if (isDarkTheme) {
                cashbackDarkColorScheme
            } else {
                cashbackLightColorScheme
            }
    }

    // Choose the color scheme based on the current theme

    MaterialTheme(
        colorScheme = colorScheme.value
    ) {
        Navigator(screen = BaseApp(0)) { navigator ->
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

val cashbackLightColorScheme = lightColorScheme(
    primary = Color(0xFFD96336),           // Darker orange for selected category
    onPrimary = Color.White,               // Text color on primary (white)

    primaryContainer = Color(0xFFF3B89F),  // Lighter orange for unselected category
    onPrimaryContainer = Color(0xFF3D3D3D),// Text color for unselected category

    secondary = Color(0xFF212121),         // Black for CTA button
    onSecondary = Color.White,             // Text color on secondary (white)

    secondaryContainer = Color(0xFF9E9E9E),// Gray for disabled/unselected states
    onSecondaryContainer = Color(0xFF3D3D3D), // Text on secondary container (dark)

    background = Color(0xFFFFF7E7),        // Light cream background
    onBackground = Color(0xFF3D3D3D),      // Text color on background

    surface = Color(0xFFF3B89F),           // Lighter orange surface color (category chips)
    onSurface = Color(0xFF3D3D3D),         // Text on surface (chips text)

    surfaceVariant = Color(0xFFEFEFEF),    // A lighter variant for surfaces
    onSurfaceVariant = Color(0xFF9E9E9E),  // Text color for disabled items on surface variant

    error = Color(0xFFB00020),             // Standard error color (deep red)
    onError = Color.White,                 // Text color on error

    errorContainer = Color(0xFFFCD8DF),    // Error background container (light pinkish red)
    onErrorContainer = Color(0xFFB00020),  // Error text color on the container

    outline = Color(0xFFB0BEC5),           // Border color for outlines (light gray-blue)
    outlineVariant = Color(0xFF9E9E9E),    // Outline variant color for secondary elements

    inversePrimary = Color(0xFFFFF7E7),    // Inverse of primary color for alternative backgrounds
    inverseOnSurface = Color(0xFFF3B89F),  // Light orange used on inverse surfaces

    scrim = Color.Black.copy(alpha = 0.32f) // For shadow overlays (e.g., when dialogs appear)
)

val cashbackDarkColorScheme = darkColorScheme(
    primary = Color(0xFFFF8C6A),           // Lighter orange for selected category in dark mode
    onPrimary = Color.Black,               // Text color on primary (black)

    primaryContainer = Color(0xFFFFBFA5),  // Slightly lighter orange for unselected category
    onPrimaryContainer = Color(0xFF1C1C1C), // Darker text color for unselected category

    secondary = Color(0xFFE0E0E0),         // Light gray for CTA button text
    onSecondary = Color(0xFF121212),       // Dark background on secondary

    secondaryContainer = Color(0xFF3A3A3A),// Dark gray for disabled/unselected states
    onSecondaryContainer = Color(0xFFE0E0E0), // Light text on secondary container

    background = Color(0xFF121212),        // Dark background
    onBackground = Color(0xFFE0E0E0),      // Light text color on background

    surface = Color(0xFFFFBFA5),           // Lighter orange surface color (category chips)
    onSurface = Color(0xFF1C1C1C),         // Dark text on surface (chips text)

    surfaceVariant = Color(0xFF3A3A3A),    // Dark surface variant for background elements
    onSurfaceVariant = Color(0xFFE0E0E0),  // Light text color on surface variant

    error = Color(0xFFFFB4A9),             // Light red for error
    onError = Color(0xFF690005),           // Dark text on error

    errorContainer = Color(0xFF93000A),    // Darker red for error container
    onErrorContainer = Color(0xFFFFB4A9),  // Light red text on error container

    outline = Color(0xFF8C8C8C),           // Gray for outlines (e.g., input borders)
    inversePrimary = Color(0xFF121212),    // Inverse of primary color (used for contrast)
    inverseOnSurface = Color(0xFFFFBFA5),  // Light orange on inverse surface

    scrim = Color.Black.copy(alpha = 0.6f) // Darker scrim for modal/shadow overlays
)
