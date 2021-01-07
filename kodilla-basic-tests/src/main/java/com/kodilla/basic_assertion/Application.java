package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct1 = ResultChecker.assertEquals(13, sumResult);
        if (correct1) {
            System.out.println("Metoda sum działa poprawnie na liczbach " + a + " i " + b);
             }
        else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int substractResult = calculator.substract(a, b);
        boolean correct2 = ResultChecker.assertEquals(-3, substractResult);
        if (correct2) {
            System.out.println("Metoda różnicy działa poprawnie na liczbach " + a + " i " + b);
        }
        else {
            System.out.println("Metoda różnicy nie działa poprawnie na liczbach " + a + " i " + b);
        }

        int c = 7;
        int squareResult = calculator.square(c);
        boolean correct3 = ResultChecker.assertEquals(49, squareResult);
        if (correct3) {
            System.out.println("Metoda podnosząca do kwadratu działa poprawnie na liczbie " + c);
        }
        else {
            System.out.println("Metoda podnosząca do kwadratu nie działa poprawnie na liczbie " + c);
        }
    }
}
