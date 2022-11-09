public interface UserSubject {
    public void attach(Observer observer);
    public void notifyObservers();
}
