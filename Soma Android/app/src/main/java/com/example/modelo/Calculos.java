package com.example.modelo;

public class Calculos
{
    private Double resultado;

    public void somar(Double n1, Double n2, String op)
    {
        if (op.equals("+")) this.resultado = n1 + n2;
        if (op.equals("-")) this.resultado = n1 - n2;
        if (op.equals("*")) this.resultado = n1 * n2;
        if (op.equals("/")) this.resultado = n1 / n2;
    }

    @Override
    public String toString()
    {
        return resultado.toString();
    }
}
