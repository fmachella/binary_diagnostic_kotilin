package com.adventofcode.duemilaventuno

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
        return beaconsPerColum
            .map { calculateGammaBit(it) }
            .joinToString("") { it.toString() }
            .toShort(2)
    }

    private fun calculateGammaBit(positionalSignal: MutableList<Short>): Short {
        val zeroes = positionalSignal.filter { it == 0.toShort() }.size
        val ones = positionalSignal.size - zeroes
        return if (zeroes > ones) 0.toShort() else 1.toShort()
    }

    fun calculateEpsilon(): Short {
        return beaconsPerColum
            .map { calculateGammaBit(it) }
            .map { invert(it) }
            .joinToString("") { it.toString() }
            .toShort(2)
    }

    private fun invert(it: Short) = if (it == 0.toShort()) 1 else 0

}