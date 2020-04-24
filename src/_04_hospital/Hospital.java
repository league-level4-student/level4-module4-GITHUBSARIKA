package _04_hospital;

import java.util.ArrayList;

public class Hospital {
ArrayList<Doctor> doctor;
ArrayList<Patient> patient;
public void addDoctor(Doctor doc) {
	doctor.add(doc);

}
public ArrayList<Doctor> getDoctors(){
	return doctor;
}
public void addPatient(Patient pat) {
	patient.add(pat);
	
}
public ArrayList<Patient> getPatients(){
	return patient;
}
public void assignPatientsToDoctors() {
	// TODO Auto-generated method stub
	
}
}
