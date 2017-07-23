package ar.uba.fi.punto4;

public class Punto4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		monitor.addSensor(new SensorDecorator(true,new SensorA(false)));
		monitor.addSensor(new SensorDecorator(true,new SensorB(false)));
		monitor.addSensor(new SensorDecorator(true,new SensorC(false)));
		monitor.addSensor(new SensorDecorator(true,new SensorMultiple(false)));
		monitor.addSensor(new SensorDecorator(true,new SensorProxy(false, new SensorA(true))));
		monitor.leeSensores();
		monitor.procesarAlarmas();

	}

}
