package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();

        ball.roll();
        hare.tryEat(ball);
        ball.roll();
        wolf.tryEat(ball);
        ball.roll();
        fox.tryEat(ball);
    }
}
