package com.kodraliu.localrock

import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import com.kodraliu.localrock.shared.AppContainer
import com.russhwolf.settings.PreferencesSettings
import java.util.prefs.Preferences

fun main() {
    val container = AppContainer(PreferencesSettings(Preferences.userRoot().node("com/kodraliu/localrock")))
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "LocalRock",
            state = WindowState(size = DpSize(480.dp, 900.dp)),
        ) {
            App(container)
        }
    }
}
