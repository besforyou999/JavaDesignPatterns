import java.util.ArrayList;

public class YoutubeChannel implements Subject {
    private ArrayList observers;
    private String url;

    public YoutubeChannel() {
        observers = new ArrayList();
    }

    public void registerSubscriber(Observer o) {
        observers.add(o);
    }

    public void removeSubscriber(Observer o) {
        int i = observers.indexOf(o);
        if ( i >= 0 ) {
            observers.remove(i);
        }
    }

    public void notifySubscribers() {
        for ( int i = 0; i < observers.size() ; i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(url);
        }
    }

    public void newVideoUploaded() { notifySubscribers();}

    public void setNewVideo(String url) {
        this.url = url;
        newVideoUploaded();
    }
}
