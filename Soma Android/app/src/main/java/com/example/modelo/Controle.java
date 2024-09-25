package com.example.modelo;

public class Controle
{
    public String mensagem;
    private String resultado;

    public void executar(String numero1, String numero2, String op)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validar(numero1, numero2, op);
        if (validacao.mensagem.equals(""))
        {
            Calculos calculos = new Calculos();
            calculos.somar(validacao.n1, validacao.n2, op);
            this.resultado = calculos.toString();
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }

    @Override
    public String toString()
    {
        return resultado;
    }
}
