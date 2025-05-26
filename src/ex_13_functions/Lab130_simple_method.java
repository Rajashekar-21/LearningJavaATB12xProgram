package ex_13_functions;

public class Lab130_simple_method {
    public static void main(String[] args) {
        ///= no return type or void does not return any.
        non_returntype_function();
        String a = return_type_function();
        System.out.println(a);
        boolean b = returnBoolean();
        System.out.println(b);
    }

    static void non_returntype_function(){
        System.out.println("Hi Raj");
    }
    static String return_type_function(){
        System.out.println("Hi pooja");
        return "hi";
    }
    static boolean returnBoolean(){
        return true;
    }
    static float floatReturn(){
        return 3.14f;
    }
    static long longreturn(){
        return 955647l;
    }
}
