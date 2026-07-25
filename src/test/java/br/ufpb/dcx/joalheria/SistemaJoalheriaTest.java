package br.ufpb.dcx.joalheria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaJoalheriaTest {

    @Test
    public void testaCadastroPesquisa() {

        SistemaJoalheria sistema = new SistemaJoalheria();

        assertNull(sistema.pesquisarJoia("Anel"));

        boolean cadastrou = sistema.cadastrarJoia("Anel", MATERIAL.OURO, 1500);

        assertTrue(cadastrou);

        Joia joia = sistema.pesquisarJoia("Anel");

        assertNotNull(joia);
        assertEquals("Anel", joia.getNome());
        assertEquals(MATERIAL.OURO, joia.getMaterial());
        assertEquals(1500, joia.getPreco());
    }

    @Test
    public void testaRemocao() {

        SistemaJoalheria sistema = new SistemaJoalheria();

        sistema.cadastrarJoia("Colar", MATERIAL.PRATA, 800);

        assertNotNull(sistema.pesquisarJoia("Colar"));

        boolean removeu = sistema.removerJoia("Colar");

        assertTrue(removeu);

        assertNull(sistema.pesquisarJoia("Colar"));
    }

    @Test
    public void testaPesquisarPorMaterial() {

        SistemaJoalheria sistema = new SistemaJoalheria();

        sistema.cadastrarJoia("Anel", MATERIAL.OURO, 1000);
        sistema.cadastrarJoia("Colar", MATERIAL.PRATA, 500);

        assertEquals(
                1,
                sistema.pesquisarJoiasPeloMaterial(MATERIAL.OURO).size()
        );
    }

    @Test
    public void testaPesquisarPorPreco() {

        SistemaJoalheria sistema = new SistemaJoalheria();

        sistema.cadastrarJoia("Anel", MATERIAL.OURO, 1000);
        sistema.cadastrarJoia("Colar", MATERIAL.PRATA, 300);

        assertEquals(
                1,
                sistema.pesquisarJoiasComPrecoMaiorQue(500).size()
        );
    }

    @Test
    public void testaJoiaMaisCara() {

        SistemaJoalheria sistema = new SistemaJoalheria();

        sistema.cadastrarJoia("Anel", MATERIAL.OURO, 1000);
        sistema.cadastrarJoia("Colar", MATERIAL.PRATA, 3000);

        assertEquals(
                "Colar",
                sistema.pesquisarJoiaMaisCara().getNome()
        );
    }

    @Test
    public void testaJoiaMaisBarata() {

        SistemaJoalheria sistema = new SistemaJoalheria();

        sistema.cadastrarJoia("Anel", MATERIAL.OURO, 1000);
        sistema.cadastrarJoia("Colar", MATERIAL.PRATA, 300);

        assertEquals(
                "Colar",
                sistema.pesquisarJoiaMaisBarata().getNome()
        );
    }

    @Test
    public void testaContarJoiasDoTipo() {

        SistemaJoalheria sistema = new SistemaJoalheria();

        sistema.cadastrarJoia("Anel", MATERIAL.OURO, 1000);
        sistema.cadastrarJoia("Brinco", MATERIAL.OURO, 500);
        sistema.cadastrarJoia("Colar", MATERIAL.PRATA, 700);

        assertEquals(
                2,
                sistema.contarJoiasDoTipo(MATERIAL.OURO)
        );
    }

    @Test
    public void testaSalvarDados() throws Exception {

        SistemaJoalheria sistema = new SistemaJoalheria();

        sistema.cadastrarJoia("Anel", MATERIAL.OURO, 1000);

        sistema.salvarDados();

        assertTrue(true);
    }

    @Test
    public void testaRecuperarDados() throws Exception {

        SistemaJoalheria sistema = new SistemaJoalheria();

        sistema.cadastrarJoia("Anel", MATERIAL.OURO, 1000);

        sistema.salvarDados();

        SistemaJoalheria outroSistema = new SistemaJoalheria();

        outroSistema.recuperarDados();

        assertNotNull(outroSistema.pesquisarJoia("Anel"));
    }
}