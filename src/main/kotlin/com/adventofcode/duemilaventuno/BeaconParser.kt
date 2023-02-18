package com.adventofcode.duemilaventuno

class BeaconParser {
    fun parse(beacons: String): List<Beacon> {
        return beacons.split("\n")
            .filter { it.isNotBlank() }
            .map { rawBeacon -> rawBeacon.split("").filter { it.isNotBlank() }.map { it.toShort() } }
            .map { it.toTypedArray() }
            .map { Beacon(it) }
    }
}