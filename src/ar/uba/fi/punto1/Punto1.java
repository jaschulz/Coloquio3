package ar.uba.fi.punto1;

public class Punto1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		monitor.addSensor(new SensorA(true));
		monitor.addSensor(new SensorB(true));
		monitor.addSensor(new SensorC(true));
		monitor.leeSensores();
		monitor.procesarAlarmas();

	}

}
