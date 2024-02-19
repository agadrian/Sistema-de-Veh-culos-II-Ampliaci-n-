class Motocicleta(val cilindrada: Int, marca: String, modelo: String, capacidadCombustible: Float, combustibleActual: Float, kilometrosActuales: Int) : Vehiculo(marca, modelo, capacidadCombustible, combustibleActual, kilometrosActuales) {

    override fun calcularAutonomia(): Int {
        return (super.calcularAutonomia()) * 2
    }

    // TODO
    override fun realizaViaje(distancia: Int): Int {
        return super.realizaViaje(distancia)
    }

}