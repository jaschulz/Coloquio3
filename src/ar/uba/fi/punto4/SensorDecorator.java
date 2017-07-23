package ar.uba.fi.punto4;

public class SensorDecorator extends Sensor {
	
	Sensor sensor;

	public SensorDecorator(boolean enAlarma, Sensor sensor) {
		super(enAlarma);
		System.out.println("Sensor de tipo " + sensor.getClass() + " creado");
		this.sensor = sensor;
	}
	
	public Alarma crearAlarma(){
		System.out.println("Decorador crea Alarma de tipo soportado por el sensor " + sensor.getClass());
		return sensor.crearAlarma();
	}

}
