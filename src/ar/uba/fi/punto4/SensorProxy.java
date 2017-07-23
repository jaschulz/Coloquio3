package ar.uba.fi.punto4;

public class SensorProxy extends Sensor {

	private boolean estaOnLine;
	
	private Sensor sensor;
	
	public SensorProxy(boolean enAlarma, Sensor s) {
		super(enAlarma);
		estaOnLine = false;
		sensor = s;
	}
	
	public void setEstaOnLine(boolean estaOnLine){
		this.estaOnLine = estaOnLine;
	}
	
	public boolean estaOnLine(){
		return estaOnLine;
	}
	
	public Alarma crearAlarma(){
		return sensor.crearAlarma();
	}
	
	public boolean enAlarma(){
		return (estaOnLine) ? sensor.enAlarma():false;
	}

}
