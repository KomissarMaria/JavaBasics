package Task_Human_package;

import java.util.Arrays;

/*
 * Модифицировать код для сортировки Human чтобы элементы упорядочивались по убыванию.
 */
public class Task_Human {

    public static void main(String[] args) {
        Human[] list = {new Human(7), new Human(40), new Human(60), new Human(20)};
        Arrays.sort(list, new HumanComparator());
        for (Human h : list) System.out.println(h.getAge());
    }
}
