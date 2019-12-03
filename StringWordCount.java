/* Take string From User and perform this task 1.Find the Maximum times Repeat word in 
   String and print (word and his Max of Repeatation) 2.If all Words count is same so
   print all the words and words separate with comma(,) 3.If count will be equal of other 
   word (Ex:2 words count is same) then print same count of words & word and separate with 
   commasTerms and Conditions:- Do with Functions(Method)  */

import java.util.Scanner;
import javax.swing.*;
  class Main{
    public static void main(String[] args){
      String Str;
      Scanner Q=new Scanner(System.in); // Create Scanner Class reference variable
      System.out.print("ENTER THE STRING:");
      Str=Q.nextLine(); //String Input with the help of Scanner
      Q.close(); // Close Reference fot not Resource leak
      StringBuffer A=StringWordCount(Str);
        if(A.charAt(A.length()-1)==','){ // For Remove Last Comma
        A.deleteCharAt(A.length()-1);
        System.out.println("THE MAMIXMUM REPEATING WORD IS:"+A);
      }
      else System.out.println("THE MAMIXMUM REPEATING WORD IS:"+A);
    }
    static StringBuffer StringWordCount(String Str){
      String Arr[]=Str.split(" "); // For Separate String in Array of String
      int Max=0; // For Maximum Number Count
      StringBuffer K=new StringBuffer();
      int Count[]=new int[Arr.length];
      for(int i=0;i<Arr.length;i++){
        int WordCount=0; // For Comparing Maximum count
        for(int j=i+1;j<Arr.length;j++)
          if(Arr[i].equals(Arr[j]))// For String Comaparison
            WordCount++;          
        Count[i]=WordCount+1;
        if(WordCount>=Max){
          Max=WordCount; // Assign If Count is Max
          K.append(Arr[i]); // Maximum count of word Assign
          K.append(','); // Word Separate with Comma 
        }
      }
      // For Maximum Count Of Word Display
      char ch=JOptionPane.showInputDialog("DO YOU WANT TO SEE THE MAXIMUM WORD COUNT PRESS 'Y' AND 'N'").charAt(0);
      if(ch=='Y'||ch=='y'){
        String P=new String(K); // StringBuffer Convert to String
        String O[]=P.split(","); // String con  vet to StringArray 
        for(int i=0;i<O.length;i++)
          System.out.println(O[i]+"\t"+Count[i]);
      }
      return K; //Return StringBuffer
    }
  }
