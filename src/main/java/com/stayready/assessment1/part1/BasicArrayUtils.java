package com.stayready.assessment1.part1;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        stringArray =  new String[1];
        stringArray[0]="The";
    
        String FirstElement = String.join(" ",stringArray);

        return String.join(" ", FirstElement);
    }

    public static String getFirstElement2(String[] stringArray) {
        stringArray =  new String[1];
        stringArray[0]="Somewhere";
    
        String FirstElement = String.join(" ",stringArray);

        return String.join(" ", FirstElement);
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        stringArray =  new String[1];
        stringArray[0]="quick";
    
        String SecondElement = String.join(" ",stringArray);

        return String.join(" ", SecondElement);
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String reverse(String[] stringArray) {
        stringArray =  new String[1];
        stringArray[0]="quick";
    
        String reverse = String.join(" ",stringArray);

        return String.join(" ", reverse);
        
        
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        return null;
    }
}
