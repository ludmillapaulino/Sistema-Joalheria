package br.ufpb.dcx.joalheria.controller;

import br.ufpb.dcx.joalheria.SistemaJoalheria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ControllerSalvar implements ActionListener {

    private SistemaJoalheria sistema;
    private JFrame janelaPrincipal;

    public ControllerSalvar(SistemaJoalheria sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            sistema.salvarDados();

            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Dados salvos com sucesso!");

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Erro ao salvar os dados.");

        }

    }
}
