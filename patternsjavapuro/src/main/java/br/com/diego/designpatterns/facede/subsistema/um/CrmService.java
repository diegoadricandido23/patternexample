package br.com.diego.designpatterns.facede.subsistema.um;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(final String nome, final String cep, final String cidade, final String estado) {
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
