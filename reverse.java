import java.util.*;

public class reverse
{
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        q.add(32);
        q.add(12);
        q.add(99);
        q.add(5);
        q.add(3);

        System.out.print(q);
        Stack<Integer> st=new Stack<>();
        while(q.size()>0){
            st.push(q.poll());
        }

        while(st.size()>0){
            q.add(st.pop());
        }
         System.out.println();
        System.out.print(q);
    }
}