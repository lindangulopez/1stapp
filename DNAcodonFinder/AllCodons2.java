package Strings;


//package Strings;
/**
 *
 * @Linda 
 * on 26/11/2020
 * 
 */
import edu.duke.*;
import java.io.*;

public class AllCodons2 {

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
                return -1; 
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
        // int temp = Math.min(taaIndex, tagIndex);
        int minIndex = -1;
        if (taaIndex == -1|| (tagIndex != -1 && tgaIndex < taaIndex)){
        minIndex = tgaIndex;
        }
        else {
         minIndex = taaIndex;
        }
        
        if (minIndex == -1|| (tagIndex != -1 && tgaIndex < minIndex)){
        minIndex = tagIndex;
        }
        else {
         minIndex = taaIndex;
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
            if(dex != -1) System.out.printlin("Error in 26");
            dex = findStopCondon(dna, 0,"TAA");
            if(dex != -1) System.out.printlin("Error in 26");
            System.out.printlin("Tests Finished.");

    }
    
                  public void testFindGene() {
            //
            String dna = "AATGCGTAATATGGT";
            System.out.println("The DNA strand is " + dna);
            String gene = findGene(dna);
            System.out.println("The gene is " + gene);
            System.out.println(""); 

            //invalid DNA sequence
            dna = "ATCCTATGCTTCGGCTGTCTAATATGGT";
            System.out.println("The DNA strand is " + dna);
            gene = findGene(dna);
            System.out.println("The gene is " + gene);

            //no start codon "ATG"
            dna = "TAACCCCGA";
            System.out.println("DNA strand is " + dna);
            gene = findGene(dna);
            System.out.println("Gene is " + gene);

            //no stop code codon "TAA"
            dna = "ATGCCCATG";
            System.out.println("DNA strand is " + dna);
            gene = findGene(dna);
            System.out.println("Gene is " + gene);

    }
    
    }



