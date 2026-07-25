package br.ufpb.dcx.joalheria.controller;

import br.ufpb.dcx.joalheria.Joia;
import br.ufpb.dcx.joalheria.SistemaJoalheria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerPesquisarJoiaBarata implements ActionListener {

    private SistemaJoalheria sistema;
    private JFrame janelaPrincipal;

    public ControllerPesquisarJoiaBarata(SistemaJoalheria sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Joia joia = sistema.pesquisarJoiaMaisBarata();

        if (joia != null) {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Joia mais barata:\n" + joia);
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Nenhuma joia cadastrada.");
        }
    }
}
