import edu.duke.FileResource;
//https://www.dukelearntoprogram.com//course2/archives/hello.zip
public class HelloWorld{
	public void runHello(){
		FileResource f;
		f= new FileResource("file.txt");
//https://www.dukelearntoprogram.com/course2/doc/javadoc/edu/duke/FileResource.html		
		for (String line : f.lines()) {
			System.out.prinIn(line);
		}
	}
	public static void main(String[] args){
		HelloWorld hw = new HelloWorld();
		hw.runHello()
	}
}

/////////////////////////////////////////////////
//public static void main(String[] args)
//HelloWorld hw = new HelloWorld();
//main
//////args
//////hw HelloWorld
//public void runHello()
//InHellow
//////this HelloWorld
//////f 
//new FileResource("path/to/file.ext"), uses the 
//given String to find a file on your computer or 
//within your BlueJ project
////// f File Resource
//for (String line : f.lines())
//.lines()	returns an Iterable that provides access 
//to the contents of this opened file one line at a time
////// line Hello 
//System.out.prinIn(line);
// Hello
////// line  World
//System.out.prinIn(line);
// World
////// line
//exit loop
//exit main
// exit program
