import java.util.Scanner;

public class TokenRing{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. of nodes in ring: ");
		int n= sc.nextInt();
		
		System.out.println("ring is formed");
		for(int i=0;i<n;i++){
			System.out.print(i+"-");
		}
		System.out.println(0);
		
		int choice=1;
		
		while(choice==1){
		
			System.out.println("enter sender: ");
			int sender= sc.nextInt();
			
			System.out.println("enter receiever: ");
			int reciever= sc.nextInt();
			
			System.out.println("enter data: ");
			int data= sc.nextInt();
			
			
			int token=0;				//token initially at 0th node
			System.out.println("Token Passing- ");	//token is passed from 0th node to sender
			for(int i=token; i<sender;i++){
				System.out.print(" "+i+"->");
			}
			System.out.print(sender+"\n");
			System.out.println("sender "+sender+" sending data "+data);
			
				
			for(int i=sender;i!=reciever; i=(i+1)%n)	//from sender to reciever, sending data
			{
				System.out.println("Data: "+ data+" forwarded by "+ i); 	
				
			}
			System.out.println(" Reciever "+reciever+" recieved data "+ data);	//receieved data
			token=sender;	//token sent back to the sender with acknowledgement
			
			System.out.println("do you want to send data again? Enter 1 for yes, 0 for no");
			choice= sc.nextInt();
			
		}
	
	}
}


// javac TokenRing.java
// java TokenRing
