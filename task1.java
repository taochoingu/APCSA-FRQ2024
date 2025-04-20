import java.util.*;
import java.lang.Math;
public class Feeder{
  private int currentFood;
  public void simulateOneDay(int numBirds){
    double condition = Math.random();
    int consumed = (int) (Math.random()*41)+10;
    if (condition<0.05 || consumed*numBirds >= currentFood){
      currentFood = 0;
    }
    else currentFood -= consumed*numBirds;
  }
  public int simulateManyDays(int numBirds, int numDays){
    int count=0;
    while(currentFood>0 && numDays > 0){
      simulateOneDay(numBirds);
      numDays--;
      count++;
    }
    return count;
  }
}
