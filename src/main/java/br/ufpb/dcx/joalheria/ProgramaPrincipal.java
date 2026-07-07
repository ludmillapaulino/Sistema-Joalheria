package br.ufpb.dcx.joalheria;

import br.ufpb.dcx.joalheria.gui.TelaPrincipal;

import javax.swing.*;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                JFrame janela = new TelaPrincipal();
                janela.setVisible(true);
                janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }

        });

    }

}