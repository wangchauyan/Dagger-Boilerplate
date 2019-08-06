package idv.chauyan.dagger_boilerplate.ui.main

import dagger.Subcomponent
import dagger.android.AndroidInjector
import idv.chauyan.dagger_boilerplate.ui.main.MainActivity


@Subcomponent
interface MainActivityComponent: AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<MainActivity>
}