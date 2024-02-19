class Motocicleta(val cilindrada: Int, marca: String, modelo: String, capacidadCombustible: Float, combustibleActual: Float, kilometrosActuales: Int) : Vehiculo(marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales) {

    override fun calcularAutonomia(): Int {

        return (super.calcularAutonomia()) * 2
    }


    override fun realizaViaje(distancia: Int): Int {
        return (super.realizaViaje(distancia)) * 2
    }

    fun realizarCaballito(): Float{
        println("Has hecho un wheelie")
        combustibleActual -= 0.25f
        return combustibleActual
    }

}