package Task1_pakage;

import java.util.Scanner;

/*
 Написать программу в стиле ООП, которая будет рисовать на консоли прямоугольник с заданными длинами сторон
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height, weight;

        System.out.println("Введите высоту прямоугольника:");
        height = scanner.nextInt();
        System.out.println("Введите ширину прямоугольника:");
        weight = scanner.nextInt();

        Rectangle rec1 = new Rectangle(height, weight);
        rec1.print();
    }
}

