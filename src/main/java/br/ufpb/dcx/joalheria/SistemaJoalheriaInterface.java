package br.ufpb.dcx.joalheria;

import java.io.IOException;

public interface SistemaJoalheriaInterface {

    boolean cadastrarJoia(String nome, String material, double preco);
    Joia pesquisarJoia(String nome);
    boolean removerJoia(String nome);
    void salvarDados() throws IOException;
    void recuperarDados() throws IOException;
}
