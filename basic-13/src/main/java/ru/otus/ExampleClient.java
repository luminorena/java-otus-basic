package ru.otus;

import java.io.*;

public class ExampleClient implements AutoCloseable{
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public ExampleClient(InputStream inputStream, OutputStream outputStream) {
        this.inputStream = new DataInputStream(inputStream);
        this.outputStream = new DataOutputStream(outputStream);
    }

    public void send(String message) throws IOException {
        outputStream.writeUTF(message);
        outputStream.flush();
        String result = inputStream.readUTF();
        System.out.println(result);
    }

    public void sendDouble(double number) throws IOException {
        outputStream.writeDouble(number);
        outputStream.flush();
        double result = inputStream.readDouble();
        System.out.println(result);
    }
    @Override
    public void close() throws Exception {
        inputStream.close();
        outputStream.close();
    }
}
