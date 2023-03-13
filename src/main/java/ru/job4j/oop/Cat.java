package ru.job4j.oop;

public class Cat {

    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    private String food;

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println("This is " + this.name + " kitty");
        System.out.println("There are " + this.name + "'s food");
        System.out.println(this.food);

    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("kotleta");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Black");
        black.show();
    }
}