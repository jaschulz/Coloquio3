package ar.uba.fi.punto3;

public class Punto3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		monitor.addSensor(new SensorA(false));
		monitor.addSensor(new SensorB(false));
		monitor.addSensor(new SensorC(true));
		monitor.addSensor(new SensorMultiple(true));
		monitor.addSensor(new SensorProxy(true, new SensorA(false)));
		monitor.leeSensores();
		monitor.procesarAlarmas();

	}

}
