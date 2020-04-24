package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	ArrayList<Patient> patient=new ArrayList<Patient>();
public boolean performsSurgery() {
	return false;
}
public boolean makesHouseCalls() {
	return false;
}
public void assignPatient(Patient pat) throws DoctorFullException{
	if(patient.size()>3) {
		throw  new DoctorFullException();
	}else {
		patient.add(pat);
	}
	
	
}
public  ArrayList<Patient> getPatients() {
	
	return patient;
	
}
public void doMedicine() {
     for (int i = 0; i < patient.size(); i++) {
		  patient.get(i).checkPulse();
	} 
}
}
