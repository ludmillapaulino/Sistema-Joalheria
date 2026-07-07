package br.ufpb.dcx.joalheria.controller;

import br.ufpb.dcx.joalheria.SistemaJoalheria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerCadastrar implements ActionListener {

    private SistemaJoalheria sistema;
    private JFrame janelaPrincipal;

    public ControllerCadastrar(SistemaJoalheria sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String nome = JOptionPane.showInputDialog(janelaPrincipal,
                "Nome da joia:");

        String material = JOptionPane.showInputDialog(janelaPrincipal,
                "Material:");

        double preco = Double.parseDouble(JOptionPane.showInputDialog(
                janelaPrincipal,
                "Preço:"
        ));

        boolean cadastrou = sistema.cadastrarJoia(nome, material, preco);

        if (cadastrou) {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "Joia cadastrada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(janelaPrincipal,
                    "A joia já existe ou o preço é inválido.");
        }
    }
}