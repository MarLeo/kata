import java.util.TreeMap;

public class Kata {

  public static String high(String s) {
    
    String [] parts = s.split(" ");   
    int size = parts.length;
    int max = Integer.MIN_VALUE;
    String high = null;
    TreeMap<Character, Integer> dico = getDictionary();

    for (int i = 0; i < size; i++) {
        int wordsSize = 0;
        String word = parts[i];
        int len = word.length();

        for (int k = 0; k < len; k++) {
            //word.toLowerCase();
            Character charAt = word.charAt(k);
			wordsSize += dico.get(charAt);
        }
        
        if(wordsSize > max) {
            max = wordsSize;
            high = word;
        }
    }

    return high;
  }

  public static TreeMap<Character, Integer> getDictionary() {

      TreeMap<Character, Integer> dico = new TreeMap<>();
      dico.put('a', 1);
      dico.put('b', 2);
      dico.put('c', 3);
      dico.put('d', 4);
      dico.put('e', 5);
      dico.put('f', 6);
      dico.put('g', 7);
      dico.put('h', 8);
      dico.put('i', 9);
      dico.put('j', 10);
      dico.put('k', 11);
      dico.put('l', 12);
      dico.put('m', 13);
      dico.put('n', 14);
      dico.put('o', 15);
      dico.put('p', 16);
      dico.put('q', 17);
      dico.put('r', 18);
      dico.put('s', 19);
      dico.put('t', 20);
      dico.put('u', 21);
      dico.put('v', 22);
      dico.put('w', 23);
      dico.put('x', 24);
      dico.put('y', 25);
      dico.put('z', 26);

      return dico;
  }

}