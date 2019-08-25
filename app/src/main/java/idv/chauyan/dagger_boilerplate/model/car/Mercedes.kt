package idv.chauyan.dagger_boilerplate.model.car

import idv.chauyan.dagger_boilerplate.model.iface.Car
import idv.chauyan.dagger_boilerplate.model.iface.Engine
import javax.inject.Inject

class Mercedes @Inject constructor(
    val engine: Engine
): Car{

    private val carModel: String = "mercedes-benz GLC 300"
    private val carModelDetail: String = "here is the car model detail information"

    override fun getModelName(): String = carModel
    override fun getModelDetail(): String = carModelDetail
    override fun getEngineType(): String = engine.getEngineName()
}