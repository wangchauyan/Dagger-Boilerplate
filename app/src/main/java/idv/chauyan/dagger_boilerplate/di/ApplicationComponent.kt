package idv.chauyan.dagger_boilerplate.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import idv.chauyan.dagger_boilerplate.SampleApplication
import idv.chauyan.dagger_boilerplate.model.di.EngineComponent
import idv.chauyan.dagger_boilerplate.ui.detail.DetailActivityModule
import idv.chauyan.dagger_boilerplate.ui.main.MainActivityModule


@Component(
    dependencies = [
        EngineComponent::class
    ],
    modules = [
        // handle android components injection
        AndroidInjectionModule::class,
        // handle android support lib injection
        AndroidSupportInjectionModule::class,
        // add activity builder module
        MainActivityModule::class,
        DetailActivityModule::class
    ]
)
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: SampleApplication): Builder
        fun engine(engineComponent: EngineComponent): Builder

        fun build(): ApplicationComponent
    }

    fun inject(application: SampleApplication)
}