package br.com.marcosEduardo.calculadoraApi.exceptions;

public class DivisaoPorZeroException extends RuntimeException {
    public DivisaoPorZeroException() {
        super("Não é possível dividir por zero");
    }
}
