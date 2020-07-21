import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList5 {

	public static void main(String[] args) {
		
		Student_Al	s1=new Student_Al(21,"Sai",1995);
		Student_Al	s2=new Student_Al(23,"Sai",1995);
		Student_Al	s3=new Student_Al(24,"Sai",1995);
		
		
		ArrayList<Student_Al> al=new ArrayList<Student_Al>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
	//	System.out.println(Object st1=(Object)itr.next());
			
		}
		
	}

}
