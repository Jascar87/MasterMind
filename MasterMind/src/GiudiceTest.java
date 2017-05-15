import static org.junit.Assert.*;

import org.junit.Test;

public class GiudiceTest {

	@Test
	public void	testLunghezza()	{
		assertFalse(Giudice.valida(null));
		assertTrue(Giudice.valida("1456"));
		assertFalse(Giudice.valida("e6"));
		assertFalse(Giudice.valida(""));
		assertFalse(Giudice.valida("097523"));
	}
	
	@Test
	public void	testNumBulls()	{	
		
		assertTrue(Giudice.numBulls("1234",	"5678")==0);
		assertTrue(Giudice.numBulls("1234",	"1876")==1);
		assertTrue(Giudice.numBulls("1234",	"9874")==1);
		assertTrue(Giudice.numBulls("1234",	"9243")==1);
		assertTrue(Giudice.numBulls("9876",	"5573")==1);
		assertTrue(Giudice.numBulls("1234",	"1256")==2);
		assertTrue(Giudice.numBulls("1234",	"1537")==2);
		assertTrue(Giudice.numBulls("1234",	"1764")==2);
		assertTrue(Giudice.numBulls("1234",	"8237")==2);
		assertTrue(Giudice.numBulls("1234",	"9834")==2);
		assertTrue(Giudice.numBulls("9264",	"9261")==3);
		assertTrue(Giudice.numBulls("9264",	"9284")==3);
		assertTrue(Giudice.numBulls("9264",	"9764")==3);
		assertTrue(Giudice.numBulls("9264",	"5264")==3);
		assertTrue(Giudice.numBulls("9264",	"9264")==4);
		assertTrue(Giudice.numBulls("8725",	"8725")==4);
	}

	@Test
	public void testNumMaggots(){
		assertTrue(Giudice.numMaggots("1234",	"1234")==0);
		assertTrue(Giudice.numMaggots("1234",	"4321")==4);
		assertTrue(Giudice.numMaggots("8234",	"3746")==2);
		assertTrue(Giudice.numMaggots("8234",	"9763")==1);
		assertTrue(Giudice.numMaggots("1234",	"2345")==3);
	}
	
	@Test
	public void testValidaTarget(){
		Giudice giudice = new Giudice();
		assertTrue(Giudice.valida(giudice.target));
	}
	
	
}
