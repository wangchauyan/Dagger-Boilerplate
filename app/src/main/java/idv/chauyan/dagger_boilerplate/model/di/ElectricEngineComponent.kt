package idv.chauyan.dagger_boilerplate.model.di

import dagger.Component
import idv.chauyan.dagger_boilerplate.model.di.module.ElectricEngineModule

@Component(
    modules = [
        ElectricEngineModule::class
    ]
)
interface ElectricEngineComponent: EngineComponent