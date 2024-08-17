package main.javacore.androiddev.introduction.algorithmExercise.domain;

public class Challenger {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 50;
        int c = 40;

        int sumAB = a + b;

        if (sumAB < c) {
            System.out.println("A soma entre A e B são menores que C sendo ela " + sumAB +
                    " enquanto C vale: " + c);
        } else {
            System.out.println("A + B é maior que C, sendo que AB é: " + sumAB + " e C vale: " + c);
        }

        System.out.println("#####################");
    }
}
