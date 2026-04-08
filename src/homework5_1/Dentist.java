package homework5_1;

public class Dentist extends Doctor {
    public Dentist(String name) {
        super(name);
    }

    @Override
    public void treat() {
        super.treat();
        System.out.println(name + " после осмотра вылечил кариес");
    }
}
