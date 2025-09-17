import java.util.regex.*;
public class Sum {
    public static void main(String[] args) {
        int suma = 0;
        if (args.length == 0) {
            System.out.println(0);
            return;
        }
        String it = String.join(" ", args);
        Pattern pat = Pattern.compile("[+-]?\\d+");
        Matcher mat = pat.matcher(it);
        while (mat.find()) {
            try {
                int num = Integer.parseInt(mat.group());
                suma += num;
            } catch (NumberFormatException ignored) {}
        }
        System.out.println(suma);
    }
}
