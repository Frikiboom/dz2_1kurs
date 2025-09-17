import java.util.regex.*;
public class Sum {
    public static void main(String[] args) {
        int suma = 0;
        if (args.length == 0) {
            System.out.println(0);
            return;
        }
        // Объединяем все аргументы в строку
        String input = String.join(" ", args);

        // Ищем только числа с опциональным знаком + или -
        Pattern pattern = Pattern.compile("[+-]?\\d+");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            try {
                int num = Integer.parseInt(matcher.group());
                suma += num;
            } catch (NumberFormatException ignored) {}
        }
        System.out.println(suma);
    }
}
