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
public void assignPatient(Patient pat) {
	patient.add(pat);
}
}
