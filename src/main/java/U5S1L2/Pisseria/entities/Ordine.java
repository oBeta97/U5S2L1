package U5S1L2.Pisseria.entities;

import U5S1L2.Pisseria.enums.StatoOrdine;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@Getter
@ToString
@Component
public class Ordine {
    private long id;
    @Autowired
    private List<Prodotto> prodottiOrdinati;
    @Autowired
    private Tavolo tavolo;
    @Autowired
    private StatoOrdine stato;
    private int nrPersone;
    private LocalDate ordineDt;
    @Setter(AccessLevel.NONE)
    private double importo;

    @Getter(AccessLevel.NONE)
    @Value("${ordine.costoCoperto}")
    private int costoCoperto;

    public Ordine(long id, List<Prodotto> prodottiOrdinati, Tavolo tavolo, StatoOrdine stato, int nrPersone, LocalDate ordineDt) {
        this.id = id;
        this.prodottiOrdinati = prodottiOrdinati;
        this.tavolo = tavolo;
        this.stato = stato;
        this.nrPersone = nrPersone;
        this.ordineDt = ordineDt;
        this.importo = setImporto();
    }

    public double setImporto(){
        double sumCostoProdotti = prodottiOrdinati.stream().mapToDouble(Prodotto::getPrice).sum();
        double sumCoperti = + this.costoCoperto * this.nrPersone;

        return  sumCostoProdotti + sumCoperti;
    }
}
