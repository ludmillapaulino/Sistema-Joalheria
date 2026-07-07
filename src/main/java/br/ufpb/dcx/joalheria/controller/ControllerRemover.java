package br.ufpb.dcx.joalheria.controller;

import br.ufpb.dcx.joalheria.SistemaJoalheria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerRemover implements ActionListener {

    private SistemaJoalheria sistema;
    private JFrame janelaPrincipal;

    public ControllerRemover(SistemaJoalheria sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String nome = JOptionPane.showInputDialog(janelaPrincipal,
                "Nome da joia:");

        boolean removeu = sistema.removerJoia(nome);

        if (removeu) {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Joia removida com sucesso!");
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Joia não encontrada.");
        }
    }
}