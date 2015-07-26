package rouletteserver.state;

/**
 * Created by Eugeny on 25.07.2015.
 */
public class RegisterForGame extends GameState {

    @Override
    public String serverAnswer() {
        return "registration in progress";
    }
}
