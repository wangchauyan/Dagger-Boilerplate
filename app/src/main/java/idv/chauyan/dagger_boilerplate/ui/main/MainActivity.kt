package idv.chauyan.dagger_boilerplate.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import idv.chauyan.androiddaggersample.R
import idv.chauyan.dagger_boilerplate.model.car.Mercedes
import idv.chauyan.dagger_boilerplate.ui.detail.DetailActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car: Mercedes

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // display current car model
        CarModule.text = car.getModelName() + " engine : " + car.getEngineType()

        // go to detail page
        GoDetail.setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}
