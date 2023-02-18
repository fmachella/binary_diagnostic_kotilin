package com.adventofcode.duemilaventuno

import org.junit.jupiter.api.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ParserTest {
    val parser = BeaconParser()

    @Test
    fun `no beacons`() {
        val noBeacons = ""
        val beacons = parser.parse(noBeacons)
        assertTrue(beacons.isEmpty())
    }
    @Test
    fun `one beacons`() {
        val aBeacon = "001100100001"
        val beacons = parser.parse(aBeacon)
        assertEquals(1,beacons.size)
        assertContains(beacons, Beacon(0,0,1,1,0,0,1,0,0,0,0,1))
    }
    @Test
    fun `more beacons`() {
        val twoBeacons = "001100100001\n" +
                "001110011011\n" +
                "001110011011"
        val beacons = parser.parse(twoBeacons)
        assertEquals(3,beacons.size)
        assertContains(beacons, Beacon(0,0,1,1,0,0,1,0,0,0,0,1))
        assertContains(beacons, Beacon(0,0,1,1,1,0,0,1,1,0,1,1))
        assertContains(beacons, Beacon(0,0,1,1,1,0,0,1,1,0,1,1))
    }
}

