package ar.uba.fi.punto2;

public class Punto2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		monitor.addSensor(new SensorA(true));
		monitor.addSensor(new SensorB(false));
		monitor.addSensor(new SensorC(false));
		monitor.addSensor(new SensorMultiple(true));
		monitor.leeSensores();
		monitor.procesarAlarmas();

	}

}
