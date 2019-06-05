import java.util.Scanner;
public class Quiz56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(studying("Romil,Jao"));
		System.out.println(studying("Naveen,Carolini"));
		
	}
	public static String studying(String name)
	{
		String x=name.substring(name.indexOf(",")+1);
		String y=name.substring(0, name.indexOf(","));
		return y+" and "+x +" are studying";
	}

}
