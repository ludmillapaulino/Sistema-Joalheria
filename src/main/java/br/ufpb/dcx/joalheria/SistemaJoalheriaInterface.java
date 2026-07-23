package br.ufpb.dcx.joalheria;

import java.io.IOException;
import java.util.List;

public interface SistemaJoalheriaInterface {

    /**
     * Cadastra uma nova joia no sistema.
     *
     * @param nome Nome da joia.
     * @param material Material da joia.
     * @param preco Preço da joia.
     * @return true se a joia foi cadastrada com sucesso; false caso seja o contrário.
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
     * Pesquisa no sistema as joias que tem o preco maior do que o passado como parametro
     *
     * @param valor valor a ser comparado.
     * @return retorna uma lista que tem o preço maior do que o valor passado como parâmetro
     */

    List<Joia> pesquisarJoiasComPrecoMaiorQue(double valor);

    /**
     * Pesquisa no sistema as joias que são compostas pelo material passado como parâmetro
     *
     * @param material tipo de material a ser pesquisado
     * @return retorna uma lista de Joias que são compostas pelo material passado como parâmetro
     */

    List<Joia> pesquisarJoiasPeloMaterial(MATERIAL material);

    /**
     * Conta o número de joias que são compostas pelo material passado como parâmetro
     *
     * @param material tipo de material que vai ser usado para a contagem
     * @return retorna um número inteiro que representa a quantidade de jóias que são compostas pelo material passado como parâmetro
     */

    int contarJoiasDoTipo(MATERIAL material);

    /**
     * Pesquisa a joia mais cara cadastrada no sistema
     *
     * @return retorna a joia mais cara cadastrada no sistema
     */

    Joia pesquisarJoiaMaisCara();

    /**
     * Pesquisa a joia mais barata cadastrada no sistema
     *
     * @return retorna a joia mais barata cadastrada no sistema
     */

    Joia pesquisarJoiaMaisBarata();

    /**
     * Salva os dados das joias em arquivo.
     *
     * @throws IOException Caso ocorra erro durante a gravação.
     */

    void salvarDados() throws IOException;

    /**
     * Recupera os dados das joias salvos em arquivo.
     *
     * @throws IOException Caso ocorra erro durante a leitura.
     */
    void recuperarDados() throws IOException;
}