import static org.junit.Assert.*;

import org.junit.Test;


public class Prueba_Barcos {

	
	public void test(Ship ship) {
		assertEquals(1, ship.getSize());
		ship.setSize(12);
		assertEquals(12, ship.getSize());
	}

}
