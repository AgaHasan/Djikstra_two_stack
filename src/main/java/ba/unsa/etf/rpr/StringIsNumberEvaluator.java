package ba.unsa.etf.rpr;

/**
 * Klasa koja ima jednu javnu metodu "isNumber" koja prima String i provjerava da li se moze parseati u double
 */
public class StringIsNumberEvaluator {
    /**
     * Metoda koja pokusava parseati string u double i pomocu izuzetka saznaje da li je to moguce
     * @param str The string to be checked for parseability as a number
     * @return true or false depending on whether the string taken as parameter is a number
     */
    public static boolean isNumber(String str){
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
