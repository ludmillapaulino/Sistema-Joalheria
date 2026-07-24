package br.ufpb.dcx.joalheria.controller;

import br.ufpb.dcx.joalheria.Joia;
import br.ufpb.dcx.joalheria.SistemaJoalheria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ControllerPesquisarPorPreco implements ActionListener {

    private SistemaJoalheria sistema;
    private JFrame janelaPrincipal;

    public ControllerPesquisarPorPreco(SistemaJoalheria sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double valor = Double.parseDouble(JOptionPane.showInputDialog(janelaPrincipal, "Qual é o valor limite?"));
        List<Joia> listaJoias = this.sistema.pesquisarJoiasComPrecoMaiorQue(valor);
        String textoCompleto = "Joias que custam mais do que " + (valor) + "\n";
        for(Joia j : listaJoias) {
            textoCompleto += j.toString() + "\n";
        }
        JOptionPane.showMessageDialog(janelaPrincipal, textoCompleto);
    }
}
