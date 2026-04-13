package homework5_1;

public abstract class Doctor {
    protected String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void treat() {
        System.out.println("Врач проводит осмотр");
    }

}
