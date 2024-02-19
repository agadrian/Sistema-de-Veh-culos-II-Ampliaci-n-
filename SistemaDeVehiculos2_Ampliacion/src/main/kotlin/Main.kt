import kotlin.math.pow
import kotlin.math.roundToInt


fun Float.redondear(posiciones: Int): Float{
    val factor = 10.0.pow(posiciones.toDouble()).toFloat()
    return (this * factor).roundToInt() / factor
}

fun main() {

    val vehiculo = Vehiculo("Toyota", "Corolla", 150f, 100f, 50)

    val automovil = Automovil(true, false, "Tesla", "s", 150f, 100f, 50)

    val moto = Motocicleta(600, "Honda", "CBR600RR", 150f, 100f, 50)


    println(" Combustible actuial: ${ vehiculo.combustibleActual }")
    println(vehiculo.repostar())
    println(" Combustible actuial: ${ vehiculo.combustibleActual }")
    println(vehiculo.capacidadCombustible)


    println(automovil.calcularAutonomia())
    println(moto.calcularAutonomia())

    println(vehiculo.realizaViaje(150))
    println(automovil.realizaViaje(150))
    println(moto.realizaViaje(150))

    println(vehiculo.calcularAutonomia())
    println(automovil.calcularAutonomia())
    println(moto.calcularAutonomia())
}