package U5S1L2.Pisseria.entities;

import U5S1L2.Pisseria.enums.StatoTavolo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Tavolo {
    private long id;
    private int nrMaxPosti;
    private StatoTavolo stato;


}
