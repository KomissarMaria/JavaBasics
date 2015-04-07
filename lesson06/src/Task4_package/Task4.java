package Task4_package;

import java.io.*;

/**
 Добавить исключения в задачу про вычисление значения выражения вида «1+23*3-5»
 */
public class Task4 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите математическое выражение:");
        String str = reader.readLine();

        char[] stroka = str.toCharArray();
        double rezult = 0.0, number;
        String strnum;
        int i = 0;

        while (i < stroka.length) {
            switch (stroka[i]) {
                case '+':
                    strnum = findnumber(stroka, i + 1);
                    number = Double.parseDouble(strnum);
                    rezult += number;
                    i += strnum.length() + 1;
                    break;
                case '-':
                    strnum = findnumber(stroka, i + 1);
                    number = Double.parseDouble(strnum);
                    rezult -= number;
                    i += strnum.length() + 1;
                    break;
                case '*':
                    strnum = findnumber(stroka, i + 1);
                    number = Double.parseDouble(strnum);
                    rezult *= number;
                    i += strnum.length() + 1;
                    break;
                case '/':
                    strnum = findnumber(stroka, i + 1);
                    number = Double.parseDouble(strnum);
                    rezult /= number;
                    i += strnum.length() + 1;
                    break;
                case '=':
                    i++;
                    break;
                default:
                    strnum = findnumber(stroka, i);
                    number = Double.parseDouble(strnum);
                    rezult += number;
                    i += strnum.length();
                    break;
            }
        }

        System.out.println("Математическое выражение =  " + rezult);
    }

    public static String findnumber(char[] stroka, int j) {
        String str = "";
        while (stroka[j] != '+' & stroka[j] != '-' & stroka[j] != '*' & stroka[j] != '/' & j < stroka.length) {
            str += stroka[j];
            j++;
            if (j == stroka.length) break;
        }
        return str;
    }

}
