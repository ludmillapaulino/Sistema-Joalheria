package br.ufpb.dcx.joalheria;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

public interface SistemaJoalheriaInterface {

    /**
     * Cadastra uma nova joia no sistema.
     *
     * @param nome Nome da joia.
     * @param material Material da joia.
     * @param preco Preço da joia.
     * @return true se a joia foi cadastrada com sucesso; false caso contrário.
     */
    boolean cadastrarJoia(String nome, MATERIAL material, double preco);

    /**
     * Pesquisa uma joia pelo nome.
     *
     * @param nome Nome da joia.
     * @return A joia encontrada ou null se não existir.
     */
    Joia pesquisarJoia(String nome);

    /**
     * Remove uma joia do sistema.
     *
     * @param nome Nome da joia.
     * @return true se a joia foi removida; false caso contrário.
     */
    boolean removerJoia(String nome);

    /**
     * Pesquisa joias com preço maior que o valor informado.
     *
     * @param valor Valor mínimo.
     * @return Lista de joias encontradas.
     */
    List<Joia> pesquisarJoiasComPrecoMaiorQue(double valor);

    /**
     * Pesquisa joias pelo material.
     *
     * @param material Material desejado.
     * @return Lista de joias encontradas.
     */
    List<Joia> pesquisarJoiasPeloMaterial(MATERIAL material);

    /**
     * Conta quantas joias existem de um determinado material.
     *
     * @param material Material desejado.
     * @return Quantidade de joias.
     */
    int contarJoiasDoTipo(MATERIAL material);

    /**
     * Retorna a joia mais cara cadastrada.
     *
     * @return Joia mais cara.
     */
    Joia pesquisarJoiaMaisCara();

    /**
     * Retorna a joia mais barata cadastrada.
     *
     * @return Joia mais barata.
     */
    Joia pesquisarJoiaMaisBarata();

    /**
     * Lista todas as joias cadastradas.
     *
     * @return Coleção contendo todas as joias.
     */
    Collection<Joia> listarJoias();

    /**
     * Salva os dados em arquivo.
     *
     * @throws IOException Caso ocorra erro durante a gravação.
     */
    void salvarDados() throws IOException;

    /**
     * Recupera os dados do arquivo.
     *
     * @throws IOException Caso ocorra erro durante a leitura.
     */
    void recuperarDados() throws IOException;
}