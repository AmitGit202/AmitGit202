package stringP;

public class FrequencyOfCharWithIndex {
    public static void main(String[] args) {    
       String str = "aabbbbdd";    
       int[] freq = new int[str.length()];    
       int i, j;    
       //Converts given string into character array    
       char string[] = str.toCharArray();    
       for(i = 0; i<str.length(); i++) {   
           freq[i] = 1;    
           for(j = i+1; j<str.length(); j++) {    
               if(string[i] == string[j]) {    
                   freq[i]++;    }    }    }    
       //Displays the each character and their corresponding frequency    
       System.out.println("Characters and their corresponding frequencies");    
       for(i = 0; i <freq.length; i++) {    
           if(string[i] != ' ')  
               System.out.println(string[i]  + "-" + freq[i]);    }    }    }  
