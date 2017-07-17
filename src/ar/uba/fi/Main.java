package ar.uba.fi;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Monitor monitor = new Monitor();
		monitor.addSensor(new SensorA(false));
		monitor.addSensor(new SensorB(false));
		monitor.addSensor(new SensorC(false));
		monitor.addSensor(new SensorMultiple(false));
		monitor.addSensor(new SensorDecorator(true,new SensorProxy(false, new SensorA(true))));
		monitor.leeSensores();
		monitor.procesarAlarmas();

	}

}
