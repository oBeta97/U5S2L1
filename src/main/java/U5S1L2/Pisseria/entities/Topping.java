package U5S1L2.Pisseria.entities;

import lombok.Getter;

@Getter
public class Topping extends Prodotto{

    public Topping(String name, double kcal, double price){
        super(name, kcal, price);
    }

}
