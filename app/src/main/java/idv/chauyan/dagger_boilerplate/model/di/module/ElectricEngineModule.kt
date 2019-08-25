package idv.chauyan.dagger_boilerplate.model.di.module

import dagger.Binds
import dagger.Module
import idv.chauyan.dagger_boilerplate.model.iface.Engine
import idv.chauyan.dagger_boilerplate.model.engine.ElectricEngine

@Module
abstract class ElectricEngineModule {
    @Binds
    abstract fun engine(engine: ElectricEngine): Engine
}