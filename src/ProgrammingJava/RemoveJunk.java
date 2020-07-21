package ProgrammingJava;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s="!@#$$%%^^^&&&&& ^&^&^&^&^&^ $#$# SAINATH$ 4428";
		s=s.replaceAll("[^a-zA-Z0-9]", "");//We can store same variable as in 's' is immuatble
		System.out.println(s);

	}

}
