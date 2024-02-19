import kotlin.math.roundToInt

/**
 * Clase que representa un vehículo genérico.
 * @property marca La marca del vehículo.
 * @property modelo El modelo del vehículo.
 * @property capacidadCombustible La capacidad total del tanque de combustible del vehículo en litros.
 * @property combustibleActual La cantidad actual de combustible en el tanque del vehículo en litros.
 * @property kilometrosActuales El total de kilómetros recorridos por el vehículo.
 */
open class Vehiculo (val marca: String, val modelo: String, val capacidadCombustible: Float, var combustibleActual: Float, var kilometrosActuales: Int){

    /**
     * Retorna los kilómetros que el vehículo puede recorrer con el combustible actual (suponemos que cada litro da para 10 km)
     * @return String - Cadena de texto inormando de los km que se pueden recorrer
     */
    fun obtenerInformacion(): String {
        return "El vehiculo actualmente puede recorrer: ${combustibleActual * 10} kms"
    }

    /**
     * Calcla la autonomia (Suponemos que cada litro da para 10 km.).
     * @return Int - La autonomia
     */
    open fun calcularAutonomia(): Int{
//        val autonomia = combustibleActual * 10
//        return ((autonomia*100).roundToInt()) / 100
        return (combustibleActual * 10).toInt()
    }

    /**
     * Realiza un viaje hasta donde da combustibleActual. Ajusta el combustible gastado y
     * el kilometraje realizado de acuerdo con el viaje.
     * @return Int - La distancia restante por recorrer
     */
    open fun realizaViaje(distancia: Int): Int{
        val autonomia = calcularAutonomia()

        val distanciaRecorrida = if (autonomia > distancia) distancia else autonomia

        combustibleActual -= distanciaRecorrida / 10
        kilometrosActuales += distanciaRecorrida

        return distancia - distanciaRecorrida
    }

    /**
     * Incrementa combustibleActual hasta el máximo de capacidadCombustible si no se pasa
     * cantidad o si cantidad es O o negativa. Sino, incrementa en cantidad hasta llegar a capacidadCombustible.
     * @return Float - La cantidad repostada.
     */
    fun repostar(cantidad: Float = 0f): Float{
        val espacioTanque = capacidadCombustible - combustibleActual
        var cantidadRepostada = 0f
        if (cantidad <= 0 ) {
            combustibleActual = capacidadCombustible
        } else{
            if (cantidad < espacioTanque){
                combustibleActual += cantidad
                cantidadRepostada = cantidad
            } else {
                combustibleActual = capacidadCombustible
                cantidadRepostada =  espacioTanque
            }
        }
        return redondear(cantidadRepostada)
    }

    /**
     * Redondea el numero pasado por parametro a dos decimales
     * @param numeroARedondear Float - Numero que redondeamos
     * @return Float - El numero redondeado
     */
    private fun redondear(numeroARedondear: Float): Float{
        return "%.2f".format(numeroARedondear).toFloat()
    }

}