package ar.uba.fi;

public class SensorMultiple extends Sensor {

	public SensorMultiple(boolean enAlarma) {
		super(enAlarma);
	}
	
	public Alarma crearAlarma(){
		return new AlarmaMultiple();
	}
	

}
