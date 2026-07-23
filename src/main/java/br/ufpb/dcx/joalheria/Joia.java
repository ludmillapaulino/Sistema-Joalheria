package br.ufpb.dcx.joalheria;

import java.io.Serializable;
import java.util.Objects;

public class Joia implements Serializable {

    private String nome;
    private MATERIAL material;
    private double preco;

    public Joia(String nome, MATERIAL material, double preco) {
        this.nome = nome;
        this.material = material;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public MATERIAL getMaterial() {
        return material;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMaterial(MATERIAL material) {
        this.material = material;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Joia joia = (Joia) o;
        return Objects.equals(nome, joia.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Joia{" +
                "nome='" + nome + '\'' +
                ", material='" + material + '\'' +
                ", preco=" + preco +
                '}';
    }
}
