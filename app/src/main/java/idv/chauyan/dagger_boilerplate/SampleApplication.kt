package idv.chauyan.dagger_boilerplate

import android.app.Application
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import idv.chauyan.dagger_boilerplate.di.AppInjector
import javax.inject.Inject

class SampleApplication: Application(), HasAndroidInjector {

    @Inject lateinit var activityInjector: DispatchingAndroidInjector<Any>
    override fun androidInjector() = activityInjector



    override fun onCreate() {
        super.onCreate()

        // init application component.
        AppInjector.inject(this)
    }
}