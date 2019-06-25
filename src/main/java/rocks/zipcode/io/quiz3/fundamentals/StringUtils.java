package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {



        return str.substring(0,indexToCapitalize) + str.substring(indexToCapitalize,indexToCapitalize+1).toUpperCase()+ str.substring(indexToCapitalize+1);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {

        char[] test = baseString.toCharArray();
        if(characterToCheckFor == test[indexOfString]){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {


        Integer counter =0;


        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <string.length() ; j++) {
                counter++;

            }


        }
        String[] answer = new String[counter-1];
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j <=string.length() ; j++) {
                answer[i]= string.substring(i,j);

            }


        }

        return answer;
    }

    public static Integer getNumberOfSubStrings(String input){
        Integer counter =0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i+1; j <=input.length() ; j++) {
                counter++;

            }


        }

        return counter-1;
    }
}
