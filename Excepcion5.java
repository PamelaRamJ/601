package excepcion5;

public class Excepcion5 {

    public static void main(String[] args) {
           try{
       int divicion = miMetodo(10,0);    
       System.out.println(divicion);
       }catch(ArithmeticException e){
       
       System.out.println("Excepcion aritmetica arrojada");
       e.printStackTrace();
       }
    }
    public static int miMetodo(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        int c= a/b;
       return c;
    }
}
