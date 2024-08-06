package eu.kanade.tachiyomi.network

interface NetworkPreferences {

    fun verboseLogging(): Boolean

    fun dohProvider(): Int

    fun defaultUserAgent(): String
}
