package com.ayesa;

import com.ayesa.ITransporte;
import com.ayesa.Camion;
import com.ayesa.Bicicleta;
public class Factory {
    //Declaramos la opcion CAMION
    public static final int CAMION = 0;
    //Declaramos la opcion BICICLETA
    public static final int BICICLETA = 1;

    public static ITransporte getTransporte(int device){
        switch (device){
            case CAMION -> {
                return new Camion();
            }
            case BICICLETA -> {
                return new Bicicleta();
            }
            default -> {
                return null;
            }
        }
    }
}
