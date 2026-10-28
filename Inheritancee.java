
public class Inheritancee {
    public static void main(String[] args) {
        calc obj = new calc();
        int r1 = obj.add(10, 10);
        int r2 = obj.sub(7, 3);
        int r3 = obj.multiply(7, 4);
        System.err.println(r1 + " " + r2 + " " + r3);
    }
}
