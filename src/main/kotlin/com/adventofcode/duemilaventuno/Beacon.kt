package com.adventofcode.duemilaventuno

data class Beacon(private val i: Array<Short>) {
    constructor(vararg i: Short) : this(i.toTypedArray())

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Beacon

        if (!i.contentEquals(other.i)) return false

        return true
    }

    override fun hashCode(): Int {
        return i.contentHashCode()
    }

    fun elementAt(position: Int): Short{
        return this.i.get(position)
    }
}