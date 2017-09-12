
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void escapeRoom() {
        findWall();
        followWall();
    }
    
    public void findWall() {
        while(frontIsClear()) {
            move();
        }
    }
    
    public void followWall() {
        while(!frontIsClear()) {
            checkWall();
        }
        leaveRoom();
    }
    
    public void checkWall() {
        turnLeft();
        if (frontIsClear()) {
            move();
            turnRight();
        }
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void leaveRoom() {
        move();
        turnOff();
    }
}

