package U5S1L2.Pisseria;

import U5S1L2.Pisseria.entities.Pizza;
import U5S1L2.Pisseria.entities.Prodotto;
import U5S1L2.Pisseria.entities.Tavolo;
import U5S1L2.Pisseria.enums.StatoOrdine;
import U5S1L2.Pisseria.enums.StatoTavolo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class OrdineConfigurator {

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
    public Tavolo tavoloXOrdine(){
        return new Tavolo(1,4, StatoTavolo.OCCUPATO);
    }

    @Bean
    public StatoOrdine statoOrdineXOrdine (){
        return StatoOrdine.IN_CORSO;
    }

}
