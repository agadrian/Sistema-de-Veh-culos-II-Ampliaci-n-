class Motocicleta(val cilindrada: Int, marca: String, modelo: String, capacidadCombustible: Float, combustibleActual: Float, kilometrosActuales: Int) : Vehiculo(marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales) {

    override fun calcularAutonomia(): Int {

        return (super.calcularAutonomia()) * 2
    }

// TODO : ESTA MAL
    override fun realizaViaje(distancia: Int): Int {
        val distanciaRecorrida = super.realizaViaje(distancia)
        kilometrosActuales += distanciaRecorrida *2
        return distanciaRecorrida
    }

    fun realizarCaballito(): Float{
        println("Has hecho un wheelie")
        combustibleActual -= 0.25f
        return combustibleActual
    }

    override fun toString(): String {
        return super.toString() + " ; Cilindrada: $cilindrada ; Autonomia: ${calcularAutonomia()} ; Kilometors Actuales : $kilometrosActuales"
    }

}