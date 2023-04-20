import java.util.Scanner; import java.util.regex.Matcher; import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        String time = new String();                                     // Переменная времени
        System.out.print("Введите время [00:00]: ");                    // Запрос пользователю
        Scanner sc = new Scanner(System.in);                            // Сканнер для ввода
        String text = sc.nextLine();                                    // Ввод пользователем
        Pattern pattern = Pattern.compile("\\d{2}:\\d{2}");       // Шаблон
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {                                        // Проверка введенного с шаблоном
            time = (text.substring(matcher.start(), matcher.end()));
        }
        if (Integer.parseInt(time.substring(0, 2)) > 23 || Integer.parseInt(time.substring(3, 4)) > 59) {   // Если пользователь вышел за рамки
            System.out.println("Такого времени не существует! Перепроверь значения [23:59]");
        }
        else {                                                          // Если пользователь правильно ввел время
            System.out.println("Текущее время [" + time + "]");
        }
    }
}