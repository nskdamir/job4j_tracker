package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String word = "Don't know";
        return word;
        }

    public static void main(String[] args) {
        DummyDic man = new DummyDic();
        String eng = man.engToRus();
        System.out.println("Неизвестное слово. " + eng);
    }
}
