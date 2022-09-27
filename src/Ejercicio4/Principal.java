public class Principal{
    public static void main(String[] args) {
       //Opcion 1   engine((CalculadoraInt) (x , y) -> x+y);
       //Opcion 2   engine((int x , int y) -> x+y);
        
        CalculadoraInt calI = (x , y) -> x+y;
        CalculadoraInt calL = (x , y) -> x+y;

        engine(calI);
    }

    public static void engine(CalculadoraInt cal){

    }

    public static void engine(CalculadoraLong cal){

    }


}