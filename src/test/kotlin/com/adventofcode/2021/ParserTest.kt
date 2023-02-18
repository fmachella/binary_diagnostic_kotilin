package com.adventofcode.`2021`

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ParserTest {

    @Test
    fun `no beacons`() {
        val noBeacons = ""
        val parser = BeaconParser()
        val beacons = parser.parse(noBeacons)
        assertTrue(beacons.isEmpty())
    }
    @Test
    fun `one beacons`() {
        TODO("Not yet implemented")
    }
    @Test
    fun `more beacons`() {
        TODO("Not yet implemented")
    }
}

class BeaconParser {
    fun parse(beacons: String): List<Beacon> {
        return emptyList()
    }

}

class Beacon {

}
