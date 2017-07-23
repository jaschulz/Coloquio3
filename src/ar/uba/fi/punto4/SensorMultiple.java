package ar.uba.fi.punto4;

public class SensorMultiple extends Sensor {

	public SensorMultiple(boolean enAlarma) {
		super(enAlarma);
	}
	
	public Alarma crearAlarma(){
		return new AlarmaMultiple();
	}
	

}
