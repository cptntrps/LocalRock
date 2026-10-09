package com.kodraliu.localrock.shared.webrtc

/** No WebRTC stack is bundled for desktop yet; the UI hides live view. */
actual val liveViewSupported: Boolean = false

actual fun createRtcPeer(iceServers: List<RtcIceServer>): RtcPeer =
    throw UnsupportedOperationException("Camera live view is not available on desktop")
