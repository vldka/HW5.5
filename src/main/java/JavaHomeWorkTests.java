public class JavaHomeWorkTests {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("---Примените несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int---");
        // Сложение
        System.out.println("Сложение: " + (a + b));

        // Вычитание
        System.out.println("Вычитание: " + (a - b));

        // Умножение
        System.out.println("Умножение: " + (a * b));

        // Деление
        System.out.println("Деление: " + (a / b));

        System.out.println("---Примените несколько арифметических операций над int и double в одном выражении---");

        double number= 5.42;
        int intNumber = 30;

        // Пример использования int и double
        System.out.println((intNumber + number) + " " + (intNumber - number) + " " + (intNumber * number) + " " + (intNumber / number));

        System.out.println("---Примените несколько логических операций (<, >, >=, <=)---");
        int num1 = 10;
        int num2 = 20;

        if (num1 < num2) {
            System.out.println(num1 + " меньше чем " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " больше чем " + num2);
        } else {
            if (num1 == num2) {
                System.out.println(num1 + " равно " + num2);
            }
        }

        if ((num1 <= num2) && (num2 >= num1)) {
            System.out.println("Оба условия верны");
        }
        System.out.println("---Получите переполнение при арифметической операции---");
        int s = Integer.MAX_VALUE; // Максимальное значение int
        s = s + 1; // Переполнение
        System.out.println("a после переполнения: " + s);
    }
}
