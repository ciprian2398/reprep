package soccerPack;

public class Goal {
    private Team scoredTeamName;
    private Player scoredPlayerName;
    private double time;

    public Goal(Team scoredTeam, Player scoredPlayer, double time) {
        this.scoredTeamName = scoredTeam;
        this.scoredPlayerName = scoredPlayer;
        this.time = time;
    }

    public Goal() {
        }

        @Override
    public String toString() {
        return time+"\t "+scoredTeamName+"\t "+scoredPlayerName;
    }

    public Team getScoredTeamName() {
        return scoredTeamName;
    }

    public void setScoredTeamName(Team scoredTeamName) {
        this.scoredTeamName = scoredTeamName;
    }

    public Player getScoredPlayerName() {
        return scoredPlayerName;
    }

    public void setScoredPlayerName(Player scoredPlayerName) {
        this.scoredPlayerName = scoredPlayerName;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
