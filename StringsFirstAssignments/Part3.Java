package StringsFirstAssignments;
import edu.duke.*;
import java.io.File;


/**
 * Write a description of Part3 here.
 * 
 * @Linda 
 * @25/11/2020
 */
public class Part3 {
public boolean twoOccurrences(String stringa, String stringb) {
    int subStringIndex =stringb.indexOf(stringa);
    if(subStringIndex == -1){
        System.out.println("The string: " + stringa +" does not occur in: " + stringb);
        return false;
        }
    else{
    System.out.println("The string: " + stringa + "occurs at index: " + subStringIndex + "in: " + stringb);
    return true;
    }
    
}
    

public String lastPart(String stringa, String stringb) {
    int subStringIndex = stringb.indexOf(stringa);
    String remainderString = stringb.substring(subStringIndex + stringa.length());
    System.out.println("The remainder of the string is:");
    if (subStringIndex==-1){
    return stringb;
    }
    else{
    return remainderString;
    }  
}
    
public void testing() {
    String stringa = "by"; 
    String stringb = "A story by Abby Long"; 
    System.out.println("The string:" + stringa +" occur in: " + stringb);
    System.out.println(twoOccurrences(stringa,stringb));
    System.out.println("");

    stringa = "a"; 
    stringb = "banana"; 
    System.out.println("Does the string:" + stringa +" occur in: " + stringb);
    System.out.println(twoOccurrences(stringa,stringb));    
    System.out.println("");
    
    stringa = "a"; 
    stringb ="melocoton"; 
    System.out.println("Does the string:" + stringa +" occur in: " + stringb);
    System.out.println(twoOccurrences(stringa,stringb));    
    System.out.println("");
    
    stringa ="zoo"; 
    stringb ="forest"; 
    System.out.println("Does the string:" + stringa +" occur in: " + stringb);
    System.out.println(twoOccurrences(stringa,stringb));
    System.out.println("");
}

public void testingLastPart(String stringa, String stringb) {
    stringa = "by"; 
    stringb = "A story by Abby Long"; 
    System.out.println("The remainder after" + stringa + "in" + stringb + "is" + lastPart(stringa,stringb));
    System.out.println("");

    stringa = "a"; 
    stringb = "banana"; 
    System.out.println("The remainder after" + stringa + "in" + stringb + "is" + lastPart(stringa,stringb));
    System.out.println("");
    
    stringb = "a"; 
    stringb ="melocoton"; 
    System.out.println("The remainder after" + stringa + "in" + stringb + "is" + lastPart(stringa,stringb));
    System.out.println("");
    
    stringa ="zoo"; 
    stringb ="forest"; 
    System.out.println("The remainder after" + stringa + "in" + stringb + "is" + lastPart(stringa,stringb));

}

}
