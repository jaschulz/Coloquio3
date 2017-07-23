package ar.uba.fi.punto5;

import java.util.ArrayList;

public class Monitor implements Observer{
	ArrayList<Alarma> alarmList;
	ArrayList<Sensor> sensorList;
	ArrayList<SensorAsync> sensorAsyncList;
	
	
	public Monitor(){
		alarmList = new ArrayList<Alarma>();
		sensorList = new ArrayList<Sensor>();
		sensorAsyncList = new ArrayList<SensorAsync>();
	}
	
	public void addSensor(Sensor sensor){
		sensorList.add(sensor);
	}
	
	public void addSensorAsyncList(SensorAsync sensor){
		sensor.registerObserver(this);
		sensorAsyncList.add(sensor);
	}
	
	public void leeSensores(){
		for(Sensor s : sensorList){
			if (s.enAlarma){
				alarmList.add(s.crearAlarma());
			}
		}
	}
	
	public void procesarAlarmas(){
		for(Alarma a : alarmList) {
			a.accionar();
		}
	}

	public void update(boolean enAlarma) {
		// TODO Auto-generated method stub
		
	}
}
