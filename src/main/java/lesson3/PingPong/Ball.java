package lesson3.PingPong;

public class Ball {

    public enum Variant {PING,PONG}
    Variant direction;

    synchronized public void ping() {
        while (direction == Variant.PONG) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Перехвачено исключение прерывания в потоке " + Thread.currentThread().getName());
            }
        }
        System.out.println("ping");
        direction = Variant.PONG;
        notify();
    }

    synchronized public void pong() {
        while (direction == Variant.PING) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.out.println("Перехвачено исключение прерывания в потоке " + Thread.currentThread().getName());
            }
        }
        System.out.println("pong");
        direction = Variant.PING;
        notify();
    }
}
