package ar.uba.fi.punto4;

public class SensorB extends Sensor {

	public SensorB(boolean enAlarma) {
		super(enAlarma);
	}
	
	public Alarma crearAlarma(){
		return new AlarmaB();		
	}

}
