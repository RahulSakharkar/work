import java.rmi.*;
import java.util.Scanner;

public class client{
	public static void main(String[] args){
		try{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first number");
		double num1= sc.nextDouble();
		System.out.println("enter second number");
		double num2= sc.nextDouble();
		
		String serverUrl="rmi://localhost/Server";
		ServerIntf serverintf= (ServerIntf) Naming.lookup(serverUrl);
		
		System.out.println("sum is "+ serverintf.add(num1,num2));
		}
		
		catch(Exception e){ System.out.println("Exception "+e);}
	}
}
