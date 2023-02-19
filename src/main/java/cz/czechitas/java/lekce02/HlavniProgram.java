package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {  // metoda
        zofka = new Turtle();

        nakreslitCtverec();

        zofka.penUp();
        zofka.move(100d);
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(72d);
        zofka.turnRight(90);
        zofka.move(72d);

        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(150d);
        zofka.penDown();

        nakreslitCtverec();
//HLAVA
        zofka.turnRight(135);
        zofka.move(72d);
        zofka.turnLeft(90);
        zofka.move(72d);
//NOHY

        nohy();
//NOHY
        zofka.turnRight(135);
        zofka.penUp();
        zofka.move(100d);
        zofka.turnRight(45);
        zofka.penDown();

        nohy();
//OCASEK
        zofka.turnRight(45);
        zofka.penUp();
        zofka.move(50d);
        zofka.penDown();
        zofka.turnRight(105);

        ocasek();


        //TODO tady bude kod
    }

    private void ocasek() {

        for (int i = 0; i <4; i++) {

        zofka.move(15d);
        zofka.turnLeft(105);
        zofka.move(15d);
        zofka.turnRight(100);

        }
    }


    private void nohy() {
        zofka.turnRight(90);
        zofka.move(30d);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30d);

        zofka.turnRight(90);
        zofka.penDown();
        zofka.move(30d);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(30d);
    }



    private void nakreslitCtverec() {
        for (int i = 0; i < 4; i++) {
            zofka.move(100d);
            zofka.turnRight(90);
        }
    }


    public static void main(String[] args) { //aplikaci spouštíme tady tou metodou, udělá to že zavolá naši metodu start
        new HlavniProgram().start();
    } //psvm a enter je zkratka pro napsání této metody

}
