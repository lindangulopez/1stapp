package StringsFirstAssignments;
import edu.duke.*;
import java.io.File;


/**
 * Write a description of Part3 here.
 * 
 * @Linda 
 * @26/11/2020
 */
public class Part4 {
    public void asd(){
        URLResource file = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        for ( String item : file.words() ) {
            String itemLower = item.toLowerCase();
            int pos = itemLower.indexOf("youtube.com");
            if ( pos != -1 ) {
                int beg = item.lastIndexOf("\"", pos);
                int end = item.indexOf("\"", pos + 1);
                System.out.println(item.substring(beg + 1, end));
        }
		
    }
	    
  }
	
}


/* URLResource file = new  URLResource("http://someURL");
   	for (String item : file.words()) {
       	   String itemLower = item.toLowerCase();
       	   int pos = itemLower.indexOf("youtube.com");
       	   if (pos != -1) {
           //MISSING CODE
           	int beg = item.lastIndexOf("\"",pos);
			int end = item.indexOf("\"", pos+1);
			System.out.println(item.substring(beg+1,end));

               }
   	}
*/
