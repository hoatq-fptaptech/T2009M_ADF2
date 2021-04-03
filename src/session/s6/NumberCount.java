package session.s6;

public class NumberCount {
    int x=0;
    int y=0;
    int z=0;

    public synchronized void changeXY(){
        x++;
        y++;
        showXY();
    }

    public synchronized void showXY(){
        System.out.println("x= "+x);
        System.out.println("y= "+y);
    }

    public synchronized void printZ(){
        z++;
        System.out.println("Z= "+z);
    }
}
