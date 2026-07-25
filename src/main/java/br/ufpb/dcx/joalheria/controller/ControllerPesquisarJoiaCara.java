package br.ufpb.dcx.joalheria.controller;

import br.ufpb.dcx.joalheria.Joia;
import br.ufpb.dcx.joalheria.SistemaJoalheria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerPesquisarJoiaCara implements ActionListener {

    private SistemaJoalheria sistema;
    private JFrame janelaPrincipal;

    public ControllerPesquisarJoiaCara(SistemaJoalheria sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Joia joia = sistema.pesquisarJoiaMaisCara();

        if (joia != null) {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Joia mais cara:\n" + joia);
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Nenhuma joia cadastrada.");
        }
    }
}