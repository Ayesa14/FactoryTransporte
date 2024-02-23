package com.ayesa;

public interface ITransporte {
    /**
     * Aquí se elegirá el tipo de embalaje que vamos a utilizar
     * además del coste total en función del tamaño y peso
     */
    public static final int CAJA_MADERA = 0;
    public static final int CAJA_CARTON  = 1;
    public static final int PALLET = 2;
    //Codigo postal de referencia
    public static final int CENTRO_CIUDAD = 36200;

    /**
     * Calcula el coste total en funcion del codigo postal en el que vivamos
     * @param cp codigo postal de la ciudad
     * @return el precio
     */
    public abstract Float costeTotal(Integer cp);

    /**
     * Calcula el tipo de embalaje a partir de las dimensiones del objeto a embalar
     * @param x ancho del objeto
     * @param y largo del objeto
     * @param z alto del objeto
     * @param peso cuanto pesa el objeto
     * @return seleccion del embalaje
     */
    public abstract Integer tipoEmbalaje(Float x, Float y, Float z, Float peso);

}
