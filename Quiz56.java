import java.util.Scanner;
public class Quiz56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(studying(null)+" is studying");

	}
	public static String studying(String name)
	{
		if(name==null)
		{
			return "Nobody";
		}
		return name;
	}

}
