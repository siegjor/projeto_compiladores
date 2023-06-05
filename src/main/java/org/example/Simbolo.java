package org.example;

public class Simbolo {
    private String nomeVariavel;
    private String tipoVariavel;
    private Integer ocorrencia;

    public Simbolo(String nomeVariavel, String tipo) {
        this.nomeVariavel = nomeVariavel;
        this.ocorrencia  = 0;
        this.tipoVariavel = tipo;
    }

    public String getNomeVariavel() {
        return nomeVariavel;
    }

    public void setNomeVariavel(String nomeVariavel) {
        this.nomeVariavel = nomeVariavel;
    }

    public String getTipoVariavel()  {
        return tipoVariavel;
    }

    public void setTipoVariavel(String tipoVariavel) {
        this.tipoVariavel = tipoVariavel;
    }

    public void addOcorencia() {
        this.ocorrencia++;
    }

    public Integer getOcorrencia() {
        return this.ocorrencia;
    }

//    public String toString(){
//         return "A Variavel " + this.getNomeVariavel() " do tipo " + this.getTipoVariavel()+ " teve ", + this.getOcorrencia().toString() + "ocorrencias";
//
//
//    }
}
