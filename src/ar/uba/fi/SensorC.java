package ar.uba.fi;

public class SensorC extends Sensor {

	public SensorC(boolean enAlarma) {
		super(enAlarma);
	}
	
	public Alarma crearAlarma(){
		return new AlarmaC();
	}

}
