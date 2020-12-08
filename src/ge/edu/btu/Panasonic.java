package ge.edu.btu;

public class Panasonic extends Simbian{
    @Override
    public String toString() {
        return super.getClass().getSuperclass().getSimpleName();
    }
}
