import java.util.regex.*;
public class SumDouble {
    public static void main(String[] args) {
        double suma = 0.0;
        if (args.length == 0) {
            System.out.println(0.0);
            return;
        }
        String it = String.join(" ", args);
        Pattern pat = Pattern.compile("[+-]?\\d+(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");
        Matcher mat = pat.matcher(it);
        while (mat.find()) {
            try {
                double num = Double.parseDouble(mat.group());
                suma += num;
            } catch (NumberFormatException ignored) {}
        }
        System.out.println(suma);
    }
}