import ReverseModule.ReversePOA;
import java.lang.String;

class ReverseImpl extends ReversePOA{
    ReverseImpl(){
        super();
        System.out.println("Reverse Object Created");
    }

    public String reverse_string(String name){
        StringBuffer str = new StringBuffer(name);
        str.reverse();
        return (("Server Send : " + str));
    }
}
/*	On Terminal-1: 
		idlj -fall Prime.idl	
		javac *.java PrimeApp/*.java
		orbd -ORBInitialPort 1050&

	On Terminal-2: 
		java Server -ORBInitialPort 1050 -ORBInitialHost localhost&

	On Terminal-3:
		java Client -ORBInitialPort 1050 -ORBInitialHost localhost
    
*/
