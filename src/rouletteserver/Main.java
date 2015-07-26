package rouletteserver;

import rouletteserver.state.GameState;
import rouletteserver.state.WaitingStart;

import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * Created by Eugeny on 25.07.2015.
 */
public class Main {
    private GameState state;
    private List<ClientHandler> handlers;
    private static Main main;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        state = new WaitingStart();
        Properties props = new Properties();
        try {
            props.load(new FileReader("roulette.ini"));
            ServerSocket serverSocket = new ServerSocket(
                    Integer.parseInt(props.getProperty("port"))
            );
            handlers = new ArrayList<>();
            while (true) {
                Socket socket = serverSocket.accept();
                ClientHandler handler = new ClientHandler(socket);
                handlers.add(handler);
                handler.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Main getMain() {
        return main;
    }


}
