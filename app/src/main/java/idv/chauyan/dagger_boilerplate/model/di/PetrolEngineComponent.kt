package idv.chauyan.dagger_boilerplate.model.di

import dagger.Component
import idv.chauyan.dagger_boilerplate.model.di.module.PetrolEngineModule

@Component(
    modules = [
        PetrolEngineModule::class
    ]
)
interface PetrolEngineComponent: EngineComponent