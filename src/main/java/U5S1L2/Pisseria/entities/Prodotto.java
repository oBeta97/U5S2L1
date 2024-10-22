package U5S1L2.Pisseria.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public abstract class Prodotto {
    private String name;
    private double kcal;
    private double price;

    public Prodotto(String name, double kcal, double price) {
        this.kcal = kcal;
        this.name = name;
        this.price = price;
    }
}
