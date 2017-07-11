public class Overloading {
    // Correct examples
    static int add(int a, int b){
        return a+b;
    } 
    
    static double add(double a, double b){
        return a+b;
    }
    
    static double add(double a, double b, double c){
        return a+b+c;
    }
    
    /*
    //Can you guess the error in this function?
    
    static byte add(byte a, byte b){
        byte c = a+b;
        return c;
    }
    */ 
    
    /*
    //Incorrect example
    static long add(int a, int b){
        long res = a+b;
        return res;
    }
    //We can't have two methods with same parameters and only diffferent return types.
    */
    
    public static void main(String ...s){
        System.out.println(Overloading.add(2,5));
        System.out.println(Overloading.add(2.5,4.5));
        System.out.println(Overloading.add(2.4,0.5,1.2));
        
        // Can you tell the reason why the code will work?
        // Hint: type promotion
        System.out.println(Overloading.add(1,2,3));
        
    }
}
