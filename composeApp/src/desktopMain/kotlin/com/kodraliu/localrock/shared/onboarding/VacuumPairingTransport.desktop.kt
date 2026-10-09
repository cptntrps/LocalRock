package com.kodraliu.localrock.shared.onboarding

/** Desktop cannot join the robot's Wi-Fi access point, so pairing is hidden (vacuumPairingSupported = false). */
actual class VacuumPairingTransport internal constructor() : AutoCloseable {
    actual suspend fun joinVacuumWifi(ssidPrefix: String, timeoutMs: Long) {
        throw VacuumPairingException("Wi-Fi pairing is not supported on desktop")
    }

    actual suspend fun sendUdp(host: String, port: Int, data: ByteArray) {
        throw VacuumPairingException("Wi-Fi pairing is not supported on desktop")
    }

    actual suspend fun receiveUdp(timeoutMs: Long): ByteArray? = null

    actual override fun close() {}
}

actual fun createVacuumPairingTransport(): VacuumPairingTransport = VacuumPairingTransport()

actual val vacuumPairingSupported: Boolean = false
