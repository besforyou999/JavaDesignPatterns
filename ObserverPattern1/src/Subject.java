public interface Subject {
    public void registerSubscriber(Observer o);
    public void removeSubscriber(Observer o);
    public void notifySubscribers();
}
