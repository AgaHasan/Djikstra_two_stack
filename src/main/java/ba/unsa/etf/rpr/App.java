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
            int otvorenihZagrada = 0;
            int zatvorenihZagrada = 0;
            boolean bio_razmak = true;

            for(String arg : args){
                operatora = 0;
                otvorenihZagrada = 0;
                zatvorenihZagrada = 0;

                String[] simboli = arg.split(" ");
                for(String simbol : simboli){
                    if(simbol.equals("(")){
                        otvorenihZagrada++;
                    }
                    else if(simbol.equals(")")){
                        zatvorenihZagrada++;
                    }
                    //else if(simbol)
                }

            }
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}
