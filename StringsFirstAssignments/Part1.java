package StringsFirstAssignments.GenomicScience;

/**
 * Write a description of FindGene here.
 * 
 * @author Linda Angulo Lopez 
 * @version 07/11/2020
 */
public class Part1 {
public String findSimpleGene(String dna) {
    // start codon "ATG"
    // stop codon "TAA"
    String result ="";
    int startIndex=dna.indexOf("ATG");
        System.out.println("The start index is " + startIndex );
            //no stqrt codon, no gene  
            if (startIndex == -1){
                return "WARNING: NO START CODON!";
            }
      
     int stopIndex=dna.indexOf("TAA", startIndex+3);
            //no stop codon, no gene  
            if (stopIndex == -1){
                return "WARNING: NO STOP CODON!";
            }
     
            while  (stopIndex != -1)   {
            //varify that valid codons of length 3 are in the splice
            if ((stopIndex-startIndex)%3==0){
                result = dna.substring(startIndex, stopIndex+3);
            }
            else{
            return "WARNING:INVALID SEQUENCE OF CODONS!";
            }
            }    
    


    
    return result;    
    
}

public void FindGeneTest(){
String dna = "AATGCGTAATATGGT";
System.out.println("The DNA strand is " + dna);
String gene = findSimpleGene(dna);
System.out.println("The gene is " + gene);
System.out.println(""); 

//invalid DNA sequence
dna = "ATCCTATGCTTCGGCTGTCTAATATGGT";
System.out.println("The DNA strand is " + dna);
gene = findSimpleGene(dna);
System.out.println("The gene is " + gene);

//no start codon "ATG"
dna = "TAACCCCGA";
System.out.println("DNA strand is " + dna);
gene = findSimpleGene(dna);
System.out.println("Gene is " + gene);

 //no stop code codon "TAA"
dna = "ATGCCCATG";
System.out.println("DNA strand is " + dna);
gene = findSimpleGene(dna);
System.out.println("Gene is " + gene);

    }
}