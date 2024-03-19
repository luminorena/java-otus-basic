package ru.otus;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static final List<ClientHandler> clientHandlers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(6666);
        while(true) {

                Socket clientSocket = socket.accept();
                DataInputStream inputStream = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream outputStream = new DataOutputStream(clientSocket.getOutputStream());
                ClientHandler clientHandler = new ClientHandler(clientSocket, inputStream, outputStream);
                clientHandlers.add(clientHandler);

                String operationsList = operations().toString();
                outputStream.writeUTF(operationsList);
                System.out.println("список доступных операций: " + operationsList);
                String operation = inputStream.readUTF();
                System.out.println("выбранная операция: " + operation);
                double firstInput = inputStream.readDouble();
                System.out.println("первый операнд " + firstInput);
                double secondInput = inputStream.readDouble();
                System.out.println(secondInput);
                String res = firstInput + operation + secondInput;
                System.out.println("результат " + res);
                outputStream.writeUTF(res);
                outputStream.flush();
            }

    }

    public static List<String> operations() {
        List<String> list = new ArrayList<>();
        list.add("+");
        list.add("-");
        list.add("*");
        list.add("/");
        return list;
    }

}
