package eu.kanade.tachiyomi.animesource.di

import android.app.Application
import eu.kanade.tachiyomi.animesource.online.Dependencies
import uy.kohesive.injekt.api.InjektModule
import uy.kohesive.injekt.api.InjektRegistrar
import uy.kohesive.injekt.api.addSingleton

object DiModule : InjektModule {

    override fun InjektRegistrar.registerInjectables() {
        addSingleton(Dependencies.getContext() as Application)
        addSingleton(Dependencies.getJson())
    }
}