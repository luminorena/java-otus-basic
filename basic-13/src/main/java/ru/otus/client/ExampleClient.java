package ru.otus.client;

import java.io.*;

public class ExampleClient implements AutoCloseable {
    private final DataInputStream inputStream;
    private final DataOutputStream outputStream;

    public ExampleClient(InputStream inputStream, OutputStream outputStream) {
        this.inputStream = new DataInputStream(inputStream);
        this.outputStream = new DataOutputStream(outputStream);
    }

    public void send(String message) throws IOException {
        outputStream.writeUTF(message);
        outputStream.flush();
    }

    public void sendDouble(double number) throws IOException {
        outputStream.writeDouble(number);
        outputStream.flush();
    }

    @Override
    public void close() throws Exception {
        inputStream.close();
        outputStream.close();
    }
}
