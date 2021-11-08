package br.com.diego.designpatterns.facede;

import br.com.diego.designpatterns.facede.subsistema.dois.CepApi;
import br.com.diego.designpatterns.facede.subsistema.um.CrmService;

public class Facede {

    public void migrarCliente(final String nome, final String cep) {
        final String cidade = CepApi.getInstance().recuperarCidade(cep);
        final String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
