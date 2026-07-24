package br.ufpb.dcx.joalheria.controller;

import br.ufpb.dcx.joalheria.SistemaJoalheria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerRecuperarDados implements ActionListener {

    SistemaJoalheria sistema;
    JFrame janelaPrincipal;

    public ControllerRecuperarDados(SistemaJoalheria sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this. janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
