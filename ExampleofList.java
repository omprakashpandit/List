import java.util.ArrayList;

public class ExampleofList {
 public static void main(String[] args) {
	
	  ArrayList<String> mylist=new ArrayList();
	    mylist.add("line");
	    mylist.add("polyline");
	    mylist.add("polygon");
	    mylist.add("circle");
	    System.out.println(mylist);
	    for(int i=0; i<mylist.size(); i++)
	    {
	    	//System.out.println(mylist.get(i)); 
	    	 if(mylist.get(i).contains("poly"))
	     	{
	     		System.out.println("OK");
	     	}
	    }
	   
	    
}
}
