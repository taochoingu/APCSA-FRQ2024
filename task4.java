import java.util.ArrayList;
public class Location
{
  private int theRow;
  private int theCol;
  public Location(int r, int c)
{
  theRow = r;
  theCol = c;
}
public int getRow()
{ return theRow; }
public int getCol()
{ return theCol; }
}
public class GridPath{
  private int[][] grid;
  public Location getNextLoc(int row, int col){
    if(row == grid.length -1 ) return new Location(row,col + 1);
    else if (col == grid[0].length -1 ) return new Location (row + 1,col);
    else if (grid[row+1][col]< grid[row][col+1]) return new Location(row + 1,col);
    else return new Location(row,col + 1);
  }
  public int sumPath(int row, int col){
    int r = row;
    int c = col;
    int sum = grid[row][col];
    
    while (!(r == grid.length - 1 && c == grid[0].length - 1)){
        Location next = getNextLoc(r, c); 
        r = next.getRow();
        c = next.getCol();
        sum += grid[r][c];               
    }
    return sum;
}
}
