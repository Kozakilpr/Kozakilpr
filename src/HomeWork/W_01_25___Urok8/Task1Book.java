package HomeWork.W_01_25___Urok8;

public class Task1Book {
    private String author;
    private String title;
    private int pageCount;
    private int catalogNumber;
    private boolean available;

    // Конструктор класса
    public Task1Book(String author, String title, int pageCount, int catalogNumber, boolean available) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.catalogNumber = catalogNumber;
        this.available = available;
    }

    // Метод для получения автора книги
    public String getAuthor() {
        return author;
    }

    // Метод для получения названия книги
    public String getTitle() {
        return title;
    }

    // Метод для получения количества страниц
    public int getPageCount() {
        return pageCount;
    }

    // Метод для получения номера в каталоге
    public int getCatalogNumber() {
        return catalogNumber;
    }

    // Метод для проверки доступности книги
    public boolean isAvailable() {
        return available;
    }

    // Метод для изменения доступности книги
    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Переопределение метода toString для вывода информации о книге
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pageCount=" + pageCount +
                ", catalogNumber=" + catalogNumber +
                ", available=" + available +
                '}';
    }
}
