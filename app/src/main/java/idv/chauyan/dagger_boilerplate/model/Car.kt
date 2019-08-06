package idv.chauyan.dagger_boilerplate.model

class Car {

    private val carModel: String = "mercedes-benz GLC 300"
    private val carModelDetail: String = "here is the car model detail information"

    fun getModelName(): String = carModel
    fun getModelDetail(): String = carModelDetail
}