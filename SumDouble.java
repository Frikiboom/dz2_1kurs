public class SumDouble {
    public static void main(String[] args) {
        double suma = 0.0;
        int i = 0;
        String ara = "";
        if (args.length == 0) {
            System.out.println(0.0);
            return;
        } else {
            while(i < args.length) {
                for (int j = 0; j < args[i].length();j++) {
                    if (Character.isWhitespace(args[i].charAt(j)) == false) {
                        ara = String.valueOf(args[i].charAt(j));
                    }
                }
                System.out.println(ara);
                if (ara.length() > 0) {
                    System.out.println(Double.parseDouble(ara));
                    System.out.println(suma);
                    suma += Double.parseDouble(ara);
                }
                i++;
            }
        }
        






        // String it = String.join(" ", args);
        // Pattern pat = Pattern.compile("[+-]?\\d+(?:\\.\\d+)?(?:[eE][+-]?\\d+)?");
        // Matcher mat = pat.matcher(it);
        // while (mat.find()) {
        //     try {
        //         double num = Double.parseDouble(mat.group());
        //         suma += num;
        //     } catch (NumberFormatException ignored) {}
        // }
        System.out.println(suma);
    }
}