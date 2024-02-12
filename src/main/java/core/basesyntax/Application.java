package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console

        final int ballsAmount = 3;
        Lottery lottery = new Lottery();

        for (int i = 0; i < ballsAmount; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball.toString());
        }
    }
}
