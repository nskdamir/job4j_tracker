package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare zayka = new Hare();
        zayka.tryEat(kolobok);
        Wolf volk = new Wolf();
        volk.tryEat(kolobok);
        Fox lisa = new Fox();
        lisa.tryEat(kolobok);
    }
}