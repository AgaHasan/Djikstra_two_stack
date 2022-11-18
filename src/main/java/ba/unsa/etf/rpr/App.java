package ba.unsa.etf.rpr;

/**
 * Main klasa u kojoj vrsimo parsanje stringa sa konzolnog ulaza i vrsimo validaciju ulaza
 *
 */
public class App 
{
    /**
     * Main - ulazna metoda konzolne aplikacije koja implementira djikstrin algoritam pomocu dva steka
     * @param args prima niz argumenata koji su aritmeticki izrazi
     */
    public static String main( String[] args ) {
        Double rezultat = null;
        try {
            if (args.length == 0) throw new RuntimeException("Nijedan argument nije primljen");
            int operatora = 0;
            int operanada = 0;
            int otvorenihZagrada = 0;
            int zatvorenihZagrada = 0;

            for (String arg : args) {
                operanada = 0;
                operatora = 0;
                otvorenihZagrada = 0;
                zatvorenihZagrada = 0;

                String[] simboli = arg.split(" ");
                for (String simbol : simboli) {
                    if (simbol.equals("(")) {
                        otvorenihZagrada++;
                    } else if (simbol.equals(")")) {
                        zatvorenihZagrada++;
                    } else if (StringIsNumberEvaluator.isNumber(simbol) == true) {
                        operanada++;
                    } else if (simbol.equals("+") || simbol.equals("*") || simbol.equals("-") || simbol.equals("/") || simbol.equals("sqrt")) {
                        operatora++;
                    } else throw new RuntimeException("Ilegalan izraz");
                }
                if (otvorenihZagrada != zatvorenihZagrada || otvorenihZagrada != operatora || operanada == 0)
                    throw new RuntimeException("Ilegalan izraz");
                rezultat = ExpressionEvaluator.evaluate(arg);
                System.out.println("Rezultat je : " + rezultat);
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            return e.getMessage();
        }
        String a = String.valueOf(rezultat);
        return a;
    }
}
