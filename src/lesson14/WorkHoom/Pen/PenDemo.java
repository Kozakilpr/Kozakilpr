package lesson14.WorkHoom.Pen;




public class PenDemo {
        public static void main(String[] args) {

        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        Pen pen3 = new Pen();

        Pen[] L = {pen1, pen2, pen3};


        L[0].setColor("Green");
        L[1].setColor("Red");
        L[2].setColor("Black");


        for (int i = 0; i < L.length; i++) {
            System.out.println("Pen " + (i + 1) + " color: " + L[i].getColor());
        }


    }}




