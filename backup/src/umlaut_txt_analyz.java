import java.util.Map;

public class umlaut_txt_analyz {


    private Map<Character, Integer> umlautCounts;

    public umlaut_txt_analyz(String text) {

        umlautCounts.put('a',0);
        umlautCounts.put('e',0);
        umlautCounts.put('i',0);
        umlautCounts.put('o',0);
        umlautCounts.put('u',0);


        for (int i = 0 ; i< text.length(); i++) {
            String x = "a";
            char c = text.charAt(i);
            if (umlautCounts.containsKey(c)){
                umlautCounts.put(c, umlautCounts.get(c)+1);
            }
        }









    }  // Ende kosntruktor

    public int getCharacterCount (char c) {

        if (umlautCounts.containsKey(c)) {
            return umlautCounts.get(c);
        } else {
            return 0;
        }
    }





}


