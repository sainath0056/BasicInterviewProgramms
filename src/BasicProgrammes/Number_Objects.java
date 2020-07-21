package BasicProgrammes;

public class Number_Objects {
	  int count=0;
	 Number_Objects(){
		 
		 count++;
	 }
	 public void number() {
		 
		 System.out.println("number of objects:"+count);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Number_Objects obj1=new Number_Objects();
		Number_Objects obj2=new Number_Objects();
		Number_Objects obj3=new Number_Objects();
		Number_Objects obj4=new Number_Objects();
		obj4.number();
		

	}

}
