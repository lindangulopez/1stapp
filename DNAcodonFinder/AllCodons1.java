package Strings;

/**
 *
 * @Linda 
 * on 26/11/2020
 * 
 */
 
import edu.duke.*;
import java.io.*;

public class AllCodons1 {

    public String findStopCondon(String dnaStr, int startIndex, String stopCodon) {
        int currIndex = dnaStr.indexOf(stopCodon, startIndex+3);
       
        while (currIndex != -1) {
            int diff = (currIndex - startIndex);
            if(diff % 3 == 0) {
               return currIndex;
             }
            else {
                 currIndex = dnaStr.indexOf(stopCodon, currIndex+1);
                 }
             
                }
                return dnaStr.length(); 
        }
        
   public String findGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        int currIndex = dna.indexOf("TAG", startIndex+3);
        if (startIndex != -1) {
        return ""; 
        }
        int taaIndex = findStopCondon(dna, startIndex, "TAA");
        int tagIndex = findStopCondon(dna, startIndex, "TAG");
        int tgaIndex = findStopCondon(dna, startIndex, "TGA");
        int temp = Math.min(taaIndex, tagIndex);
        int minIndex = Math.min(temp, tgaIndex);
        if (minIndex ==dna.length()){
        return "";
        }
        return dna.substring(startIndex, minIndex+3);          
                    
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



