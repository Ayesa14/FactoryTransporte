package com.ayesa;

import com.ayesa.ITransporte;
public class Camion implements ITransporte {
    /**
     * Calculamos el coste total para el CAMION en funcion del codigo postal
     *
     * @param cp le pasamos el codigo postal de la ciudad
     * @return nos devuelve el coste total
     */
    @Override
    public Float costeTotal(Integer cp) {
        int diferencia = cp - CENTRO_CIUDAD;
        if (diferencia > 100) {
            return 5.7f;
        } else if (diferencia > 200) {
            return 6.7f;
        } else if (diferencia > 400) {
            return 8f;
        } else {
            return 10f;
        }
    }

    /**
     * Calculamos el tipo de embalaje para lel CAMIMON
     *
     * @param x    ancho del objeto
     * @param y    largo del objeto
     * @param z    alto del objeto
     * @param peso cuanto pesa el objeto
     * @return
     */


    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        if (x < 10 && y < 20 && z < 20 || peso <= 10) {
            return CAJA_CARTON;
        } else if (x < 20 && y < 40 && z < 40 || peso > 10 && peso < 20) {
            return CAJA_MADERA;
        } else {
            return PALLET;
        }
    }
}
