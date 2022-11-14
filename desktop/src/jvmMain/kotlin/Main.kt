import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ir.mmd.apps.common.App


fun main() = application {
	Window(onCloseRequest = ::exitApplication) {
		App()
	}
}
