package ar.uba.fi.punto3;

public class SensorA extends Sensor {


	
	public SensorA(boolean enAlarma) {
		super(enAlarma);
	}

	public Alarma crearAlarma(){
		return new AlarmaA();		
	}

}
