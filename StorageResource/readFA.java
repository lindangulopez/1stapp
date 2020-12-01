FileResource fr = new FileResource("GRch38dnapart.fa");
String dna = fr.asString();
int len = dna.length();
System.out.println("The strand length is " + len);
