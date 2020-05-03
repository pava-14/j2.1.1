public class Main {
    public static void main(String[] args) {

        long ticketPrice = 1526241; //Цена билета в копейках
        long milePrice = 2000; //Стоимость мили в копейках
        long milesCount = ticketPrice / milePrice; // Количество миль
        // Выводим результат
        System.out.printf("Миль начислено: %d", milesCount);

    }
}
