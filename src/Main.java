import com.ayesa.ITransporte;
import com.ayesa.Factory;
import com.ayesa.entradasalida.EntradaSalida;

public class Main {
    // Creamos una variable de tipo interfaz que inicializaremos mmás adelante
    static ITransporte vehiculo;
    public static void main(String[] args) {
        Float coste =0f;
        Integer tipoEmbalaje =0;
        String tipo="";

        int device = EntradaSalida.EntradaInt("Qué vehículo vas a elegir?\n" +
                "0. CAMION" + "\n" +
                "1. BICICLETA ");

        switch(device){
            case Factory.CAMION:
                vehiculo = Factory.getTransporte(device);
                coste = vehiculo.costeTotal(36214);
                tipoEmbalaje = vehiculo.tipoEmbalaje(10f,10f,20f,10f);

                break;
            case Factory.BICICLETA:
                vehiculo = Factory.getTransporte(device);
                coste = vehiculo.costeTotal(36214);
                tipoEmbalaje = vehiculo.tipoEmbalaje(10f,10f,20f,10f);

                break;

        }
        if (tipoEmbalaje==null){
            System.out.println("El tipo de vehiculo elegido no sirve para este embalaje");
        } else {
            if (tipoEmbalaje == ITransporte.CAJA_MADERA){
                tipo = "CAJA DE MADERA";
            } else if (tipoEmbalaje == ITransporte.CAJA_CARTON){
                tipo = "CAJA DE CARTON";
            } else if (tipoEmbalaje == ITransporte.PALLET){
                tipo = "PALLET";
            }
            System.out.println("Coste de envío: "+ coste + "\nTipo de embalaje: "+ tipo);
        }

    }
}