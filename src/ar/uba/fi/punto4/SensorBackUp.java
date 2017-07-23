package ar.uba.fi.punto4;

public class SensorBackUp extends Sensor {
	
	Sensor primary;
	Sensor BU;

	public SensorBackUp(boolean enAlarma, Sensor p, Sensor bu) {
		super(enAlarma);
		primary = p;
		BU = bu;
	}
	
	public Alarma crearAlarma(){
		return primary.enAlarma ? primary.crearAlarma() :BU.crearAlarma();
	}
	
	public boolean enAlarma(){
		return primary.enAlarma ? true:BU.enAlarma();
	}
	

}
