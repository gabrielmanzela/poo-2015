package br.una.java;

public class Retangulo {
	
	private int pos_x;
	private int pos_y;
	private int largura;
	private int altura;
	private static int count = 0;
	
	public Retangulo(int pos_x, int pos_y, int largura, int altura) {
		this.pos_x = pos_x;
		this.pos_y = pos_y;
		this.largura = largura;
		this.altura = altura;
		count++;
	}
	
	public String imprime() {
		return "retangulo[x:"+this.pos_x+",y:"+this.pos_y+",l:"+this.largura+",a:"+this.altura+"]";
	}
	
	public static int instancias() {
		return count;
	}
	
	public static void zeraInstancias() {
		count = 0;
	}
	
	public static boolean igual(Retangulo a, Retangulo b) {
		
		boolean altura = a.altura == b.altura;
		boolean largura = a.largura == b.largura;
		boolean y = a.pos_y == b.pos_y;
		boolean x = a.pos_x == b.pos_x;
		
		return (x && y && largura && altura && largura);
	}
	
	public int getPos_x() {
		return pos_x;
	}
	
	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}
	
	public int getPos_y() {
		return pos_y;
	}
	
	public void setPos_y(int pos_y) {
		this.pos_y = pos_y;
	}
	
	public int getLargura() {
		return largura;
	}
	
	public void setLargura(int largura) {
		this.largura = largura;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}

	
	
}
