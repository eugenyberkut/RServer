package rouletteserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by Eugeny on 25.07.2015.
 */
public class ClientHandler extends Thread {
        BufferedReader in;
        PrintWriter out;

    public ClientHandler(Socket socket) {
        //this.socket = socket;
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while ()

    }
}
