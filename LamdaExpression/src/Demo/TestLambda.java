package Demo;

@FunctionalInterface
interface Cab
{
	public void bookCab();
}

/*class Uber implements Cab
{
	public void bookCab()
	{
		System.out.println("cab booked");
	}
}*/

public class TestLambda {

	public static void main(String[] args) 
	{
     Cab cabbook=()-> System.out.println("cab book");
     cabbook.bookCab();
	}

}
