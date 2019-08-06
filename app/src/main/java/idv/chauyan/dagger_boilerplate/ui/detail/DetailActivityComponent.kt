package idv.chauyan.dagger_boilerplate.ui.detail

import dagger.Subcomponent
import dagger.android.AndroidInjector
import idv.chauyan.dagger_boilerplate.ui.detail.DetailActivity
import idv.chauyan.dagger_boilerplate.ui.detail.ui.detail.DetailFragmentModule


@Subcomponent (
    modules = [
        DetailFragmentModule::class
    ]
)
interface DetailActivityComponent: AndroidInjector<DetailActivity> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<DetailActivity>
}