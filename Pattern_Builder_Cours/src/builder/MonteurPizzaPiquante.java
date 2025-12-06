package builder;

import product.Pizza;

public class MonteurPizzaPiquante extends MonteurPizza {
    public void monterPate() {
        pizza.setPate("feuilletée");
    }

    public void monterSauce() {
        pizza.setSauce("piquante");
    }

    public void monterGarniture() {
        pizza.setGarniture("pepperoni+salami");
    }
}

