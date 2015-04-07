package Task2_package;

public class Task2 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(5, 8);
        System.out.println(rec.findsquare());
        rec.print();

        Triangle tr = new Triangle(5);
        System.out.println(tr.findsquare());
        tr.print();

        Circle cr = new Circle(10);
        System.out.println(cr.findsquare());

    }

}
