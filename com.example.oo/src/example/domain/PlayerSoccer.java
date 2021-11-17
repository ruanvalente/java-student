package example.domain;

import java.util.Objects;

public class PlayerSoccer {
    private String name;
    private Time time;

    public PlayerSoccer(String name) {
        this.name = name;
    }

    public PlayerSoccer() {}

    public void showPlayerSoccerDetails()  {
        if(Objects.nonNull(this.name) && Objects.nonNull(this.time))  {

            System.out.println("Jogador: " + this.name);
            System.out.println("Time: " + time.getName());
        } 
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Time getTime() {
        return this.time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

   
}