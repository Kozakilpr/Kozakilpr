package HomeWork.W_02_26.Suitcase;

import org.w3c.dom.ls.LSOutput;

public class Suitcase implements Comparable<Suitcase> {
    private String size;
    private String material;
    private String color;

    public Suitcase(String size, String material, String color) {
        this.size = size;
        this.material = material;
        this.color = color;
    }

    public String getSize() {
        return size;
    }
    public String getMaterial() {
        return material;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Suitcase{" +
                "size='" + size + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    @Override
    public int compareTo(Suitcase other) {
        int compare = this.size.compareTo(other.size);
        if (compare == 0) {
            compare = this.material.compareTo(other.material);
            if (compare == 0) {
                compare = this.color.compareTo(other.color);
            }
        }
        return compare;
    }

}



