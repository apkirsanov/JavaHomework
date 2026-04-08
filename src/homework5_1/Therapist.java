package homework5_1;

public class Therapist extends Doctor {
    public Therapist(String name) {
        super(name);
    }
        @Override
        public void treat() {
            super.treat();
            System.out.println(name + " после осмотра выписал таблетки от простуды");
        }
        public void assignDoctor(Patient patient, Therapist therapist, Dentist dentist, Surgeon surgeon) {
            int treatmentPlan = patient.getTreatmentPlan();
            if (treatmentPlan == 1) {
                patient.setDoctor(surgeon);
                System.out.println("Назначен " + surgeon.name);
            } else if (treatmentPlan == 2) {
                patient.setDoctor(dentist);
                System.out.println("Назначен " + dentist.name);
            } else {
                patient.setDoctor(therapist);
                System.out.println(name + " назначил сам себя");
            }
        }
    }

