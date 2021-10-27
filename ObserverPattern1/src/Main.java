public class Main {
    public static void main(String [] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();

        Subscriber1 subscriber1 = new Subscriber1(youtubeChannel);
        Subscriber2 subscriber2 = new Subscriber2(youtubeChannel);
        Subscriber3 subscriber3 = new Subscriber3(youtubeChannel);
        Subscriber4 subscriber4 = new Subscriber4(youtubeChannel);

        youtubeChannel.setNewVideo("New uploaded video url");
        youtubeChannel.setNewVideo("Video url2");

        youtubeChannel.removeSubscriber(subscriber3);
        youtubeChannel.removeSubscriber(subscriber4);

        youtubeChannel.setNewVideo("Video url3");

        youtubeChannel.registerSubscriber(subscriber4);

        youtubeChannel.setNewVideo("Video url4");
    }
}
