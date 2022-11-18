package ba.unsa.etf.rpr;

/**
 * Main klasa u kojoj vrsimo parsanje stringa sa konzolnog ulaza i vrsimo validaciju ulaza
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            if (args.length == 0) throw new RuntimeException("Nijedan argument nije primljen");
            int operatora = 0;
            int operanada = 0;
            int otvorenihZagrada = 0;
            int zatvorenihZagrada = 0;

            for(String arg : args){

                operatora = 0;
                otvorenihZagrada = 0;
                zatvorenihZagrada = 0;

                String[] simboli = arg.split(" ");
                for(String simbol : simboli){
                    if(simbol.equals("(")){
                        otvorenihZagrada ++;
                    }
                    else if(simbol.equals(")")){
                        zatvorenihZagrada ++;
                    }
                    else if(StringIsNumberEvaluator.isNumber(simbol) == true){
                        operanada ++;
                    }
                    else if(simbol.equals("+") || simbol.equals("*") || simbol.equals("-") || simbol.equals("/") || simbol.equals("sqrt")){
                        operatora ++;
                    }
                }
                if(otvorenihZagrada != zatvorenihZagrada || otvorenihZagrada != operatora) throw new RuntimeException("Ilegalan izraz");

            }
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}
