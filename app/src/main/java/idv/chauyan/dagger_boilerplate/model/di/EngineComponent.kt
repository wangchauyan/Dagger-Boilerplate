package idv.chauyan.dagger_boilerplate.model.di

import idv.chauyan.dagger_boilerplate.model.iface.Engine

interface EngineComponent {
    fun engine(): Engine
}