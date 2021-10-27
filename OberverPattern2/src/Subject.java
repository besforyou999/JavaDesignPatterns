public interface Subject {
    public void registerAllyObject(Observer o);
    public void removeAllyObject(Observer o);
    public void notifyObjects();
}
