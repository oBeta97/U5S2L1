package U5S1L2.Pisseria;

import U5S1L2.Pisseria.entities.Pizza;
import U5S1L2.Pisseria.entities.Prodotto;
import U5S1L2.Pisseria.entities.Tavolo;
import U5S1L2.Pisseria.enums.StatoOrdine;
import U5S1L2.Pisseria.enums.StatoTavolo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class PizzeriaConfigurator {

    @Bean
    public List<Prodotto> prodottiXOrdine (){
        ArrayList<Prodotto> prodottos = new ArrayList<>();

        prodottos.add(new Pizza());
        prodottos.add(new Pizza());
        prodottos.add(new Pizza());
        prodottos.add(new Pizza());

        return prodottos;
    }

    @Bean
    public List<Tavolo> tavoliXPizzeria(){
        ArrayList<Tavolo> tavoli = new ArrayList<>();

        tavoli.add(new Tavolo(0,4,StatoTavolo.LIBERO));
        tavoli.add(new Tavolo(1,4,StatoTavolo.LIBERO));
        tavoli.add(new Tavolo(2,4,StatoTavolo.LIBERO));
        tavoli.add(new Tavolo(3,4,StatoTavolo.LIBERO));
        tavoli.add(new Tavolo(4,4,StatoTavolo.LIBERO));
        tavoli.add(new Tavolo(5,4,StatoTavolo.LIBERO));
        tavoli.add(new Tavolo(6,4,StatoTavolo.LIBERO));

        return  tavoli;
    }




}
