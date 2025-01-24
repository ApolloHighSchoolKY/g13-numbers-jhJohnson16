//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;

public class Lab16b
{
	public static void main( String args[] )
	{
		NumberAnalyzer test = new NumberAnalyzer("5 12 9 6 1 4 8 6");
		System.out.println(test);
		System.out.println("odd count = "+test.countOdds());
		System.out.println("even count = "+test.countEvens());
		System.out.println("perfect count = "+test.countPerfects()+"\n\n");


		//add more test cases
		NumberAnalyzer exam = new NumberAnalyzer("16 7 24 40 4 11 32 15");
		System.out.println(exam);
		System.out.println("odd count = "+exam.countOdds());
		System.out.println("even count = "+exam.countEvens());
		System.out.println("perfect count = "+exam.countPerfects()+"\n\n");
		
		NumberAnalyzer quiz = new NumberAnalyzer("5 34 77 8 13 21 46 9");
		System.out.println(quiz);
		System.out.println("odd count = "+quiz.countOdds());
		System.out.println("even count = "+quiz.countEvens());
		System.out.println("perfect count = "+quiz.countPerfects()+"\n\n");

	}
}