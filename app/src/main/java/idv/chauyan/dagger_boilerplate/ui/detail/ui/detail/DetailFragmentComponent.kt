package idv.chauyan.dagger_boilerplate.ui.detail.ui.detail

import dagger.android.AndroidInjector
import dagger.Subcomponent
import idv.chauyan.dagger_boilerplate.ui.detail.ui.detail.DetailFragment


@Subcomponent
internal interface DetailFragmentComponent : AndroidInjector<DetailFragment> {
    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<DetailFragment>
}