package br.ufpb.dcx.joalheria;

import java.io.IOException;
import java.util.*;

public class SistemaJoalheria implements SistemaJoalheriaInterface {

    private Map<String, Joia> joias;
    private final GravadorDeDados gravador;

    public SistemaJoalheria() {
        this.joias = new HashMap<>();
        this.gravador = new GravadorDeDados();
    }

    public Collection<Joia> getJoias() {
        return this.joias.values();
    }

    @Override
    public boolean cadastrarJoia(String nome, MATERIAL material, double preco) {

        if (joias.containsKey(nome) || preco < 0) {
            return false;
        }

        Joia joia = new Joia(nome, material, preco);
        joias.put(nome, joia);

        return true;
    }

    @Override
    public Joia pesquisarJoia(String nome) {
        return joias.get(nome);
    }

    @Override
    public boolean removerJoia(String nome) {

        if (joias.containsKey(nome)) {
            joias.remove(nome);
            return true;
        }

        return false;
    }

    @Override
    public List<Joia> pesquisarJoiasComPrecoMaiorQue(double valor) {

        return this.joias.values()
                .stream()
                .filter(joia -> joia.getPreco() > valor)
                .toList();
    }

    @Override
    public List<Joia> pesquisarJoiasPeloMaterial(MATERIAL material) {

        return this.joias.values()
                .stream()
                .filter(joia -> joia.getMaterial() == material)
                .toList();
    }

    @Override
    public Joia pesquisarJoiaMaisCara() {

        if (joias.isEmpty()) {
            return null;
        }

        Joia joiaMaisCara = joias.values().iterator().next();

        for (Joia j : joias.values()) {
            if (j.getPreco() > joiaMaisCara.getPreco()) {
                joiaMaisCara = j;
            }
        }

        return joiaMaisCara;
    }

    @Override
    public Joia pesquisarJoiaMaisBarata() {

        if (joias.isEmpty()) {
            return null;
        }

        Joia joiaMaisBarata = joias.values().iterator().next();

        for (Joia j : joias.values()) {
            if (j.getPreco() < joiaMaisBarata.getPreco()) {
                joiaMaisBarata = j;
            }
        }

        return joiaMaisBarata;
    }

    @Override
    public int contarJoiasDoTipo(MATERIAL material) {

        int contador = 0;

        for (Joia j : joias.values()) {
            if (j.getMaterial().equals(material)) {
                contador++;
            }
        }

        return contador;
    }

    @Override
    public void salvarDados() throws IOException {
        gravador.salvarJoias(joias);
    }

    @Override
    public void recuperarDados() throws IOException {
        joias = gravador.recuperarJoias();
    }
}