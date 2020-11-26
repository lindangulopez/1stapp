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

public class AllGenesTest {
    String dna = "AATGCGTAATATGGT";
    public String findStopCondon(String dnaStr, int startIndex, String stopCodon) {
        int currIndex = dnaStr.indexOf(stopCodon, startIndex+3);
       
        while (currIndex != -1) {
            int diff = (currIndex - startIndex);
            if(diff % 3 == 0) {
               System.out.println(currIndex );
             }
            else {
                 currIndex = dnaStr.indexOf(stopCodon, currIndex+1);
                 }
             
                }
               System.out.println(-1 );
        }
        
   public String findGene(String dna, int where) {
        int startIndex = dna.indexOf("ATG", where);
        if (startIndex != -1) {
        return ""; 
        }
        int taaIndex = findStopCondon(dna, startIndex, "TAA");
        int tagIndex = findStopCondon(dna, startIndex, "TAG");
        int tgaIndex = findStopCondon(dna, startIndex, "TGA");
        // int temp = Math.min(taaIndex, tagIndex);
        int minIndex = 0;
        if (taaIndex == -1|| (tagIndex != -1 && tgaIndex < taaIndex)){
        minIndex = tgaIndex;
        }
        else {
         minIndex = taaIndex;
        }
        
        if (minIndex == -1 &&  tgaIndex < minIndex){
        minIndex = tagIndex;
        }
        if (minIndex == -1) {
         return "";
        }
        return dna.substring(startIndex, minIndex+3);          
                    
        }
   public void testOn(String dna){
       System.out.println("Testing printAllGenes on" + dna);
       printAllGenes(dna);

       }
   public void printAllGenes(){
            int startIndex =0;
            String dna = "xxxyyyzzzTAAxxxyyyTAAxx";
            while (true) {
                      String currentGene = findGene(dna, startIndex);
                      if (currentGene.isEmpty()){
                        break;
                        }
                      System.out.println(currentGene);
                      startIndex = dna.indexOf(currentGene,startIndex) + currentGene.length();
            }
            
     }
            
              public void test() {
            //               01234567890123456789012345678901234567890123
            String testOn = "AAAATACCAGTACCACTAAGGAAAAATACCAGTACCACTAAGGA";
            testOn = "";
            //        012345678901234567890123456
            testOn = "AATACCAGTACCACTAAGGAAAAATAC";


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



