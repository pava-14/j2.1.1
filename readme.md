# Задача № 1 "Мили"

## Краткое описание

1. Создано базовое приложение. 
2. Используется три переменные, типа long:
    * ticketPrice - цена билета в копейках
    * milePrice - стоимость мили в копейках
    * milesCount - Количество начисленных миль
3. Для вывода результата используется форматированный вывод.

## Код

```java
public class Main {
    public static void main(String[] args) {

        long ticketPrice = 1526241; //Цена билета в копейках
        long milePrice = 2000; //Стоимость мили в копейках
        long milesCount = ticketPrice / milePrice; // Количество миль
        // Выводим результат
        System.out.printf("Миль начислено: %d", milesCount);

    }
}
```
