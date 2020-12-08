package ge.edu.btu;

public class IphoneX extends Smartphone{
    @Override
    public String toString() {
        return super.getClass().getSuperclass().getSimpleName();
    }
}
