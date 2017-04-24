import static org.junit.Assert.*;

import org.junit.Test;

public class MasterMindTest {

	@Test
	public void	testLunghezza()	{
		assertTrue(Giudice.valida("1456"));
		assertFalse(Giudice.valida("e6"));
		assertFalse(Giudice.valida(""));
		assertFalse(Giudice.valida("097523"));
	}
	
	@Test
	public void	testCaratteriLunghezza()	{		
		valida("3617")	true
		valida("i907")	false
		valida("567!")	false
		valida("ab%t")	false
	}
	
}
/**	per	validare	le	stringhe	(cioè	restituire	true	o	false	a	seconda	che	abbiano	o	
*	meno	il	giusto	formato:	4	caratteri	da		0	a	9	non	ripetuti)
*	confrontare	una	stringa guess	con	quella	target	e	dire	quanti	bulls	ci	sono
*	confrontare	una	stringa	guess	con	quella	target	e	dire	quanti	maggots	ci sono.*/