import java.util.Scanner;
public class Quiz56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the name of person who is studying");
		Scanner keyboard= new Scanner(System.in);
		String x= keyboard.nextLine();
		System.out.println(studying(x)+" is studying");

	}
	public static String studying(String name)
	{
		return name;
	}

}
