package structural.proxy;

public class Main {
    public static void main(String[] args) {
        Remote remote = new LazyRemote();
        remote.turnOn();
        remote.turnOff();
    }
}
