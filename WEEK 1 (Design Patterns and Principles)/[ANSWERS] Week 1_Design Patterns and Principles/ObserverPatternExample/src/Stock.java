public interface Stock {
    void registerObserver(Observer observer);

    void notifyObservers();
}
