package br.ufpb.dcx.joalheria;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public interface SistemaJoalheriaInterface {

    boolean cadastrarJoia(String nome, MATERIAL material, double preco);
    Joia pesquisarJoia(String nome);
    boolean removerJoia(String nome);
    List<Joia> pesquisarJoiasComPrecoMaiorQue(double valor);
    List<Joia> pesquisarJoiasPeloMaterial(MATERIAL material);
    int contarJoiasDoTipo(MATERIAL material);
    Joia pesquisarJoiaMaisCara();
    Joia pesquisarJoiaMaisBarata();
    Collection<Joia> listarJoias();
    void salvarDados() throws IOException;
    void recuperarDados() throws IOException;
}