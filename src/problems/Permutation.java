package problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Please enter a String to generate Permutations: ");
    	String string = sc.nextLine();
    	
    	Set<String> permutations =  generatePermutations(string);
    	System.out.println("Here are the unique permutations of " + string);
    	System.out.println(Arrays.toString(permutations.toArray()));
    	
    	sc.close();
    }
    private static Set<String> generatePermutations(String input){
    	input = input.toLowerCase();
    	Set<String> result = new HashSet<>();
    	permutations("", input, result);
		return result;
    	
    }
	private static void permutations(String prefix, String letters, Set<String> result) {
		if(letters.length()==0){
			result.add(prefix);
		}else{
			for(int i = 0; i<letters.length(); i++){
				String letter = letters.substring(i, i+1);
				String otherLetters = letters.substring(0,i) + letters.substring(i+1);
				System.out.println(result);
			}
		}
	}
}
