package Task4_package;

/*
 Придумать любую свою иерархию классов, на основе объектов реального мира
 */
public class Task4 {
    public static void main(String[] args) {
        Thysanura Cheshyinica = new Thysanura("Чешуйница сахарная");
        System.out.println(Cheshyinica);

        Collembola Myholovka = new Collembola("Мухоловка");
        System.out.println(Myholovka);

        Endopterygota Verbludka = new Endopterygota("Верблюдка");
        System.out.println(Verbludka);

        Exopterygota Sarancha = new Exopterygota("Саранча");
        System.out.println(Sarancha);

    }
}
