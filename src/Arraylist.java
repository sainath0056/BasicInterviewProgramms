import java.io.*;
import java.io.IOException;
import java.util.*;

class Arraylist
{
    public static void main(String[] args)
                       throws IOException
    {
       
        ArrayList<Integer> ar=new ArrayList<Integer>();
        
        for(int i=0;i<5;i++) {
        	ar.add(i);
        	}
        System.out.println(ar);
        
        ar.remove(3);
        System.out.println(ar);
    }
}
