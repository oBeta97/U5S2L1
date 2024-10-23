package U5S1L2.Pisseria.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Component
public class Menu {
    @Autowired
    private List<Prodotto> prodottoList;

}
