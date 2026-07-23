package br.ufpb.dcx.joalheria;

public enum MATERIAL {
    BRONZE("bronze"), PEROLA("pérola"), PRATA("prata"), OURO("ouro"), DIAMANTE("diamante");

    private final String material;

    MATERIAL(String material) {
        this.material = material;
    }

    public String toString() {
        return material;
    }
}
