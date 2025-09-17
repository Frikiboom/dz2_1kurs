public class Sum {
    public static void main(String[] args) {
        int Suma = 0;
        if (args.length == 0) {
            System.out.println(0);
            return;
        }
        // Объединяем все аргументы
        String aArgs = String.join(" ", args);
        // Заменяем все нечисловые символы (кроме +, - и пробелов) на пробелы
        String cl = aArgs.replaceAll("[^0-9+\\-\\s]", " ");
        // Обрабатываем специальные случаи с знаками
        cl = cl.replaceAll("([+-])\\s+", "$1"); // Убираем пробелы между знаком и числом
        cl = cl.replaceAll("\\s+([+-])\\s+", " $1"); // Нормализуем пробелы вокруг знаков
        // Разбиваем на токены
        String[] tk = cl.trim().split("\\s+");
        if (tk.length == 1 && tk[0].isEmpty()) {
            System.out.println(0);
            return;
        }
        for (String tok : tk) {
            if (tok.isEmpty()) continue;
            // Проверяем, что токен является допустимым числом
            if (isValidNumber(tok)) {
                try {
                    int num = Integer.parseInt(tok);
                    
                    Suma += num;
                } catch (NumberFormatException e) { 
                }
            } else {
            }
        }
        System.out.println(Suma);
    }
    private static boolean isValidNumber(String str) {
        // Проверяем, что строка состоит из: необязательного знака + или - и одной или более цифр
        return str.matches("^[+-]?\\d+$");
    }
}