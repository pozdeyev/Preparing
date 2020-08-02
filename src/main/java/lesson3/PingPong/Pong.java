package lesson3.PingPong;

public class Pong implements Runnable {

    Ball ball;
    Thread t;

    public Pong(Ball ball) {
        this.ball = ball;
        this.t = new Thread(this, "Pong");
        t.start();
    }

    @Override
    public void run() {
        while (true) {
            if(t.isInterrupted()) break;
            ball.pong();
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                System.out.println("Прерван спящий поток Pong");
                break;
            }
        }
    }
}