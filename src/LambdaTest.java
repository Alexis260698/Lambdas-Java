
public class LambdaTest {
    public static void main(String[] args) {
        FunctionTest ft= () -> System.out.println("HOLA MUNDO");

        LambdaTest objeto = new LambdaTest();

        objeto.miMetodo(ft);

    }

    public void miMetodo(FunctionTest parametro){

        parametro.saludar();

    }
    
}

