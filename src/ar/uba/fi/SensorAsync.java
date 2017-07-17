package ar.uba.fi;

import java.util.ArrayList;

public class SensorAsync extends Sensor implements Subject {
	
	ArrayList<Observer> observers;

	public SensorAsync() {
		super(false);
		observers = new ArrayList<Observer>();
	}
	
	public Alarma crearAlarma(){
		return new AlarmaC();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
		
	}

	public void removeObserver(Observer o) {
		
		observers.remove(o);
	}

	public void notifyObservers() {
		for (Observer o : observers)
			o.update(enAlarma);
		
	}
	
	public void setEnAlarma(boolean enAlarma){
		this.enAlarma = enAlarma;
		if (enAlarma){
			notifyObservers();
		}
	}

}
