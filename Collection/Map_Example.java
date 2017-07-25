import java.util.*;  
class TestCollection
{  
 public static void main(String args[])
 {  
  HashMap<Integer,String> hm=new HashMap<Integer,String>();  
  hm.put(100,"Shubham");  
  hm.put(101,"Atul");  
  hm.put(102,"Rahul"); 
  hm.remove(102); 
  for(Map.Entry m:hm.entrySet())
  {  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  