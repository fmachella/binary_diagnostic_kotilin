package com.adventofcode.duemilaventuno

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class AcceptanceTest {

    @Test
    internal fun acceptance() {
        val diagnosticBits =    "00100\n" +
                                "11110\n" +
                                "10110\n" +
                                "10111\n" +
                                "10101\n" +
                                "01111\n" +
                                "00111\n" +
                                "11100\n" +
                                "10000\n" +
                                "11001\n" +
                                "00010\n" +
                                "01010\n"

        val diag = Diagnostic()

        diag.registerBeacons(diagnosticBits)
        val power = diag.report()

        assertEquals(198,power)
    }
}

class Diagnostic {
    private var probe: Probe = Probe(5)
    private var parser: BeaconParser = BeaconParser()

    fun report(): Int {
        return probe.calculatePowerIndex()
    }

    fun registerBeacons(diagnosticBits: String) {
        probe.register(parser.parse(diagnosticBits))
    }

}
