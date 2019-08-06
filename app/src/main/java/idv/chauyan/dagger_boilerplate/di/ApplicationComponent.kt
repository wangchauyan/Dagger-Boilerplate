package idv.chauyan.dagger_boilerplate.di

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.support.AndroidSupportInjectionModule
import idv.chauyan.dagger_boilerplate.SampleApplication
import idv.chauyan.dagger_boilerplate.ui.detail.DetailActivityModule
import idv.chauyan.dagger_boilerplate.ui.main.MainActivityModule


@Component(
    modules = [
        // handle android components injection
        AndroidInjectionModule::class,
        // handle android support lib injection
        AndroidSupportInjectionModule::class,
        // add activity builder module
        MainActivityModule::class,
        DetailActivityModule::class,
        // add resource module
        ResourceModule::class
    ]
)
interface ApplicationComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: SampleApplication): Builder

        fun build(): ApplicationComponent
    }

    fun inject(application: SampleApplication)
}