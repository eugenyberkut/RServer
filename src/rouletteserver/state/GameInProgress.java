package rouletteserver.state;

/**
 * Created by Eugeny on 25.07.2015.
 */
public class GameInProgress extends GameState {
    @Override
    public String serverAnswer() {
        return "place your bets";
    }
}
