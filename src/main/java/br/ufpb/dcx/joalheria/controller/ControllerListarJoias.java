package br.ufpb.dcx.joalheria.controller;

import br.ufpb.dcx.joalheria.Joia;
import br.ufpb.dcx.joalheria.SistemaJoalheria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class ControllerListarJoias implements ActionListener {

    private SistemaJoalheria sistema;
    private JFrame janelaPrincipal;

    public ControllerListarJoias(SistemaJoalheria sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Collection<Joia> joias = sistema.listarJoias();

        if (joias.isEmpty()) {
            JOptionPane.showMessageDialog(
                    janelaPrincipal,
                    "Nenhuma joia cadastrada.");
            return;
        }

        StringBuilder texto = new StringBuilder("Joias cadastradas:\n\n");

        for (Joia j : joias) {
            texto.append(j).append("\n");
        }

        JOptionPane.showMessageDialog(
                janelaPrincipal,
                texto.toString());
    }
}