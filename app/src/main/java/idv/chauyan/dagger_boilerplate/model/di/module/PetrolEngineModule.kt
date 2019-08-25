package idv.chauyan.dagger_boilerplate.model.di.module

import dagger.Binds
import dagger.Module
import idv.chauyan.dagger_boilerplate.model.engine.PetrolEngine
import idv.chauyan.dagger_boilerplate.model.iface.Engine

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun engine(engine: PetrolEngine): Engine
}