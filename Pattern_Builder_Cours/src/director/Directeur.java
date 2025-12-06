package director;

import builder.MonteurPizza;
import builder.MonteurPizzaPiquante;
import builder.MonteurPizzaReine;
import product.Pizza;

public class Directeur {
    // Construire pizza reine
    public Pizza construirePizzaReine() {
        MonteurPizza pizzaReine = new MonteurPizzaReine();
        return pizzaReine.getPizza();
    }

    // Construire pizza Piquante
    public Pizza construirePizzaPiquante() {
        MonteurPizza pizzap = new MonteurPizzaPiquante();
        return pizzap.getPizza();
    }
}

