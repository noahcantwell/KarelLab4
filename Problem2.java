
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void plantBeepers() {
        faceWall();
        lineBeepers();
    }
    
    public void faceWall() {
        while(frontIsClear()) {
            turnLeft();
        }
    }
    
    public void lineBeepers() {
        while(!nextToABeeper()) {
            setBeeper();
            
            if(frontIsClear()) {
                roundCorner();
            }
        }
    }
    
    public void setBeeper() {
        putBeeper();
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
    
    public void roundCorner() {
        move();
        turnRight();
        move();
        turnRight();
    }
}

