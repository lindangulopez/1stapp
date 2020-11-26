
/**
 * Write a description of Question1 here.
 * 
 * @Linda 
 * @26/11/2020
 */
public class Question1 {
public void findAbc(String input) {
    int index = input.indexOf("abc");
    while (true) {
        if (index == -1) {
            break;
        }
       
        if(index >= input.length() - 4){
        //error
        //String found = input.substring(index+1, index+4);
        //System.out.println(found);
        index = input.indexOf("abc", index+4);
        System.out.println(index);
        System.out.println(input.length());
    }
    }
}
   public void test() {
    //findAbc("abcd");
    findAbc("abcdabc");
    
}
}
