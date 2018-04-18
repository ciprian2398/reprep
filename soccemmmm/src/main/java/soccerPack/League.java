package soccerPack;

import utility.*;
import java.util.ArrayList;
import java.util.Scanner;

public class League {

    public ArrayList<Team> createTeam(){
        ArrayList<Team> teams = new ArrayList<Team>();
        teams.add(new Team("Real Madrid"));
        teams.add(new Team("Paris Saint Germain"));
        return teams;
    }

    public ArrayList<Game> createGame(ArrayList<Team> teams){
        ArrayList<Game> games = new ArrayList<Game>();
        games.add(new Game( teams.get(0) , teams.get(1)) );
        return games;
    }




    public static void main(String[] args) {
        new League().createGame(new League().createTeam());
        System.out.println(new GameUtils().addGameGoals());
    }





        //setting up team
      /*  Team realMadridTeam = new Team("Real Madrid");
        Player raduPopa = new Player("Radu Popa");
        realMadridTeam.addPlayer(raduPopa);
        Player robinHood = new Player("Robin Hood");
        realMadridTeam.addPlayer(robinHood);

        realMadridTeam.addPlayer(new Player("Robin Hood"));
        realMadridTeam.addPlayer(new Player("Robert Daniel"));
        realMadridTeam.addPlayer(new Player("Ramzan Cadirov"));
        realMadridTeam.addPlayer(new Player("Ruslan Ruslanaci"));
        realMadridTeam.addPlayer(new Player("Radion Radionovich"));

        Team parisSaintGermainTeam = new Team("Paris Saint Germain");
        Player peterMari = new Player("Peter Mari");
        parisSaintGermainTeam.addPlayer(peterMari);
        Player pavelDmitich = new Player("Pavel Dmitich");
        parisSaintGermainTeam.addPlayer(pavelDmitich);

        parisSaintGermainTeam.addPlayer(new Player("Penelope Fabe"));
        parisSaintGermainTeam.addPlayer(new Player("Pipio Francesco"));
        parisSaintGermainTeam.addPlayer(new Player("Pinocchio Lemnar"));
        parisSaintGermainTeam.addPlayer(new Player("Patric Spanchbobovich"));

        //goals
        Game firstGame = new Game(realMadridTeam , parisSaintGermainTeam);
        firstGame.addGoal(new Goal(parisSaintGermainTeam , pavelDmitich , 43.4));
        firstGame.addGoal(new Goal(parisSaintGermainTeam , peterMari , 10.3));
        firstGame.addGoal(new Goal(realMadridTeam , raduPopa , 17.33));
        firstGame.addGoal(new Goal(realMadridTeam , robinHood , 33.7));

        realMadridTeam.showPlayers();
        System.out.println("");
        parisSaintGermainTeam.showPlayers();

        System.out.println("");
        System.out.println("");
        firstGame.showGoals();

        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("In which team you want to search\n" +
                "1) Real Madrid\n" +
                "2) Paris Saint Germain ");
        int choise = input.nextInt();

        System.out.println("Which is the name of the player");
        String inputName = input.next();

        switch (choise){
            case 1:
                realMadridTeam.SearchName(inputName);
                break;
            case 2:
                parisSaintGermainTeam.SearchName(inputName);
                break;
        } */

}
