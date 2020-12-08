package ge.edu.btu;

public class Demo3 {
    public static void main(String[] args) {
        IphoneX iphoneX = new IphoneX();
        printSmartphone(iphoneX);

        Nokia nokia = new Nokia();
        printSimbian(nokia);

        SamsungNote samsungNote = new SamsungNote();
        printSmartphone(samsungNote);

        Panasonic panasonic = new Panasonic();
        printSimbian(panasonic);
    }

    static <E extends Smartphone> void printSmartphone (E e) {
        System.out.println(e.toString());
    }
    static <E extends Simbian> void printSimbian  (E e) {
        System.out.println(e.toString());
    }
}
