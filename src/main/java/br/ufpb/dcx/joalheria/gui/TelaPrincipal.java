package br.ufpb.dcx.joalheria.gui;

import br.ufpb.dcx.joalheria.SistemaJoalheria;
import br.ufpb.dcx.joalheria.controller.ControllerCadastrar;
import br.ufpb.dcx.joalheria.controller.ControllerPesquisar;
import br.ufpb.dcx.joalheria.controller.ControllerRemover;
import br.ufpb.dcx.joalheria.controller.ControllerSalvar;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {

    JLabel linha1, linha2;

    SistemaJoalheria sistema = new SistemaJoalheria();

    JMenuBar barraDeMenu = new JMenuBar();

    public TelaPrincipal() {

        setTitle("Sistema de Joalheria");
        setSize(800, 600);
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.white);

        linha1 = new JLabel("Sistema de Joalheria", JLabel.CENTER);
        linha1.setForeground(Color.BLUE);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));

        linha2 = new JLabel("Gerenciamento de Joias", JLabel.CENTER);

        setLayout(new GridLayout(3,1));

        add(linha1);
        add(linha2);
        add(new JLabel());

        JMenu menuCadastrar = new JMenu("Cadastrar");
        JMenuItem cadastrarJoia = new JMenuItem("Cadastrar Joia");
        menuCadastrar.add(cadastrarJoia);

        JMenu menuPesquisar = new JMenu("Pesquisar");
        JMenuItem pesquisarJoia = new JMenuItem("Pesquisar Joia");
        menuPesquisar.add(pesquisarJoia);

        JMenu menuRemover = new JMenu("Remover");
        JMenuItem removerJoia = new JMenuItem("Remover Joia");
        menuRemover.add(removerJoia);

        JMenu menuSalvar = new JMenu("Salvar");
        JMenuItem salvarDados = new JMenuItem("Salvar Dados");
        menuSalvar.add(salvarDados);

        cadastrarJoia.addActionListener(new ControllerCadastrar(sistema, this));
        pesquisarJoia.addActionListener(new ControllerPesquisar(sistema, this));
        removerJoia.addActionListener(new ControllerRemover(sistema, this));
        salvarDados.addActionListener(new ControllerSalvar(sistema, this));

        barraDeMenu.add(menuCadastrar);
        barraDeMenu.add(menuPesquisar);
        barraDeMenu.add(menuRemover);
        barraDeMenu.add(menuSalvar);

        setJMenuBar(barraDeMenu);
    }
}