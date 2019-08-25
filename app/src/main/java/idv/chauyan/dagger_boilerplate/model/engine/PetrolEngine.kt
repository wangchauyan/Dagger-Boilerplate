package idv.chauyan.dagger_boilerplate.model.engine

import idv.chauyan.dagger_boilerplate.model.iface.Engine
import javax.inject.Inject

class PetrolEngine @Inject constructor(): Engine {
    private val name: String = "PetrolEngine"
    override fun getEngineName(): String = name
}