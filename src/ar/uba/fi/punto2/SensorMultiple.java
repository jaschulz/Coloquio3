package ar.uba.fi.punto2;

public class SensorMultiple extends Sensor {

	public SensorMultiple(boolean enAlarma) {
		super(enAlarma);
	}
	
	public Alarma crearAlarma(){
		return new AlarmaMultiple();
	}
}
