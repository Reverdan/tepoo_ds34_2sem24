package com.example.modelo;

public class Validacao
{
    public String mensagem;
    public Double n1;
    public Double n2;

    public void validar(String numero1, String numero2, String op)
    {
        this.mensagem = "";
        try
        {
            n1 = Double.parseDouble(numero1);
            n2 = Double.parseDouble(numero2);
            if (op.equals("/") && n2.equals(0.0))
            {
                this.mensagem = "Divisão por zero";
            }
        }
        catch (NumberFormatException e)
        {
            this.mensagem = "Digite números válidos";
        }
    }
}
