package HomeWork.W_01_19;

public class Task3 {
    public static void main(String[] args) {

        int priceA = 1000;

        int priceB = 500;

        int discount = 100;


        int totalWithoutDiscount = priceA + priceB;

        int totalWithDiscount = totalWithoutDiscount - discount;


        System.out.println("Стоимость суммы A+B со скидкой: " + totalWithDiscount + " руб.");

        System.out.println("Сумма скидки: " + discount + " руб.");
    }
}
