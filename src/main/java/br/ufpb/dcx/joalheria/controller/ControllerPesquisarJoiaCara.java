package br.ufpb.dcx.joalheria.controller;

import br.ufpb.dcx.joalheria.SistemaJoalheria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerPesquisarJoiaCara implements ActionListener {

    SistemaJoalheria sistema;
    JFrame janelaPrincipal;

    public ControllerPesquisarJoiaCara(SistemaJoalheria sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this. janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
