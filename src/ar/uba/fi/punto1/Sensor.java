package ar.uba.fi.punto1;

public abstract class Sensor {
	protected boolean enAlarma;
	
	
	public Sensor(boolean enAlarma){
		this.enAlarma = enAlarma;
	}
	
	public boolean enAlarma() {
		return enAlarma;
	}
	
	public abstract Alarma crearAlarma();
}
