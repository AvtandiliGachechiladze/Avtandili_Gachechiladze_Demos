package ge.edu.btu;

public class Demo2 {
    public static void main(String[] args) {
        sumable sumable = (x,y)-> x + y;
        System.out.println(sumable.sum(1,2));
    }
}
