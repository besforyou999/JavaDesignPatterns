public class Subscriber1 implements Observer, DisplayElement {
    private String url;
    private Subject youtubeChannel;

    public Subscriber1(Subject youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
        youtubeChannel.registerSubscriber(this);
    }

    public void update(String url) {
        this.url = url;
        display();
    }

    public void display() {
        System.out.println("Subscriber1 : " + url);
    }
}
