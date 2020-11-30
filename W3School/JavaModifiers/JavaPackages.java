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
