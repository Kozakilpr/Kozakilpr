package HomeWork.W_02_26.Flat;


import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {


        // Создаем коллекцию TreeSet с использованием компаратора по умолчанию (compareTo)
        TreeSet<Flat> flats = new TreeSet<>();
        // Добавляем несколько элементов
        flats.add(new Flat(2, 35));
        flats.add(new Flat(3, 77));
        flats.add(new Flat(5, 94));
        flats.add(new Flat(4, 57));
        // Выводим элементы коллекции, они будут отсортированы сначала по количеству комнат, а затем по площади
        for (Flat flat : flats) {
            System.out.println(flat);

        }

    }
}

