import java.rmi.*;
public interface ServerIntf extends Remote{

	double add(double num1 , double num2) throws RemoteException;
	
}

// to run
// javac *.java
// rmiregistry	(in first terminal)
// java Server  (in 2nd terminal)
// java client  (in 3rd terminal) 
// rmic ServerImpl ( creates stubs , but no role) 
