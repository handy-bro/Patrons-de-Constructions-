package builder;

import product.Pizza;

public class MonteurPizzaGombo extends MonteurPizza {
    public void monterPate() {
        pizza.setPate("épaisse");
    }

    public void monterSauce() {
        pizza.setSauce("épicée créole");
    }

    public void monterGarniture() {
        pizza.setGarniture("crevettes+andouille+okra");
    }
}

