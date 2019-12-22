package model;

public interface MyProvider {
String username="NATIVE";
String password="NATIVE";


//String connUrl="jdbc:oracle://localhost:1521/NATIVE-DB";
//String connUrl="jdbc:oracle:thin@localhost:1521:NATIVE-DB";
//String connUrl ="jdbc:oracle:thin:NATIVE/NATIVE@NATIVE-DB";
String connUrl = "jdbc:oracle:thin:@localhost:1521:xe";
//String connUrl = "jdbc:oracle:cic:@localhost:1521:xe:NATIVE-DB";
//String connUrl = "jdbc:oracle:thin:@NATIVE-DB";
}
