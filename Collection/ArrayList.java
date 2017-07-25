import java.util.*;  
class TestCollection1
{  
 public static void main(String args[])
 {  
  ArrayList<String> list=new ArrayList<String>();    //Creating arraylist  
  list.add("Rahul");    //Adding object in arraylist  
  list.add("Atul");  
  list.add("Ashok");  
  list.add("Shubham"); 

  //Traversing list through Iterator or we can traverse also using for-each loop
  Iterator itr=list.iterator(); 

  while(itr.hasNext())
  {  
   System.out.println(itr.next());  
  }  
 }  
}  
********************************************************************************************************************
import java.util.*;  
class TestCollection2
{  
 public static void main(String args[])
 {  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Rahul");  
  al.add("Atul");  
  al.add("Shubham");  
  ArrayList<String> al2=new ArrayList<String>();  
  al2.add("Ashok");  
  al2.add("Ajay");  
  al.addAll(al2);//adding second list in first list  
  Iterator itr=al.iterator();  
  while(itr.hasNext())
  {  
   System.out.println(itr.next());  
  }  
 }  
}  
************************************************************************************************************************
import java.util.*;  
class TestCollection3
{  
 public static void main(String args[])
 {  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Rahul");  
  al.add("Atul");  
  al.add("Ashok");  
  ArrayList<String> al2=new ArrayList<String>();  
  al2.add("Ashok");  
  al2.add("Shubham");  
  al.removeAll(al2); 
  System.out.println("iterating the elements after removing the elements of al2...");  
  Iterator itr=al.iterator();  
  while(itr.hasNext())
  {  
   System.out.println(itr.next());  
  }  
  
  }  
}  
****************************************************************************************************************************
import java.util.*;  
class TestCollection4
{  
 public static void main(String args[])
 {  
  ArrayList<String> al=new ArrayList<String>();  
  al.add("Atul");  
  al.add("Rahul");  
  al.add("Shubham");  
  ArrayList<String> al2=new ArrayList<String>();  
  al2.add("Rahul");  
  al2.add("Shubham");  
  al.retainAll(al2);  // return common elements
  System.out.println("iterating the elements after retaining the elements of al2...");  
  Iterator itr=al.iterator();  
  while(itr.hasNext())
  {  
   System.out.println(itr.next());  
  }  
 }  
}  