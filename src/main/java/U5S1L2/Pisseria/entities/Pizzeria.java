package U5S1L2.Pisseria.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Component
@PropertySource("application.properties")
public class Pizzeria {

    @Value("${pisseria.nome}")
    private String nome;
    @Value("${pisseria.indirizzo}")
    private String indirizzo;

    @Autowired
    private Menu menu;
    @Autowired
    private List<Tavolo> tavolos;


}
