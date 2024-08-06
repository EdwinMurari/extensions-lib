package eu.kanade.tachiyomi.animesource.online

import eu.kanade.tachiyomi.network.NetworkHelper

object AnimeHttpSourceDependencies {

    private lateinit var networkHelperProvider: () -> NetworkHelper

    fun setNetworkHelperProvider(provider: () -> NetworkHelper) {
        networkHelperProvider = provider
    }

    fun getNetworkHelper(): NetworkHelper = networkHelperProvider.invoke()
}