package idv.chauyan.dagger_boilerplate.di

import dagger.Module
import dagger.Provides
import idv.chauyan.dagger_boilerplate.model.Car
import idv.chauyan.dagger_boilerplate.ui.main.MainActivityComponent

@Module
class ResourceModule {
    @Provides
    fun provideCar(): Car = Car()
}