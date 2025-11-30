package demo;

public class PrintFibonacci {

	 public static void printFibonacciSequence(int count) {
	  int a = 0;
	  int b = 1;
	  int c = 1;

	  for (int i = 1; i <= count; i++) {
	   System.out.print(a + ", ");

	            a = b;
	   b = c;
	   c = a + b;
	  }
	 }

	 public static void main(String[] args) {
	     printFibonacciSequence(10);
	 }

	}
// Output
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
