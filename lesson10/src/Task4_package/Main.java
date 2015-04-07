package Task4_package;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Написать проект «Виртуальная файловая система». Каждый каталог и файл представлен одним объектом (Directory/File); должны поддерживатся связи между объектами; вся файловая структура хранится в одном файле.
 * Обеспечить базовые ф-и для работы с ФС: добавление и удаление файлов и каталогов etc.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException, Exception {
        String dirfrom = input("Введите католог, из которого нужно выгрузить папки/файлы:", "");
        String fileto = input("Введите название файла для сохранения структуры папок/файлов", dirfrom);
        RandomAccessFile out = new RandomAccessFile(fileto, "rw");
        try {
            findFiles(dirfrom, out);
        } finally {
            out.close();
        }
        comands(out);
    }

    public static String input(String zamena, String filenme) {
        Scanner scanner = new Scanner(System.in);
        String inputdir, inputdirnew;
        while (true) {
            System.out.println(zamena);
            inputdir = scanner.nextLine();
            if (filenme.equals("")) {
                File dirf = new File(inputdir);
                if (dirf.exists()) break;
                else System.out.println("Такого каталога не существует!");
            } else {
                if (!inputdir.equals("")) break;
            }
        }
        if (filenme.equals(""))
            inputdirnew = (inputdir.lastIndexOf('/') != inputdir.length() - 1) ? inputdir + '/' : inputdir;
        else
            inputdirnew = filenme + inputdir;

        return inputdirnew;
    }

    private static void findFiles(String srcPath, RandomAccessFile out) throws IOException, FileNotFoundException, Exception {
        File dir = new File(srcPath);
        File[] filesDirectories = dir.listFiles(new MyFileFilter(true));
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (!files[i].getCanonicalPath().contains(".DS_Store")) { //проверка только для MacOs, потому как при создании папки создается файл  .DS_Stor из за которого вылетает прога
                out.write((files[i].getCanonicalPath() + '\n').getBytes());
            }
        }
        for (int i = 0; i < filesDirectories.length; i++) {
            if (!filesDirectories[i].getCanonicalPath().contains(".DS_Store")) { //проверка только для MacOs, потому как при создании папки создается файл  .DS_Stor из за которого вылетает прога
                String newsrcPath = filesDirectories[i] + "/";
                findFiles(newsrcPath, out);
            }
        }
    }

    private static void comands(RandomAccessFile out) {
        Scanner scanner = new Scanner(System.in);
        UserCommand cmd;
        while (!"".equals((cmd = obtainCommand(scanner)).getName())) {
            switch (cmd.getName()) {
                case "exit":
                    return;
                case "addfile":
                    String name = scanner.nextLine();

                    break;
                case "del":
                    break;
                case "adddir":
                    break;
                case "copyfile":
                    break;
                case "rename":
                    break;
                default:
                    System.out.println("Input mismatch, please try again");
            }
        }
    }

    private static UserCommand obtainCommand(Scanner sc) {
        System.out.println("Please enter the command you would like to execute");
        return new UserCommand(sc.nextLine().trim());
    }

}
