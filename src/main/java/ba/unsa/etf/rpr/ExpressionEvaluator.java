package ba.unsa.etf.rpr;

import java.util.Stack;

/**
 * Klasa sa jednom javnom metodom 'evaluate'
 */
public class ExpressionEvaluator {
    /**
     * Metoda koja prima aritmeticki izraz te vraca njegovu izracunatu vrijednost
     * @param expression the expression to be evaluated in the form of a String object
     * @return The value of the expression after evaluation as Double
     */
    public static Double evaluate(String expression){
        String operator = "";
        Double result = 0.;
        Stack<String> operatori = new Stack<String>();
        Stack<Double> operandi = new Stack<Double>();
        String[] simboli = expression.split(" ");
        for(String simbol : simboli){
            if(simbol.equals("("));
            else if(simbol.equals("+")) operatori.push(simbol);
            else if(simbol.equals("-")) operatori.push(simbol);
            else if(simbol.equals("*")) operatori.push(simbol);
            else if(simbol.equals("/")) operatori.push(simbol);
            else if(simbol.equals("sqrt")) operatori.push(simbol);
            else if(simbol.equals(")")){
                operator = operatori.pop();
                Double v = operandi.pop();
                if(operator.equals("+")) v = operandi.pop() + v;
                if(operator.equals("-")) v = operandi.pop() - v;
                if(operator.equals("*")) v = operandi.pop() * v;
                if(operator.equals("/")) v = operandi.pop() / v;
                if(operator.equals("sqrt")) v = Math.sqrt(v);
                operandi.push(v);
            }
            else operandi.push(Double.parseDouble(simbol));
        }
        result = operandi.pop();
        return result;
    }
}
