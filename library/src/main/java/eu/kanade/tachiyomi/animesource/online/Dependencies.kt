package eu.kanade.tachiyomi.animesource.online

import android.content.Context
import eu.kanade.tachiyomi.network.NetworkHelper
import kotlinx.serialization.json.Json

object Dependencies {

    private lateinit var networkHelperProvider: () -> NetworkHelper
    private lateinit var contextProvider: () -> Context
    private lateinit var jsonProvider: () -> Json

    fun setNetworkHelperProvider(provider: () -> NetworkHelper) {
        networkHelperProvider = provider
    }

    fun setApplicationContext(provider: () -> Context) {
        contextProvider = provider
    }

    fun setJson(provider: () -> Json) {
        jsonProvider = provider
    }

    fun getNetworkHelper(): NetworkHelper = networkHelperProvider.invoke()

    internal fun getContext(): Context = contextProvider.invoke()

    internal fun getJson(): Json = jsonProvider.invoke()
}