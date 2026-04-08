package homework5_1;

public class Surgeon extends Doctor {
    public Surgeon(String name) {
        super(name);
    }

    @Override
    public void treat() {
        super.treat();
        System.out.println(name + " после осмотра провела операцию и вырезала опухоль");
    }
}
