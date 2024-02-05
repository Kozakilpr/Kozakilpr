package lesson14.WorkHoom.Pen;

public class PenDemo2 {

        public static void main(String[] args) {

            Pen pen1 = new Pen();
            Pen pen2 = new Pen();
            Pen pen3 = new Pen();

            Pen[] L = {pen1, pen2, pen3};


            L[0].setColor("Green");
            L[1].setColor("Red");
            L[2].setColor("Black");

            Pen[] pensArray = new Pen[3];

            // Збереження об'єктів у масив
            pensArray[0] = pen1;
            pensArray[1] = pen2;
            pensArray[2] = pen3;

            // Зміна кольорів ручок у масиві
            pensArray[0].setColor("Green");
            pensArray[1].setColor("Red");
            pensArray[2].setColor("Black");

            // Виведення кольорів ручок
            for (Pen pen : pensArray) {
                System.out.println("Pen color: " + pen.getColor());
            }




            /*for (int i = 0; i < L.length; i++) {
                System.out.println("Pen " + (i + 1) + " color: " + L[i].getColor());
            }*/


        }}


