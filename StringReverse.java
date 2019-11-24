package Febo;

public class StringReverse {

	public static void main(String args[]) {
	     
        String word = "vijaya teja";
        String reverse = new StringBuffer(word).reverse().toString();
        System.out.printf(" original String : %s , reversed String %s  %n", word, reverse);
     
        word = "Goldman";
        reverse = new StringBuilder(word).reverse().toString();
        System.out.printf(" original String : %s , reversed String %s %n", word, reverse);
     
       
        word = "Brand Company";
        reverse = reverse(word);
        System.out.printf(" original String : %s , reversed String %s %n", word, reverse);
    }  
 
 
    public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }      
        String reverse = "";
        for(int i = source.length() -1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
     
        return reverse;
    }
   
}

	