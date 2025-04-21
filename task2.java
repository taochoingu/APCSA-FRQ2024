import java.util.*;

public class Scoreboard{
  private String team1;
  private String team2;
  private int team1Score;
  private int team2Score;
  private boolean active;
  public Scoreboard(String t1, String t2){
    team1 = t1;
    team2 = t2;
    active = true;
    team1Score = 0;
    team2Score = 0;
  }
  public void recordPlay(int n){
    if (n==0 ){
      active = !active;
    }
    else if (active == true){
      team1Score+=n;
    }
    else team2Score+=n;
  }
  public String getScore(){
    if (active == true) return team1Score + "-" +  team2Score+"-" + team1;
    else return team1Score + "-"+ team2Score  +"-"+team2;
  }
}
