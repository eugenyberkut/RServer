package rouletteserver.state;

/**
 * Created by Eugeny on 25.07.2015.
 */
public class WaitingStart extends GameState{

    @Override
    public String serverAnswer() {
        return "not started yet. wait.";
    }
}
