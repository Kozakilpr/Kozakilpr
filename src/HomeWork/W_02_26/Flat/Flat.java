package HomeWork.W_02_26.Flat;

class Flat implements Comparable<Flat> {
    private int bedrooms;
    private double area;


    public Flat(int bedrooms,double area) {

        this.bedrooms = bedrooms;
        this.area = area;
    }

    // Реализация метода compareTo для сортировки по количеству комнат
    @Override
    public int compareTo(Flat other) {
        int compare = Integer.compare(this.bedrooms, other.bedrooms);
        if (compare == 0) {
            compare = Integer.compare((int) this.area, (int) other.area);
        }
        return compare;


    }


    @Override
    public String toString() {
        return "Flat{" +
                " bedrooms= " + bedrooms +
                " area=" + area +
                '}';
    }


}
