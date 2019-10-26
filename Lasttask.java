
// Printing The initilas of my First name and last name whicn "Bakhtiyori Loikzoda"


/*public class Lasttask{
    public static void main (String [] args){
        String name = "Bakhtiyori Loikzoa";
        int index = name.indexOf(" ");
        System.out.println(name.charAt(0) + "." + name.charAt(index + 1));        
    }

} */


// Or the same example can be done in a following way 

/*public class Lasttask{
    public static void main (String [] args){
        String Example = "Shahboz Loikov";
        int index = Example.indexOf(" ");
        System.out.println(Example.charAt(0) + "."  + Example.charAt(index + 1));
    }
}*/




//Another Example 

/*public class Lasttask {
   public static void main(String args[]){
      String str = "This is tutorialspoint";
      System.out.println("Index of letter 't' = "+ str.indexOf('t', 14));
      System.out.println("Letter at the index 8 is ::"+str.charAt(8));
   }
}*/

  
//Another example


/*public class Lasttask{
    public static void main(String args[]){
        String str_Sample = "Bakhtiyori Loikzoda learning java";
        
        //Character at position
         System.out.println("Index of character 'B': " + str_Sample.indexOf('B'));
        //Character at position after given index value
        System.out.println("Index of character 'L' after 3 index: " + str_Sample.indexOf('L', 3));

    }
}*/
    
    public class Lasttask{
        public static void main(String args[]){
            String str1 = "Lets work on this example and find out the solutions";
            String str2 = "You have to practise as much as posible in order to learn somethoing new";
            String str3 = "Lets find out the solutions for String1 and String2";

            System.out.println( "Index of t in String1 after 40th cahr:" + str1.indexOf( 't', 40));
            System.out.println ( " index of character ' h': " + str3.indexOf("h"));

        }
    }