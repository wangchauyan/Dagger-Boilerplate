package idv.chauyan.dagger_boilerplate.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import idv.chauyan.androiddaggersample.R
import idv.chauyan.dagger_boilerplate.ui.detail.ui.detail.DetailFragment
import javax.inject.Inject

class DetailActivity : AppCompatActivity(), HasAndroidInjector {

    @Inject lateinit var fragmentInjector: DispatchingAndroidInjector<Any>
    override fun androidInjector(): AndroidInjector<Any> = fragmentInjector

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, DetailFragment.newInstance())
                .commitNow()
        }
    }

}
