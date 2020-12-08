package ge.edu.btu;

public class Nokia extends Simbian{
    @Override
    public String toString() {
        return super.getClass().getSuperclass().getSimpleName();
    }
}
