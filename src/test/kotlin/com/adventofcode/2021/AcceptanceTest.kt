package com.adventofcode.`2021`

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AcceptanceTest {

    @Test
    @Disabled
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
    fun report(): Short {
        return 0
    }

    fun registerBeacons(diagnosticBits: String) {
        TODO("Not yet implemented")
    }

}
