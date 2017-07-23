package ar.uba.fi.punto3;

import java.util.ArrayList;

public class Monitor{
	ArrayList<Alarma> alarmList;
	ArrayList<Sensor> sensorList;
	
	
	public Monitor(){
		alarmList = new ArrayList<Alarma>();
		sensorList = new ArrayList<Sensor>();
	}
	
	public void addSensor(Sensor sensor){
		sensorList.add(sensor);
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

}
