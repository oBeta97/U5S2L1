package U5S1L2.Pisseria;

import U5S1L2.Pisseria.Exceptions.IllegalToppingException;
import U5S1L2.Pisseria.entities.Pizza;
import U5S1L2.Pisseria.entities.Topping;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PisseriaApplicationTests {

	@Test
	public void testAggiuntaToppingIllegale(){

		Pizza pissa = new Pizza();
		Topping hananasso = new Topping("ananas", 1000, 1.0);

		assertThrows(IllegalToppingException.class, () -> pissa.addTopping(hananasso));

	}

	@Test
	public void testAggiuntaToppingLegale(){

		Pizza pissaMargherida = new Pizza();
		Topping BananaoMeravigliao = new Topping("Banano", 1000, 1.0);

		try {
			pissaMargherida.addTopping(BananaoMeravigliao);
		} catch (IllegalToppingException e) {
			fail("Inserito un topping illegale. Errore: " + e.getMessage());
		}

		assertEquals(3, pissaMargherida.getToppings().size());

	}

}
