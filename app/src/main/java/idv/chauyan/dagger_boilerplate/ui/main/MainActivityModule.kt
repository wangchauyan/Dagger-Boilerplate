package idv.chauyan.dagger_boilerplate.ui.main

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import idv.chauyan.dagger_boilerplate.ui.main.MainActivity
import idv.chauyan.dagger_boilerplate.ui.main.MainActivityComponent


@Module (subcomponents = [
    MainActivityComponent::class
])
abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    internal abstract fun bindMainActivityFactory(factory: MainActivityComponent.Factory): AndroidInjector.Factory<*>
}