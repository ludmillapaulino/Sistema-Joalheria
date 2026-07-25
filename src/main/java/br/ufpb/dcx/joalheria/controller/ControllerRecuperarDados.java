package br.ufpb.dcx.joalheria.controller;

import br.ufpb.dcx.joalheria.SistemaJoalheria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ControllerRecuperarDados implements ActionListener {

    private SistemaJoalheria sistema;
    private JFrame janelaPrincipal;

    public ControllerRecuperarDados(SistemaJoalheria sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            sistema.recuperarDados();

            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Dados recuperados com sucesso!");

        } catch (IOException ex) {

            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Erro ao recuperar os dados.");
        }
    }
}