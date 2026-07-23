package br.ufpb.dcx.joalheria.controller;

import br.ufpb.dcx.joalheria.MATERIAL;
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

        String nome = JOptionPane.showInputDialog(
                janelaPrincipal,
                "Digite o nome da joia:");

        MATERIAL material = MATERIAL.PRATA;

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Qual é o tipo de material?\n1 - Pérola\n2 - Bronze\n3 - Prata\n4 - Ouro\n 5 - Diamante"));

        switch(opcao){
            case 1:
                material = MATERIAL.PEROLA;
                break;
            case 2:
                material = MATERIAL.BRONZE;
                break;
            case 3:
                material = MATERIAL.PRATA;
                break;
            case 4:
                material = MATERIAL.OURO;
                break;
            case 5:
                material = MATERIAL.DIAMANTE;
                break;
            default:
                JOptionPane.showMessageDialog(janelaPrincipal, "Nenhuma opção válida foi inserida. Será usado o tipo padrão(prata)");
        }

        double preco = Double.parseDouble(
                JOptionPane.showInputDialog(
                        janelaPrincipal,
                        "Digite o preço:")
        );

        boolean cadastrou = sistema.cadastrarJoia(nome, material, preco);

        if (cadastrou) {
            JOptionPane.showMessageDialog(
                    janelaPrincipal,
                    "Joia cadastrada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(
                    janelaPrincipal,
                    "Não foi possível cadastrar a joia.");
        }
    }
}