package Exception_Handling;


import java.util.ArrayList;
import java.util.ListIterator;

public class IllegalStateException {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("apples");
        list.add("mangoes");
        ListIterator<String> it = list.listIterator();
        try{
            if(it.hasNext()){
                it.next();
                it.remove();
                //it.next();
            }
        }
        catch (java.lang.IllegalStateException e){
            System.out.println(e);
        }
    }
}
