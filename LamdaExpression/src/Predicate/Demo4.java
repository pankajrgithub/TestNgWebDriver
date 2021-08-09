package Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;
class Employee
{
	public String name;
	public int Salary;
	public int Exprience;

Employee(String ename,int Sal,int Exp)
{
	name=ename;
	Salary=Sal;
	Exprience=Exp;
}

}

public class Demo4 
{

	/**
	 * @param args
	 */
	public static void main(String... args)
	{
		//Ex-01
		//Employee emp=new Employee("Ram",80000,4);
	
		/*
		Predicate<Employee> pe= e->(e.Salary>30000 && e.Exprience>3);
		
		System.out.println(pe.test(emp));  */
		
		//Ex-02 
		Predicate<Employee> pr= e->(e.Salary>3000 && e.Exprience>3);
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		
		al.add(new Employee("Mohan",4000,3));
		al.add(new Employee("monika",2000,2));
		al.add(new Employee("Dinesh",3000,4));
		al.add(new Employee("monika",6000,5));
		al.add(new Employee("monika",1000,4));
		
		for(Employee e:al)
		{
			if(pr.test(e))
			{
			System.out.println("name of employee:" +e.name +"Exprience:" +e.Exprience);
			}
			
		}	
		
	}
}
