package lesson3.PingPong;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Ping ping = new Ping(ball);
        Pong pong = new Pong(ball);
        try{
            Thread.sleep(5000);}
        catch (InterruptedException ex){
            System.out.println("Прерван основной поток");
        }
        ping.t.interrupt();
        pong.t.interrupt();
        System.out.println("Статус потока пинг:"+ping.t.getState());
        System.out.println("Статус потока понг:"+pong.t.getState());
    }
}
