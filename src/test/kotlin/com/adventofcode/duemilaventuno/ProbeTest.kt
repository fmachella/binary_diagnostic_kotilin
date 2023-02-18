package com.adventofcode.duemilaventuno

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ProbeTest {


    @Test
    internal fun `calculate gamma`() {
        val beacons = listOf(
            Beacon(0, 0, 1, 0, 0),
            Beacon(1, 1, 1, 1, 0),
            Beacon(1, 0, 1, 1, 0),
            Beacon(1, 0, 1, 1, 1),
            Beacon(1, 0, 1, 0, 1),
            Beacon(0, 1, 1, 1, 1),
            Beacon(0, 0, 1, 1, 1),
            Beacon(1, 1, 1, 0, 0),
            Beacon(1, 0, 0, 0, 0),
            Beacon(1, 1, 0, 0, 1),
            Beacon(0, 0, 0, 1, 0),
            Beacon(0, 1, 0, 1, 0)
        )

        val probe = Probe(5)
        probe.register(beacons)
        assertEquals(22.toShort(), probe.calculateGamma())
    }

    @Test
    @Disabled
    internal fun `gamma exception when no registered beacons`() {
        TODO("Not yet implemented")
    }

    @Test
    internal fun `calculate epsion`() {
        val beacons = listOf(
            Beacon(0, 0, 1, 0, 0),
            Beacon(1, 1, 1, 1, 0),
            Beacon(1, 0, 1, 1, 0),
            Beacon(1, 0, 1, 1, 1),
            Beacon(1, 0, 1, 0, 1),
            Beacon(0, 1, 1, 1, 1),
            Beacon(0, 0, 1, 1, 1),
            Beacon(1, 1, 1, 0, 0),
            Beacon(1, 0, 0, 0, 0),
            Beacon(1, 1, 0, 0, 1),
            Beacon(0, 0, 0, 1, 0),
            Beacon(0, 1, 0, 1, 0)
        )

        val probe = Probe(5)
        probe.register(beacons)
        assertEquals(9.toShort(), probe.calculateEpsilon())
    }

    @Test
    internal fun `calculate power index`() {
        val beacons = listOf(
            Beacon(0, 0, 1, 0, 0),
            Beacon(1, 1, 1, 1, 0),
            Beacon(1, 0, 1, 1, 0),
            Beacon(1, 0, 1, 1, 1),
            Beacon(1, 0, 1, 0, 1),
            Beacon(0, 1, 1, 1, 1),
            Beacon(0, 0, 1, 1, 1),
            Beacon(1, 1, 1, 0, 0),
            Beacon(1, 0, 0, 0, 0),
            Beacon(1, 1, 0, 0, 1),
            Beacon(0, 0, 0, 1, 0),
            Beacon(0, 1, 0, 1, 0)
        )

        val probe = Probe(5)
        probe.register(beacons)
        assertEquals(198, probe.calculatePowerIndex())
    }
}

