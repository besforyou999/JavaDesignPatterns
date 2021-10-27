public class Subscriber4 implements Observer, DisplayElement {
    private String url;
    private Subject youtubeChannel;

    public Subscriber4(Subject youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
        youtubeChannel.registerSubscriber(this);
    }

    public void update(String url) {
        this.url = url;
        display();
    }

    public void display() {
        System.out.println("Subscriber4 : " + url);
    }
}
