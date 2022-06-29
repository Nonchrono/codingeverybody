package projectMethod;

import java.util.Spliterator;

public class WhyMethod {

	public static void main(String[] args) {

								// 인자, argument
		printTwoTimes("a", "-");
		
		 // 1억번 반복
		 printTwoTimes("a", "*");
	     
	     // 1억번 반복
		 printTwoTimes("a", "&");
		 printTwoTimes("b", "!");
		 
	}

														// 매개변수, parameter
	public static void printTwoTimes(String text, String delimiter) {
		 System.out.print(delimiter);
		 System.out.println(delimiter);
	     System.out.println(text);
	     System.out.println(text);
	}   

}
