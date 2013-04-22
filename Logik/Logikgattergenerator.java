package Logik;
import java.util.Random;


public class Logikgattergenerator 
{
	//private static final long  SEED = 219656347;
	private static Random random;
	
	private Logikgatter generiertesLogikgatter;   //variable zum Speichern der generierten Logikgatter
	
	public Logikgattergenerator()
	{
		Logikgattergenerator.random = new Random(Double.doubleToLongBits(Math.random()));
		this.generate();
	}
	
	
	/**
	 * generiert ein Logikgatter und speicher es in der Variable generiertesLogikgatter
	 */
	public void generate()
	{
		int zufall=Logikgattergenerator.random.nextInt(6); //generiert eine Zufallszahl zwischen 0 und 6
		

		switch (zufall){
			case 0: this.generiertesLogikgatter = new And();
			break;
			case 1: this.generiertesLogikgatter = new Nand();
			break;
			case 2: this.generiertesLogikgatter = new Or();
			break;
			case 3: this.generiertesLogikgatter = new Nor();
			break;
			case 4: this.generiertesLogikgatter = new Not();
			break; 
			case 5: this.generiertesLogikgatter = new Xor();
			break; 
		}
	}
	
	//Logikgatter kann hier nicht eindutig identifiziert werden
	//evtl. toString(): name:string in die einzelnen Gatter einbauen!
	public Logikgatter getLogikgatter(){
			return generiertesLogikgatter;
	}
	
}

