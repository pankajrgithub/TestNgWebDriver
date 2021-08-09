package Predicate;

import java.util.function.Predicate;
public class Demo2 {

	public static void main(String[] args) 
	{
		Predicate<String> p=(String s)->s.length()>4; //using string type predicate interface function
		
		System.out.println(p.test("Welcome")); //true
		System.out.println(p.test("Predicate"));//true
		System.out.println(p.test("job"));//false

	}

}
