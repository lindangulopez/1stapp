/*
Import a Package

There are many packages to choose from. In the previous example, we used the Scanner class from the java.util package. This package also contains date and time facilities, random-number generator and other utility classes.

To import a whole package, end the sentence with an asterisk sign (*). The following example will import ALL the classes in the java.util package:
*/

import java.util.*;

/*

User-defined Packages

To create your own package, you need to understand that Java uses a file system directory to store them. Just like folders on your computer:
Example

└── root
  └── mypack
    └── MyPackageClass.java

To create a package, use the package keyword:

*/

package mypack;
class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}

/*
Save the file as MyPackageClass.java, and compile it:
C:\Users\Your Name>javac MyPackageClass.java

Then compile the package:
C:\Users\Your Name>javac -d . MyPackageClass.java

This forces the compiler to create the "mypack" package.

The -d keyword specifies the destination for where to save the class file. You can use any directory name, like c:/user (windows), or, if you want to keep the package within the same directory, you can use the dot sign ".", like in the example above.

Note: The package name should be written in lower case to avoid conflict with class names.

When we compiled the package in the example above, a new folder was created, called "mypack".

To run the MyPackageClass.java file, write the following:
C:\Users\Your Name>java mypack.MyPackageClass

The output will be:
This is my package!

*/
