 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void closeAllWindows() {
        faceWall();
        while(!nextToABeeper()) {
            checkWall();
            nextSegment();
        }
    }
    
    public void faceWall() {
        while(frontIsClear()) {
            turnLeft();
        }
    }
    
    public void checkWall() {
        if(frontIsClear()) {
            putBeeper();
        }
    }
    
    public void nextSegment() {
        turnLeft();
        if (!frontIsClear()) {
            turnLeft();
        }
        move();
        turnRight();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
