package eu.kanade.tachiyomi.animesource.di

import android.app.Application
import android.content.Context
import eu.kanade.tachiyomi.network.NetworkHelper
import kotlinx.serialization.json.Json
import uy.kohesive.injekt.Injekt
import uy.kohesive.injekt.api.InjektModule
import uy.kohesive.injekt.api.InjektRegistrar
import uy.kohesive.injekt.api.addSingleton

interface ExtensionLibDependency {
    val networkHelper: NetworkHelper
    val context: Context
    val json: Json
}

class ExtensionLibDependencyProvider(
    private val dependency: ExtensionLibDependency
) : InjektModule {

    init {
        Injekt.importModule(this)
    }

    override fun InjektRegistrar.registerInjectables() {
        addSingleton(dependency.context as Application)
        addSingleton(dependency.json)
        addSingleton(dependency.networkHelper)
    }
}