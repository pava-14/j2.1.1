# Задача № 1 "Мили"

## Краткое описание

1. Создано базовое приложение. 
2. Используется три переменные, типа long:
    * ticket_price - цена билета в копейках
    * mile_price - стоимость мили в копейках
    * miles_count - Количество начисленных миль
3. Для вывода результата используется форматированный вывод.

## Код

```java
    public class Main {
    public static void main(String[] args) {

        long ticket_price = 1526241; //Цена билета в копейках
        long mile_price = 20000; //Стоимость мили в копейках
        long miles_count = ticket_price / mile_price; // Количество миль
        // Выводим результат
        System.out.printf("Миль начислено: %d", miles_count);

    }
}
```
