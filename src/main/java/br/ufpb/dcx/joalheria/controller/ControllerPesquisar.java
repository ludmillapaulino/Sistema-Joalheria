package br.ufpb.dcx.joalheria.controller;

import br.ufpb.dcx.joalheria.Joia;
import br.ufpb.dcx.joalheria.SistemaJoalheria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerPesquisar implements ActionListener {

    private SistemaJoalheria sistema;
    private JFrame janelaPrincipal;

    public ControllerPesquisar(SistemaJoalheria sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String nome = JOptionPane.showInputDialog(janelaPrincipal,
                "Nome da joia:");

        Joia joia = sistema.pesquisarJoia(nome);

        if (joia != null) {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    joia.toString());
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Joia não encontrada.");
        }
    }
}