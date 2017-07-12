public class VarArgs {
    static int add(int ...n){
        int sum = 0; 
        for(int i:n){
            sum += i;
        }
        return sum;
    }
    static int add(String message, int ...n){
        System.out.println(message);
        int sum = 0; 
        for(int i:n){
            sum += i;
        }
        return sum;
    }
/*
    //Wrong way of using variable arguments.
    // If the function consists of several arguments , then var_args must be at the last.
    int add(int ...n, String message){
        System.out.println(message);
        int sum = 0; 
        for(int i:n){
            sum += i;
        }
        return sum;
    }
*/
    public static void main(String ...s){
        System.out.println(VarArgs.add(1,2,3));
        System.out.println(VarArgs.add(1,2,3,4,5));
        System.out.println(VarArgs.add("Demo of how to use variable arguments in JAVA",1,2,3,4,5));
    }
}
