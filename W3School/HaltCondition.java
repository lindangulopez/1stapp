/*
Halting Condition
Just as loops can run into the problem of infinite looping, recursive functions can run into the problem of 
infinite recursion. Infinite recursion is when the function never stops calling itself. Every recursive
function should have a halting condition, which is the condition where the function stops calling itself. 
In the previous example, the halting condition is when the parameter k becomes 0.

It is helpful to see a variety of different examples to better understand the concept. In this example, 
the function adds a range of numbers between a start and an end. The halting condition for this recursive
function is when end is not greater than start:

Use recursion to add all of the numbers between 5 to 10.

*/

public class Main {
  public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println(result);
  }
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
}
