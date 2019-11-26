public class Checker {
public static void main(String[] args) {
System.out.println(FileEdit.textToString("Convo"));
String lastMessage = FileEdit.textToString("Convo");
while (true) {
String current = FileEdit.textToString("Convo");
if (!Objects.equals(lastMessage, current)){
System.out.print(FileEdit.textToString("Convo"));
}

lastMessage = FileEdit.textToString("Convo");
}
}
}