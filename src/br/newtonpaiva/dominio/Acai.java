package br.newtonpaiva.dominio;

public class Acai {
    public Integer tamanho;
    public Double valor;
    public Boolean hasAcrescimo;

    public Double calcValor(){
        if (tamanho >= 700){
            valor = 12.0;
        }else if (tamanho >= 500){
            valor = 10.0;
        } else if (tamanho >= 300) {
            valor = 8.0;
        }else {
            throw new IllegalArgumentException("Tamanho inválido");
        }
        if (hasAcrescimo){
            valor += 2.0;
        }

        return valor;
    }
}
