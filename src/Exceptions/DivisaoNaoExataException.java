package Exceptions;

public class DivisaoNaoExataException extends Exception{

    private int numerador;
    private int denominador;

    public DivisaoNaoExataException(String message) {
        super(message);
        this.numerador = numerador;
        this.denominador = denominador;
    }
}
