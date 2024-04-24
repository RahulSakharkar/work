terminal 1:
javac *.java
rmic AddServerImpl
rmiregistry

terminal 2:
java C1 c1 03:25:00

terminal 3:
java C1 c2 03:00:00

terminal 4:
java C1 c3 02:55:00

terminal 5:
java MainClock c1 c2 c3