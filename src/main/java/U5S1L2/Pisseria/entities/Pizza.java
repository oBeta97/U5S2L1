package U5S1L2.Pisseria.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@Setter
public class Pizza extends Prodotto {
    private List<Topping> toppings = new ArrayList<>();

    public Pizza(){
        super("margherita", 700, 3.5);

        this.toppings.add(new Topping("pomodoro", 100.0, 1.0));
        this.toppings.add(new Topping("Mozzarella", 200.0, 0.5));
    }

    public Pizza(String name, double kcal, double price, List<Topping> toppings) {
        super(name, kcal, price);

        this.toppings.add(new Topping("Pomodoro", 100.0, 1.0));
        this.toppings.add(new Topping("Mozzarella", 200.0, 0.5));

        this.toppings.addAll(toppings);
    }
}