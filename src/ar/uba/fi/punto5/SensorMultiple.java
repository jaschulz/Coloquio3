package ar.uba.fi.punto5;

public class SensorMultiple extends Sensor {

	public SensorMultiple(boolean enAlarma) {
		super(enAlarma);
	}
	
	public Alarma crearAlarma(){
		return new AlarmaMultiple();
	}
	

}
