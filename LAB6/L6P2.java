import java.util.PriorityQueue;

class L6P2{
  public static void main(String[] args){
        PriorityQueue<String> pq= new PriorityQueue<>();
        pq.isEmpty();
        pq.add("White");
        pq.add("Green");
        pq.add("Brown");
        pq.add("Black");
        pq.add("Pink");
        System.out.println(pq.size());
        int k=1;
        for(String a:pq){
           if(k==4){
             pq.poll();
           }
           else{
            k++;
           }
        }
        for(int i=0;i<4;i++){
           System.out.println(pq.poll());
        } 
        


  }
}
