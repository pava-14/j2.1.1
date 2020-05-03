public class Main {
    public static void main(String[] args) {

        long ticket_price = 1526241; //Цена билета в копейках
        long mile_price = 2000; //Стоимость мили в копейках
        long miles_count = ticket_price / mile_price; // Количество миль
        // Выводим результат
        System.out.printf("Миль начислено: %d", miles_count);

    }
}
