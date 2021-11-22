package example.Main;

import example.domain.PlayerSoccer;

public class PlayerSoccerTest {
    public static void main(String[] args) {
        PlayerSoccer playerSocker01 = new PlayerSoccer("Pelé");
        PlayerSoccer playerSocker02 = new PlayerSoccer("Romário");
        PlayerSoccer playerSocker03 = new PlayerSoccer("Cafu");

        PlayerSoccer[] playerSockers = { playerSocker01, playerSocker02, playerSocker03 };

        for (PlayerSoccer playerSoccer : playerSockers) {
            playerSoccer.showPlayerSoccerDetails();
        }
    }
}
