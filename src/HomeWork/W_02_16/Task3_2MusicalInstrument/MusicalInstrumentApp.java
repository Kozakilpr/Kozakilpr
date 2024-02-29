package HomeWork.W_02_16.Task3_2MusicalInstrument;

public class MusicalInstrumentApp {
    public static void main(String[] args) {
        // Создание объектов инструментов
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Violin violin = new Violin();

        // Воспроизведение нот на инструментах
        guitar.playNote();
        piano.playNote();
        violin.playNote();
    }
}
