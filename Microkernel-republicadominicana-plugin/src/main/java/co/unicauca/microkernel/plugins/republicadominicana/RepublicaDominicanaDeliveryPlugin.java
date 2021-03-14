package co.unicauca.microkernel.plugins.republicadominicana;

import co.unicauca.microkernel.common.entities.Delivery;
import co.unicauca.microkernel.common.entities.Product;
import co.unicauca.microkernel.common.interfaces.IDeliveryPlugin;

/**
 *Plugin para envios a Republica Dominicana
 * @author EDWIN ADRADA
 */
public class RepublicaDominicanaDeliveryPlugin implements IDeliveryPlugin{

    @Override
    public double calculateCost(Delivery delivery) {
        
        Product product = delivery.getProduct();

        double cost;

        //El peso del producto determina el costo.
        if (product.getWeight() <= 2) {

            cost = 8;

        } else {

            //El peso adicional despuÃ©s de 2 kg se cobra a 0.8 por kilo.
            cost = 8 + (product.getWeight() - 2) * 0.8;

        }

        return cost;
    }
    
}
