package ge.edu.btu;

public class SamsungNote extends Smartphone{
    @Override
    public String toString() {
        return super.getClass().getSuperclass().getSimpleName();
    }
}
