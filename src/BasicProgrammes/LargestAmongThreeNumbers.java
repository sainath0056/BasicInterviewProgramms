package BasicProgrammes;
//Programme to find largest among three numbers
public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		
		int x=1500;
		int y=600;
		int z=900;
		
		if(x>y && x>z) {
			System.out.println("X is greatest");
		}else if (y>z){
			System.out.println("Y is greatest");
		}else {
			System.out.println("Z is greatest");
		}

	}

}
