import java.util.ArrayList;
import java.util.List;

public class Main { // здесь у меня не получилось обозвать класс как то иначе, кроме как Main. Я выянсил, что нужно поменять наименование в папке проекта с main.java на Phonebook.java. Мне не помогло + меня и так какие то баги постоянно, я забил и оствил так, так как это не суть важно. Хотя бы так работает.

    public static void main(String[] args) {

        // Создаю массив номеров, где прописываю корректные и не корректные номера, которые должен будет проверить код
        String[] phoneNumbers = {
                "+79503521605",    // корректный номер
                "+79103806697",   // корректный номер
                "+7950352",    // номер малой длины и начинающийся на +7
                "+795035216005",         // номер длинной на 1 цифру больше, чем нужно и начинающийся на +7
                "7123456789",     // номер без +
                "+7abcdef123",    // номер с буквами
                "+79999999999",// корректный номер, но с одинаковыми цифрами и начинающийся с +7ge
                "+99503521605" // номер начинающийся с +9
        };

        // Фильтруем корректные номера
        List<String> validCodes = filterValidNumbers(phoneNumbers);

        // Сортируем через Insertion Sort
        insertionSortNumbers(validCodes);

        // Вывод результата
        for (String number : validCodes) {
            System.out.println(number);
        }
    }

    // Проверка номера на корректность
    public static boolean isValidPhoneNumber(String number) {

        // Номер должен начинаться с +7
        if (!number.startsWith("+7")) {
            return false;
        }

        // Общая длина номера должна быть 12 символов (+7 + 10 цифр)
        if (number.length() != 12) {
            return false;
        }

        // Проверяем, что после '+' только цифры
        String digitsOnly = number.substring(1); // убираем '+'
        if (!digitsOnly.matches("\\d+")) {
            return false;
        }

        return true; // номер прошел все проверки
    }

    // Фильтрация массива номеров
    public static List<String> filterValidNumbers(String[] numbers) {
        List<String> validCodes = new ArrayList<>();

        for (String number : numbers) {
            if (isValidPhoneNumber(number)) {
                validCodes.add(number);
            }
        }

        return validCodes;
    }

    // Сортировка номеров через Insertion Sort
    public static void insertionSortNumbers(List<String> numbers) {
        for (int i = 1; i < numbers.size(); i++) {

            String key = numbers.get(i);
            long keyValue = Long.parseLong(key.substring(1)); // без '+'
            int j = i - 1;

            while (j >= 0 &&
                    Long.parseLong(numbers.get(j).substring(1)) > keyValue) {

                numbers.set(j + 1, numbers.get(j));
                j--;
            }

            numbers.set(j + 1, key);
        }
    }
}

