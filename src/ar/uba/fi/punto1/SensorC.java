package ar.uba.fi.punto1;

public class SensorC extends Sensor {

	public SensorC(boolean enAlarma) {
		super(enAlarma);
	}
	
	public Alarma crearAlarma(){
		return new AlarmaC();
	}

}
