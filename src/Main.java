public class Main {
    public static void main(String[] args) {
        Vector v = new Vector(3, new Double[]{3.00, 4.00, 5.00});
        Vector y = new Vector(2);
        v.print();
        System.out.println(v.add(y));
        v.print();
    }
}
