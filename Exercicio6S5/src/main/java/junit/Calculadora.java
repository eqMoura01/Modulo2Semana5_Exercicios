package junit;

public class Calculadora {
    private int number1;
    private int number2;
    private String operator;

    public Calculadora(int number1, int number2, String operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public int choiceOperation() {
        int retorno = 0;
        switch (this.operator) {
            case "Soma":
                retorno = this.number1 + this.number2;
                break;
            case "Divisão":
                retorno = this.number1 * this.number2;
                break;
            case "Multiplicação":
                retorno = this.number1 - this.number2;
                break;
            default:
                retorno = this.number1 - this.number2;
                break;
        }
        return retorno;
    }

}
