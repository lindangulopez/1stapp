package Strings;

/**
 *
 * @Linda 
 * on 26/11/2020
 * 
 */
 
import edu.duke.*;
import java.io.*;

public class FindGeneWhile {
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
              public void testFindGeneSimple() {
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



