package br.ufpb.dcx.joalheria;

import java.io.IOException;
import java.util.Map;

public interface SistemaJoalheriaInterface {

    boolean cadastrarJoia(String nome, String material, double preco);
    Joia pesquisarJoia(String nome);
    boolean removerJoia(String nome);
    Map<String, Joia> getJoias();
    void salvarDados() throws IOException;
    void recuperarDados() throws IOException;
}