package StringsFirstAssignments;

/**
 * Write a description of FindGene here.
 * 
 * @author Linda Angulo Lopez 
 * @version 25/11/2020
 */
public class Part2 {
public String findSimpleGene(String dna, 
                      String StartCodon, 
                      String StopCodon) {
    // start codon "ATG"
    // stop codon "TAA"
    String resultTemp ="";
    int atg = dna.indexOf("ATG");
    int taa = dna.indexOf("TAA", atg +3);
    
        System.out.println("The start index is " + atg );
        System.out.println("The stop index is " + taa );
            //no start nor stitop codons, no gene  
            if (atg == -1 && taa == -1 ){
                return "WARNING: NO START NOR STOP CODONS!";
            }
      
            //no start codon, no gene  
            if (atg == -1){
                return "WARNING: NO START CODON!";
            }   
            //no stop codon, no gene  
            if (taa == -1){
                return "WARNING: NO STOP CODON!";
            }
             else {resultTemp = dna.substring(atg, taa+3);
                 String result = resultTemp.toLowerCase();
                 int compare = result.length()%3;
                 if (compare == 0){
                    return result;
                 }
                 else {
                    return "No valid DNA sequence found."; 
                    }
                  
             
            }
    
}


public void FindFindSimpleGene(){
String gene = ""; 
String dna = "AAAATACCAGTACCACTAAGGA";
String StartCodon = "ATG";
String StopCodon = "TAA";
System.out.println("The DNA strand is " + dna);
gene = findSimpleGene(dna, StartCodon, StopCodon);
System.out.println("The gene is " + gene);
System.out.println(""); 

//invalid DNA sequence
dna = "ATCCTATGCTTCGGCTGTCTAATATGGT";
System.out.println("The DNA strand is " + dna);
gene = findSimpleGene(dna,StartCodon, StopCodon);
System.out.println("The gene is " + gene);

//no start codon "ATG"
dna = "TAACCCCGA";
System.out.println("DNA strand is " + dna);
gene = findSimpleGene(dna,StartCodon, StopCodon);
System.out.println("Gene is " + gene);

 //no stop code codon "TAA"
dna = "ATGCCCATG";
System.out.println("DNA strand is " + dna);
gene = findSimpleGene(dna,StartCodon, StopCodon);
System.out.println("Gene is " + gene);

  }
}
