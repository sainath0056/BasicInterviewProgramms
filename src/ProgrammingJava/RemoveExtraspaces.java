package ProgrammingJava;

public class RemoveExtraspaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "   Hello Geeks  .  Welcome ,    Do you love Geeks , Geeks  ? ";
		//remove spaces using replaceALL
	    //System.out.println(str.replaceAll("\\s+"," ").trim()); 
	    char[] strArray=str.toCharArray();
	    StringBuffer sb=new StringBuffer();
	    for(int i=0;i<str.length();i++) {
	    	if((strArray[i]!=' ') && (strArray[i]!='\t')){
	    		sb.append(strArray[i]);
	    	}
	    }
	    String noSpaceStr2 = sb.toString();  
        System.out.println(noSpaceStr2);
	}

}
