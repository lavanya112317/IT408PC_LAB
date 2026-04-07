import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Collections;

class L6P1{
   public static void main(String[] args){
     ArrayDeque<String> ad = new ArrayDeque(); 
     System.out.println(ad.isEmpty());
     ad.add("Blue");
     ad.add("Black");
     ad.add("Yellow");
     ad.add("Green");
     ad.add("White");
     System.out.println(ad);

     ArrayList<String> l=new ArrayList<>();
     l.addAll(ad);
     String s=l.get(3);
     l.remove(s); 
     ad.clear();
     ad.addAll(l); 
     System.out.println(ad);

     Collections.sort(l);
     System.out.println(l);  
     ad.clear();
     ad.addAll(l);
     System.out.println(ad);

     System.out.println(ad.peek());

     ad.clear();
     System.out.println(ad.isEmpty());
     
  }
}
