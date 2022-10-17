package ejercicio2;

public class LambdaTest2 {
    public static void main(String[] args) {

        Operaciones op= (num1, num2) -> System.out.println(num1+num2);
        

       LambdaTest2 obj = new LambdaTest2();
       obj.miMetodo(op, 8, 5);
    }

    public void miMetodo(Operaciones op, int num1, int num2){
        op.imprimeSuma(num1, num2);
    }

}
