package idv.chauyan.dagger_boilerplate.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import idv.chauyan.dagger_boilerplate.ui.main.MainActivity

@Module
abstract class AltMainActivityModule {
    @ContributesAndroidInjector(
        //modules to install into the subcomponent
        modules = []
    )
    internal abstract fun contributeYourAndroidInjector(): MainActivity
}