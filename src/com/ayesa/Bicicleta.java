package com.ayesa;

import com.ayesa.ITransporte;
public class Bicicleta implements ITransporte{
    /**
     * Calculamos el coste total para la BICICLETA en funcion del codigo postal
     * @param cp le pasamos el codigo postal de la ciudad
     * @return nos devuelve el coste total
     */
    @Override
    public Float costeTotal(Integer cp){
        int diferencia = cp - CENTRO_CIUDAD;
        if (diferencia > 10){
            return 3.7f;
        } else if (diferencia > 20){
            return 5.7f;
        } else if (diferencia > 40){
            return 6f;
        } else {
            return 8f;
        }
    }

    /**
     * Calculamos el tipo de embalaje para la BICICLETA, en este caso solo devuelve CAJA_CARTON
     * @param x ancho del objeto
     * @param y largo del objeto
     * @param z alto del objeto
     * @param peso cuanto pesa el objeto
     * @return
     */


    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso){
        if (x < 10 && y < 20 && z < 20 || peso <=10){
            return CAJA_CARTON;
        } else {
            return null;
        }
    }
}
