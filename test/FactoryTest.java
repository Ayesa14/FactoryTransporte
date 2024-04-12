import com.ayesa.Bicicleta;
import com.ayesa.Camion;
import com.ayesa.Factory;
import com.ayesa.ITransporte;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class FactoryTest {
    @Test
    @DisplayName("Tipo bicicleta")
    public void comprobarTipoBicicleta(){
        ITransporte obj1 = Factory.getTransporte(Factory.BICICLETA);
        Assertions.assertTrue(obj1 instanceof Bicicleta);
    }

    @Test
    @DisplayName("Tipo camion")
    public void comprobarTipoCamion(){
        ITransporte obj2 = Factory.getTransporte(Factory.CAMION);
        Assertions.assertTrue(obj2 instanceof Camion);
    }

    @Test
    @DisplayName("Nulo")
    public void comprobarNulo(){
        ITransporte result = Factory.getTransporte(999);
        Assertions.assertNull(result);
    }

}
