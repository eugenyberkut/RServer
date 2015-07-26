package rouletteserver.state;

import rouletteserver.Main;

/**
 * Created by Eugeny on 25.07.2015.
 */
public abstract class GameState {
    public abstract String serverAnswer();
    public void receiveQuery(String query) {
        Main.getMain().processQuery(query);
    }
}
