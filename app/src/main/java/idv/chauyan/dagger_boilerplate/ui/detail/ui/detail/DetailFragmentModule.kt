package idv.chauyan.dagger_boilerplate.ui.detail.ui.detail

import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.Binds
import dagger.Module
import idv.chauyan.dagger_boilerplate.ui.detail.ui.detail.DetailFragment
import idv.chauyan.dagger_boilerplate.ui.detail.ui.detail.DetailFragmentComponent


@Module(subcomponents = [
        DetailFragmentComponent::class
    ]
)
internal abstract class DetailFragmentModule {
    @Binds
    @IntoMap
    @ClassKey(DetailFragment::class)
    internal abstract fun bindDetailFragmentInjectorFactory(factory: DetailFragmentComponent.Factory): AndroidInjector.Factory<*>
}