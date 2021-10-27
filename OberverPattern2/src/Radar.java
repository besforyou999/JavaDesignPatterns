import java.util.ArrayList;

public class Radar implements Subject {
    private ArrayList observers;
    private double pos_x;
    private double pos_y;

    public Radar() {
        observers = new ArrayList();
    }

    public void registerAllyObject(Observer o) {
        observers.add(o);
    }

    public void removeAllyObject(Observer o) {
        int i = observers.indexOf(o);
        if ( i >= 0 ) {
            observers.remove(o);
        }
    }

    public void notifyObjects() {
        for ( int i = 0; i < observers.size() ; i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(pos_x, pos_y);
        }
    }

    public void newEnemyDetected() { notifyObjects();}

    public void setNewEnemyPosition(double x, double y) {
        this.pos_x = x;
        this.pos_y = y;
        newEnemyDetected();
    }
}
