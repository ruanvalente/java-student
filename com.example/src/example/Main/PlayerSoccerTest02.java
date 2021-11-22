package example.Main;

import example.domain.PlayerSoccer;
import example.domain.Time;

public class PlayerSoccerTest02 {
    // Exmplo de associação unidirecional

    public static void main(String[] args) {
        PlayerSoccer playerSocker = new PlayerSoccer("Pelé");
        Time time = new Time("Brasil");

        playerSocker.setTime(time);

        playerSocker.showPlayerSoccerDetails();
    }
}
