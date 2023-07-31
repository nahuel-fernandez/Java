package ordenados;

import java.util.Comparator; 

import genericos.Parametrica;


public class Orden implements Comparator<Parametrica>{
	
	

	@Override
	public int compare(Parametrica p1, Parametrica p2) {
		
		return (p1.compareTo(p2));
	}

}
