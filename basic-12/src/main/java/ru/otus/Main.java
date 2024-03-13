package ru.otus;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        listFileContents();

    }

    public static List<String> listAllFiles(){
        File file = new File("basic-12");
        List<String> list = new ArrayList<>();
        for (File f : Objects.requireNonNull(file.listFiles())) {
            if (f.isFile() && f.getPath().endsWith(".txt")) {
                list.add(f.getName());
            }
        }
        return list;
    }

    public static String chooseFile(){
        List<String> list = listAllFiles();
        System.out.println("Список текстовых файлов в корневой дирректории:\n " + list);
        System.out.println("Введите название файла, который вы хотите изменить");
        String inputStr = scanner.nextLine();
        String chosenFile = "";
        for (int i = 0; i < list.size(); i++) {
            if (!list.contains(inputStr))
                throw new CustomException("Файл отсутствует в списке или вы ввели некорректное значение");
            else
                chosenFile = inputStr;

        }
        System.out.println("Вы выбрали файл: " + chosenFile);
        return  chosenFile;
    }

    public static void listFileContents(){
        String chosenFile = chooseFile();
        System.out.println("Файл " + chosenFile + " содержит следующую информацию: ");

        try (FileInputStream fis = new FileInputStream("basic-12/" + chosenFile);
             BufferedInputStream bis = new BufferedInputStream(fis);
             InputStreamReader in = new InputStreamReader(bis)
        ) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nВведите текст, который вы хотите добавить в файл:");
        String inputText = scanner.nextLine();

        try (BufferedOutputStream out = new BufferedOutputStream
                (new FileOutputStream("basic-12/" + chosenFile, true))) {
            byte[] buffer = inputText.getBytes(StandardCharsets.UTF_8);
            for (byte b : buffer) {
                out.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}