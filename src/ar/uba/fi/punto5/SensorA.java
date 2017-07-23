package ar.uba.fi.punto5;

public class SensorA extends Sensor {


	
	public SensorA(boolean enAlarma) {
		super(enAlarma);
	}

	public Alarma crearAlarma(){
		return new AlarmaA();		
	}

}
