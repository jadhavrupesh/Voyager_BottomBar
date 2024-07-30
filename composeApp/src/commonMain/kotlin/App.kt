import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import org.jetbrains.compose.ui.tooling.preview.Preview
import ui.base_app.BaseApp
import utils.DeepRedColorSchema
import utils.OrangeColorSchema
import utils.PinkSoftColorSchema
import utils.PlantShopColorSchema

@Composable
@Preview
fun App() {
    MaterialTheme(
//        colorScheme = PinkSoftColorSchema().pinkSoftColorScheme
//        colorScheme = PlantShopColorSchema().planterShopColorScheme
//        colorScheme = OrangeColorSchema().orangeColorSchema
        colorScheme = DeepRedColorSchema().deepRedColorScheme
    ) {
        Navigator(screen = BaseApp(0)) { navigator ->
            SlideTransition(navigator = navigator)
        }
    }
}