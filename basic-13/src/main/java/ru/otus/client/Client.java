package ru.otus.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try (Socket socket = new Socket("localhost", 6666)) {
                ExampleClient client = new ExampleClient(socket.getInputStream(),
                        socket.getOutputStream());
                System.out.println("Введите операцию:");
                DataInputStream inputStream = new DataInputStream(socket.getInputStream());
                System.out.println(inputStream.readUTF());
                String operation = scanner.nextLine();
                System.out.println("Введите первое число:");
                double firstNumber = scanner.nextDouble();
                System.out.println("Введите второе число:");
                double secondNumber = scanner.nextDouble();
                client.send(operation);
                client.sendDouble(firstNumber);
                client.sendDouble(secondNumber);
                System.out.println(inputStream.readUTF());

                if (operation.equals("exit")) {
                    break;
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
