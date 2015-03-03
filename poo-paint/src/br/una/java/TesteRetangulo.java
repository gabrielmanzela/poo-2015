package br.una.java;

import org.junit.Assert;
import org.junit.Test;

public class TesteRetangulo {
	
	@Test
	public void testaRetangulo() {
		Retangulo r = new Retangulo(31,31,50,40);
		String result = r.imprime();
		Assert.assertEquals("Retangulo[x:31,y:31,l:50,a:40]", result);
	}

}
