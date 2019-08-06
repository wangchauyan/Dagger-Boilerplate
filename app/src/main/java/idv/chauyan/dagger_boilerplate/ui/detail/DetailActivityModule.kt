package idv.chauyan.dagger_boilerplate.ui.detail

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import idv.chauyan.dagger_boilerplate.ui.detail.DetailActivity
import idv.chauyan.dagger_boilerplate.ui.detail.DetailActivityComponent

@Module(subcomponents = [
    DetailActivityComponent::class
])
abstract class DetailActivityModule {
    @Binds
    @IntoMap
    @ClassKey(DetailActivity::class)
    internal abstract fun bindDetailActivityFactory(factory: DetailActivityComponent.Factory): AndroidInjector.Factory<*>
}