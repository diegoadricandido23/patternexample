package br.com.diego.designpatterns.facede.subsistema.dois;

public class CepApi {
    private static  CepApi instance = new CepApi();
    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperarCidade(final String cep) {
        return "Extrema";
    }

    public String recuperarEstado(final String cep) {
        return "MG";
    }
}
