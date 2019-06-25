package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for(int i=0;i <word.length();i++) {
            if ((word.charAt(i) == 'a') ||
                    (word.charAt(i) == 'e') ||
                    (word.charAt(i) == 'i') ||
                    (word.charAt(i) == 'o') ||
                    (word.charAt(i) == 'u')) {
                return true;
            }
        }

        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for(int i=0;i <word.length();i++) {
            if ((word.charAt(i) == 'a') ||
                    (word.charAt(i) == 'e') ||
                    (word.charAt(i) == 'i') ||
                    (word.charAt(i) == 'o') ||
                    (word.charAt(i) == 'u')) {
                return i;
            }
        }


        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        word = word.toLowerCase();
        if ((word.charAt(0) == 'a') ||
                (word.charAt(0) == 'e') ||
                (word.charAt(0) == 'i') ||
                (word.charAt(0) == 'o') ||
                (word.charAt(0) == 'u')) {
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        character = Character.toLowerCase(character);

        if ((character == 'a') ||
                (character == 'e') ||
                (character == 'i') ||
                (character == 'o') ||
                (character == 'u')) {
            return true;
        }
        return false;

    }
}
