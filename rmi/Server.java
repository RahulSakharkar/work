import java.rmi.*;
public class Server{
	public static void main(String[] args){
		
	try{
		ServerImpl serverimpl = new ServerImpl();
		Naming.rebind("Server", serverimpl);
	}
	
	catch(Exception e){
		System.out.println("exception occurred "+e);
		
	}
	
}}
