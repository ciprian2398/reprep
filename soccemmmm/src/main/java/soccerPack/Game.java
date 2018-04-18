package soccerPack;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Team homeTeam;
    private Team awayTeam;
    private List<Goal> goalList;

    public Game() {
    }

    public void addGoal(Goal goal){
        goalList.add(goal);
    }

    public Game(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        goalList = new ArrayList<Goal>();
    }

    public void showGoals(){
        System.out.println("List of goals:");
        for (Goal goal:goalList) {
            System.out.println(goal.toString());
        }
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public void playGame(int number){
        for (int n=0;n<number;n++){
            Team scoreTeam = (Math.random() < 0.5)?homeTeam:awayTeam;
            int max = scoreTeam.getPlayerList().size();
            Player scoredPlayer = scoreTeam.getPlayerList().get((int)Math.random()*max);
            goalList.add(new Goal(scoreTeam , scoredPlayer , Math.random()*max));
        }
    }

    public int playGame(){
       playGame(6);
    }

}
