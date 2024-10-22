package U5S1L2.Pisseria;

import U5S1L2.Pisseria.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private Ordine test;

    @Override
    public void run(String... args) throws Exception{
        System.out.println("CIAONEEEEEEE");

        List<Topping> listaTopping = new ArrayList<>();
        listaTopping.add(new Topping("Pomodoro", 100.0, 1.0));
        listaTopping.add(new Topping("Mozzarella", 200.0, 0.5));
        listaTopping.add(new Topping("Prosciutto", 150.0, 1.5));
        listaTopping.add(new Topping("Funghi", 50.0, 0.8));
        listaTopping.add(new Topping("Olive", 40.0, 0.7));
        listaTopping.add(new Topping("Carciofi", 60.0, 1.2));

        Random random = new Random();

        List<Topping> toppingsPizza1 = new ArrayList<>();
        toppingsPizza1.add(listaTopping.get(random.nextInt(listaTopping.size())));
        toppingsPizza1.add(listaTopping.get(random.nextInt(listaTopping.size())));  // Aggiungiamo due topping casuali
        Pizza pizza1 = new Pizza("Pizza Margherita", 450.0, 8.0, toppingsPizza1);

        List<Topping> toppingsPizza2 = new ArrayList<>();
        toppingsPizza2.add(listaTopping.get(random.nextInt(listaTopping.size())));
        toppingsPizza2.add(listaTopping.get(random.nextInt(listaTopping.size())));
        Pizza pizza2 = new Pizza("Pizza Prosciutto e Funghi", 500.0, 9.5, toppingsPizza2);

        List<Topping> toppingsPizza3 = new ArrayList<>();
        toppingsPizza3.add(listaTopping.get(random.nextInt(listaTopping.size())));
        toppingsPizza3.add(listaTopping.get(random.nextInt(listaTopping.size())));
        Pizza pizza3 = new Pizza("Pizza Vegetariana", 400.0, 7.5, toppingsPizza3);

        List<Prodotto> prodottos = new ArrayList<>();
        prodottos.add(pizza1);
        prodottos.add(pizza2);
        prodottos.add(pizza3);


        Menu menu = new Menu(prodottos);

        System.out.println(menu);
        System.out.println(test);

    }
}
