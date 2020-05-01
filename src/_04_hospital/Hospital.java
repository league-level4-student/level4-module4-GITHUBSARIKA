package _04_hospital;

import java.util.ArrayList;

public class Hospital {
ArrayList<Doctor> doctor=new ArrayList<Doctor>();
ArrayList<Patient> patient=new ArrayList<Patient>();
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
	int doctorr=0;
	
		for (int j = 0; j < patient.size(); j++) {
		try {
			doctor.get(doctorr).assignPatient(patient.get(j));
		} catch (DoctorFullException e) {
			// TODO Auto-generated catch block
			j--;
			doctorr++;
			
		}
		}                                               
	}
}

