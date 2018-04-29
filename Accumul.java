public class Accumul {

    public static String accum(String s) {

        StringBuilder result = new StringBuilder();
        int size = s.length();

        for (int i = 0; i < size; i++) {
            if (i == 0) {
                result.append(Character.toUpperCase(s.charAt(i)));
                result.append("-");
            } else {
                int k = i;
                char innerChar = s.charAt(i);
                result.append(Character.toUpperCase(innerChar));
                for (k = 0; k < i; k++) {
                    result.append(Character.toLowerCase(innerChar));             
                }
                if(i < size - 1 && k == i) {
                    result.append("-");
                } 
            }   
        }

        return result.toString();
    }
}