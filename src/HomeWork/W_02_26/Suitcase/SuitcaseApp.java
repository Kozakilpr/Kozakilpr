package HomeWork.W_02_26.Suitcase;

import java.util.LinkedList;
import java.util.TreeSet;

public class SuitcaseApp {
    public static void main(String[] args) {
        // Создаем несколько чемоданов
        //Suitcase suitcase1 = new Suitcase("пластик", "M", "синий");
        Suitcase suitcase1 = new Suitcase("M","пластик","Red");
        Suitcase suitcase2 = new Suitcase("XL","ткань","Blau");
        Suitcase suitcase3 = new Suitcase("L","пластик","Grau");
        Suitcase suitcase4 = new Suitcase("S","ткань","Schwarz");




        // Создаем TreeSet для сортировки по размеру, материалу и цвету
        TreeSet<Suitcase> treeSet = new TreeSet<>();
        treeSet.add(suitcase1);
        treeSet.add(suitcase2);
        treeSet.add(suitcase3);
        treeSet.add(suitcase4);

        // Выводим отсортированные чемоданы из TreeSet
        System.out.println("отсортированныеs (TreeSet):");
        for (Suitcase suitcase : treeSet) {
            System.out.println(suitcase);
        }

        // Создаем LinkedList
        LinkedList<Suitcase> linkedList = new LinkedList<>();
        linkedList.add(suitcase1);
        linkedList.add(suitcase2);
        linkedList.add(suitcase3);
        linkedList.add(suitcase4);

        // Выводим чемоданы из LinkedList (они не отсортированы)
        System.out.println("\nне отсортированы (LinkedList):");
        for (Suitcase suitcase : linkedList) {
            System.out.println(suitcase);
        }
    }

}
