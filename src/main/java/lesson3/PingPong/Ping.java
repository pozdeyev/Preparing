package lesson3.PingPong;

public class Ping implements Runnable {

    Ball ball;
    Thread t;

    public Ping(Ball ball) {
        this.ball = ball;
        this.t = new Thread(this, "Ping");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            if(t.isInterrupted()) break;
            ball.ping();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                System.out.println("Прерван спящий поток Ping");
                break;
            }
        }
    }
}
