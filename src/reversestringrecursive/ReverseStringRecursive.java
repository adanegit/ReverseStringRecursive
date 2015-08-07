/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reversestringrecursive;

/**
 *
 * @author adane
 */
public class ReverseStringRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(recursiveReverse("Reverse this given input."));
        System.out.println(naiveApproach("Reverse this given input."));
        System.out.println(reverseUsingStringBuilder("Reverse this given input."));
    }
    
    public static String recursiveReverse(String input){
    
            //String str = "";
            if(input.length() <= 1){
                return input;
            }
            else{
                return recursiveReverse(input.substring(1)) + input.charAt(0);
            }
    }
    
    public static String naiveApproach(String input){
    
        String str = "";
        
        for(int i=input.length()-1; i>=0; i--){
            str += input.charAt(i);
        }
        
        return str;
    }
   
    
    public static String reverseUsingStringBuilder(x input){
    
         return new StringBuilder(input).reverse().toString();
    }

}
