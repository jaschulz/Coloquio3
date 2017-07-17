package ar.uba.fi;

public class SensorA extends Sensor {


	
	public SensorA(boolean enAlarma) {
		super(enAlarma);
	}

	public Alarma crearAlarma(){
		return new AlarmaA();		
	}

}
