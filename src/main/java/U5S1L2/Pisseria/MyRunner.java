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
    private Pizzeria pizzeria;
    @Autowired
    private Menu menu;

    @Override
    public void run(String... args) throws Exception{
        System.out.println("CIAONEEEEEEE");

        System.out.println(pizzeria);
        System.out.println(menu);

    }
}
