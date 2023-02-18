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
}

class Probe(signalsPerBeacons: Int) {
    private val beaconsPerColum: Array<MutableList<Short>> =
        arrayOf(mutableListOf(),
            mutableListOf(),
            mutableListOf(),
            mutableListOf(),
            mutableListOf())

    fun register(beacons: List<Beacon>) {
        beaconsPerColum[0].addAll(beacons.map { it.elementAt(0) })
        beaconsPerColum[1].addAll(beacons.map { it.elementAt(1) })
        beaconsPerColum[2].addAll(beacons.map { it.elementAt(2) })
        beaconsPerColum[3].addAll(beacons.map { it.elementAt(3) })
        beaconsPerColum[4].addAll(beacons.map { it.elementAt(4) })
    }

    fun calculateGamma(): Short {
        return beaconsPerColum.map { calculateGammaBit(it) }
            .joinToString("") { it.toString() }
            .toShort(2)
    }

    private fun calculateGammaBit(positionalSignal: MutableList<Short>): Short {
        val zeroes = positionalSignal.filter { it == 0.toShort() }.size
        val ones = positionalSignal.size - zeroes
        return if (zeroes > ones) 0.toShort() else 1.toShort()
    }

    fun calculateEpsilon(): Short {
        return beaconsPerColum.map { calculateGammaBit(it) }
            .map { if (it == 0.toShort()) 1 else 0 }
            .joinToString("") { it.toString() }
            .toShort(2)
    }

}
