package Strings;

/**
 *
 * @Linda 
 * on 26/11/2020
 * 
 */
 
import edu.duke.*;
import java.io.*;

public class AllCodons {

    public String findStopCondon(String dnaStr, int startIndex,String stopCodon) {
        int currIndex = dnaStr.indexOf(stopCodon, startIndex+3);
        
        while (currIndex != -1) {
            if((currIndex - startIndex)%3 == 0) {
                return currIndex;
             }
            else {
                 currIndex = dnaStr.indexOf(stopCodon, currIndex+1);
                 }
             
                }
                return "No Gene sequence found."; 
        }
        
         public String findGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        int currIndex = dna.indexOf("TAG", startIndex+3);
        while (currIndex != -1) {
            if((currIndex - startIndex)%3 == 0) {
                return dna.substring(startIndex,currIndex);
             }
            else {
                 currIndex = dna.indexOf("TAA", currIndex+1);
                 }
             
                }
                return ""; 
    }
      
              public void testFindStop() {
            //            012345678901234567890123456789
            String dna = "xxxyyyzzzTAAxxxyyyTAAxx";
            int dex = findStopCondon(dna, 0,"TAA");
            if(dex !=9) System.out.printlin("Error in 9");
            dex = findStopCondon(dna, 9,"TAA");
            if(dex !=21) System.out.printlin("Error in 21");
            dex = findStopCondon(dna, 1,"TAA");
            if(dex !=26) System.out.printlin("Error in 26");
            dex = findStopCondon(dna, 0,"TAA");
            if(dex !=26) System.out.printlin("Error in 26");
            System.out.printlin("Tests Finished.");

    }
    
    }



