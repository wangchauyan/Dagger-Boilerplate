package idv.chauyan.dagger_boilerplate.model.engine

import idv.chauyan.dagger_boilerplate.model.iface.Engine
import javax.inject.Inject

class ElectricEngine @Inject constructor(): Engine {
    private val name: String = "ElectricEngine"
    override fun getEngineName(): String = name
}