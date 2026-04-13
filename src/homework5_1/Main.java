package homework5_1;
/*
Создать программу для имитации работы клиники. Пусть в клинике будет три
врача: хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но
каждый врач лечит по-своему. Так же предусмотреть класс «Пациент» с полем
«План лечения» и полем «Доктор». Создать объект класса «Пациент» и
добавить пациенту план лечения. У терапевта создать метод, который будет
назначать врача пациенту согласно плану лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод
лечить.
Если план лечения имеет любой другой код – назначить терапевта и
выполнить метод
лечить.
 */
public class Main {
    public static void main(String[] args) {
        Therapist therapist = new Therapist("Терапевт Валера");
        Dentist dentist = new Dentist("Стоматолог Коля");
        Surgeon surgeon = new Surgeon("Хирург Жанна");

        Patient patient = new Patient("Артем", 1);
        therapist.assignDoctor(patient, therapist, dentist, surgeon);
        patient.getDoctor().treat();

        System.out.println("--------------------");

        Patient patient1 = new Patient("Вика", 2);
        therapist.assignDoctor(patient1, therapist, dentist, surgeon);
        patient1.getDoctor().treat();

        System.out.println("--------------------");

        Patient patient2 = new Patient("Серега", 3);
        therapist.assignDoctor(patient2, therapist, dentist, surgeon);
        patient2.getDoctor().treat();
    }
}
