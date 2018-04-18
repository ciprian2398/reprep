package utility;
import soccerPack.*;

import java.util.ArrayList;
import java.util.List;

public class GameUtils {
    public ArrayList<Goal> addGameGoals(){
        ArrayList<Goal> goals = new ArrayList<Goal>();
        goals.add(new Goal(new Team(new League().createTeam().get(1).getNameTeam()), new Player("Penelope Fabe"), 10.40));
        goals.add(new Goal(new Team(new League().createTeam().get(1).getNameTeam()), new Player("Pipio Francesco"), 17.26));
        goals.add(new Goal(new Team(new League().createTeam().get(0).getNameTeam()), new Player("Ruslan Ruslanaci"), 37.54));
        goals.add(new Goal(new Team(new League().createTeam().get(0).getNameTeam()), new Player("Robert Daniel"), 43.43));
        goals.add(new Goal(new Team(new League().createTeam().get(1).getNameTeam()), new Player("Patric Spanchbobovich"), 77.31));
        goals.add(new Goal(new Team(new League().createTeam().get(1).getNameTeam()), new Player("Peter Mari"), 85.02));
        return goals;
    }


    @Override
    public String toString(){
        String string="";
        ArrayList<Goal> goals = new GameUtils().addGameGoals();
        for(Goal g: goals) {
            string += new Team(new League().createTeam().get(1).getNameTeam()) + " " + new Player().getNamePlayer() + " " + new Goal().getTime() + "/n" ;
        }
        return string;
    }
}
