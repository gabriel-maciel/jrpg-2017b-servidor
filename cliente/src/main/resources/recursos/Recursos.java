package recursos;

import java.awt.image.BufferedImage;

public class Recursos {

	private static int ANCHO = 256; // Ancho del tile a obtener
	private static int ALTO = 256; // Alto del tile a obtener
	
	public static BufferedImage[] guerreroIzq;
	public static BufferedImage[] guerreroArribaIzq;
	public static BufferedImage[] guerreroArriba;
	public static BufferedImage[] guerreroArribaDer;
	public static BufferedImage[] guerreroDer;
	public static BufferedImage[] guerreroAbajoDer;
	public static BufferedImage[] guerreroAbajo;
	public static BufferedImage[] guerreroAbajoIzq;
	
	public static BufferedImage prueba;
	
	// Cargo todos los recursos una sola vez para no tener que hacerlo en cada actualizacion
	
	public static void cargar() {
		
		// Inicio Guerrero
		SpriteSheet guerrero = new SpriteSheet(CargadorImagen.cargarImagen("/Guerrero.png"));
		
		guerreroIzq = new BufferedImage[4];
		guerreroArribaIzq = new BufferedImage[4];
		guerreroArriba = new BufferedImage[4];
		guerreroArribaDer = new BufferedImage[4];
		guerreroDer = new BufferedImage[4];
		guerreroAbajoDer = new BufferedImage[4];
		guerreroAbajo = new BufferedImage[4];
		guerreroAbajoIzq = new BufferedImage[4];
		
		for(int i = 0; i < 4; i++) {
			guerreroIzq[i] = guerrero.getTile(ANCHO*i, 0, ANCHO, ALTO);
		}
		
		for(int i = 0; i < 4; i++) {
			guerreroArribaIzq[i] = guerrero.getTile(ANCHO*i, ALTO, ANCHO, ALTO);
		}
		
		for(int i = 0; i < 4; i++) {
			guerreroArriba[i] = guerrero.getTile(ANCHO*i, ALTO*2, ANCHO, ALTO);
		}
		
		for(int i = 0; i < 4; i++) {
			guerreroArribaDer[i] = guerrero.getTile(ANCHO*i, ALTO*3, ANCHO, ALTO);
		}
		
		for(int i = 0; i < 4; i++) {
			guerreroDer[i] = guerrero.getTile(ANCHO*i, ALTO*4, ANCHO, ALTO);
		}
		
		for(int i = 0; i < 4; i++) {
			guerreroAbajoDer[i] = guerrero.getTile(ANCHO*i, ALTO*5, ANCHO, ALTO);
		}
		
		for(int i = 0; i < 4; i++) {
			guerreroAbajo[i] = guerrero.getTile(ANCHO*i, ALTO*6, ANCHO, ALTO);
		}
		
		for(int i = 0; i < 4; i++) {
			guerreroAbajoIzq[i] = guerrero.getTile(ANCHO*i, ALTO*7, ANCHO, ALTO);
		}
		
		// Fin Guerrero
	}
}
