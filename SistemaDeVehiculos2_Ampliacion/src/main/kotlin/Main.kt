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


    println("****************VEHICULO**************")
    println(vehiculo)
    println("Combustible actual: ${ vehiculo.combustibleActual }")
    vehiculo.repostar(23f)
    println("Combustible actual: ${ vehiculo.combustibleActual }")
    println(vehiculo.obtenerInformacion())
    println("Combustible actual: ${ vehiculo.combustibleActual }")

    println()

    println("****************AUTOMOVIL**************")
    println(automovil)
    println("Combustible actual: ${ automovil.combustibleActual }")
    automovil.repostar(-5f)
    println("Combustible actual: ${ automovil.combustibleActual }")
    println("Autonomia actual: ${automovil.calcularAutonomia()}")
    println("Combustible actual: ${ automovil.combustibleActual }")

    println()

    println("****************MOTO**************")
    println(moto)
    moto.repostar(3f)
    println(moto)
    moto.realizarCaballito()
    println(moto)
    moto.realizaViaje(50)
    println(moto)

}