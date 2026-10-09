package com.kodraliu.localrock.shared.webrtc

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
actual fun RtcVideoView(peer: RtcPeer, modifier: Modifier) {
    Box(modifier, contentAlignment = Alignment.Center) {
        Text("Camera live view is not available on desktop")
    }
}
