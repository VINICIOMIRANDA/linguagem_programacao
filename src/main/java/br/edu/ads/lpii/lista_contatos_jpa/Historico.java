package br.edu.ads.lpii.lista_contatos_jpa;

import java.util.ArrayList;
import java.util.List;

public class Historico {

    List<Contato> listadeOperacoes = new ArrayList<>();

    void adicionar(Contato nomeContato) {
        listadeOperacoes.add(nomeContato);
    }


    List<Contato> getHistorico() {
        return listadeOperacoes;
    }
}

    