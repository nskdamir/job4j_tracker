package ru.job4j.oop;

public class Error {
    private String message;
    private boolean active;
    private int status;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void ourInfo() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error red = new Error();
        Error orange = new Error(true, 4, "Пиво");
        orange.ourInfo();
        red.ourInfo();
    }
}