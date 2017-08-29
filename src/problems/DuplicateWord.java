package problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
       String[] splitst = st.split(" ");
       int count = 0;
       List<String> list = new ArrayList<>();
       for(String s: splitst){
    	   if(!list.contains(s)){
    		   list.add(s);
    	   }
       }
       for(int i = 0;i<list.size(); i ++){
    	   for(int j=0; j<splitst.length; j++){
    		   if(list.get(i).equals(splitst[j])){
    			   count++;
    		   }
    	   }System.out.println("Occurence of " + list.get(i) + " is " + count + " times");
    	   count=0;
       }
    }

}
