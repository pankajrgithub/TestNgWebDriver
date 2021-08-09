package Predicate;

import java.util.function.Predicate;
public class Demo3 {

	public static void main(String[] args) {
		Predicate<String> p=(String s)->(s.length()>4); //lambda expression
		
	    
	    String sname[]= {"Tom","john","Mary","smith","larry"}; //to check condition in array
	    
	   for(String name:sname)
	   {
		   if(p.test(name))
		   {
			   System.out.println(name);
		   }
	   }	   				
	}
}
