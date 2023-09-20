/*
 * Palindrome.java
 *
 * Computer Science 112
 *
 * Modifications and additions by:
 *     name: Mithat Kus
 *     username: mthtks@bu.edu
 */
   
public class Palindrome {

/*
isPal: takes a String object as a parameter and determines if it is a palindrome, returning true if it is and 
false if it is not
*/
    public static boolean isPal(String s) {
        ArrayStack<Character> s1 = new ArrayStack<Character>(s.length());
        ArrayQueue<Character> s2 = new ArrayQueue<Character>(s.length());
        for (int i = 0; i < s.length(); i++){
            // check ASCII code 1 and 26 
            char check = s.charAt(i);
            check = Character.toLowerCase(check);
            if (check >= 'a' && check <= 'z'){
                s1.push(check);
                s2.insert(check);
            }
        }
        for (int k = 0; k < s.length(); k++){
            Character pop1 = s1.pop();
            Character pop2 = s2.remove();

            if (pop1 != pop2){
                return false;
            }
        }

        return true;
 
    }
    
    public static void main(String[] args) {
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(0) Testing on \"A man, a plan, a canal, Panama!\"");
        try {
            boolean results = isPal("A man, a plan, a canal, Panama!");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();    // include a blank line between tests
        
        /*
         * Add five more unit tests that test a variety of different
         * cases. Follow the same format that we have used above.
         */


        // test #1 
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(1) Testing on \"Don't nod\"");
        try {
            boolean results = isPal("Don't nod");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();  
        
        // test #2

        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(2) Testing on \"Dammit, I'm mad!\"");
        try {
            boolean results = isPal("Dammit, I'm mad!");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();  
        
        // test #3

        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(3) Testing on \"Nate bit a Tibetan\"");
        try {
            boolean results = isPal("Nate bit a Tibetan");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();  
        
        // test #4

        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(4) Testing on \"Too bad I hid a boot\"");
        try {
            boolean results = isPal("Too bad I hid a boot");
            boolean expected = true;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();   
        
        // test #5

        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(5) Testing on \"Allah bu sorunun belasini versin\"");
        try {
            boolean results = isPal("Allah bu sorunun belasini versin");
            boolean expected = false;
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println(expected);
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == expected);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();    
    }
}