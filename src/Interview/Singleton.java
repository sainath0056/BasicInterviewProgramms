package Interview;

public class Singleton {
	//Declare a static reference variable of class. 
	//Static is needed to make it available globally.
	private static Singleton singleton_instance=null;
	public String str;
	
	
	//Creating private Constructor
	private Singleton() {
		str="Hey I am Single Ton pattern";
	}
	
	
	//lazy initialization
	//Declare a static method with return type as object of class 
	//which should check if class is already instantiated once.
	public static Singleton getInstance() {
		if(singleton_instance==null)
			singleton_instance =new Singleton();
		return singleton_instance;
		}
	

	public static void main(String[] args) {
		
		Singleton x= Singleton.getInstance();
		Singleton y= Singleton.getInstance();
		Singleton z= Singleton.getInstance();
		
           x.str= (x.str).toUpperCase();
           System.out.println(x.str);
           System.out.println(y.str);
           System.out.println(z.str);
           
           z.str= (z.str).toLowerCase();
           System.out.println(x.str);
           System.out.println(y.str);
           System.out.println(z.str);
           
           
           
	}

}
