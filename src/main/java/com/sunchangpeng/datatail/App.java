package com.sunchangpeng.datatail;

import com.github.shyiko.mysql.binlog.BinaryLogClient;

import java.io.IOException;

public class App {
    public static final String USER = "root";
    public static final String PASSWORD = "root";
    public static final String HOST = "localhost";
    public static final int PORT = 3306;

    public static void main(String[] args) throws IOException {
        BinaryLogClient client = new BinaryLogClient(HOST, PORT, USER, PASSWORD);
        client.registerEventListener(event -> {
            System.out.println(event);
        });

        client.connect();
    }
}
