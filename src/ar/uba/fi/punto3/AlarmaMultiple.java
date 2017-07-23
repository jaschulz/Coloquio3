package ar.uba.fi.punto3;

import java.util.ArrayList;

public class AlarmaMultiple extends Alarma{

	private ArrayList<Alarma> alarmaList;
	
	public AlarmaMultiple() {
		alarmaList = new ArrayList<Alarma>();
		alarmaList.add(new AlarmaA());
		alarmaList.add(new AlarmaB());
		alarmaList.add(new AlarmaC());
	}

	public void accionar(){
		System.out.println("Alarma  de tipo Multiple accionada");
		for(Alarma a : alarmaList){
			System.out.print("	");
			a.accionar();
		}
	}

}
