package br.ufpb.dcx.joalheria;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDados {

    public static final String ARQUIVO_JOIAS = "joias.dat";

    public void salvarJoias(Map<String, Joia> joias) throws IOException {

        ObjectOutputStream out =
                new ObjectOutputStream(
                        new FileOutputStream(ARQUIVO_JOIAS));

        out.writeObject(joias);
        out.close();

    }

    public HashMap<String, Joia> recuperarJoias() throws IOException {

        try {

            ObjectInputStream in =
                    new ObjectInputStream(
                            new FileInputStream(ARQUIVO_JOIAS));

            return (HashMap<String, Joia>) in.readObject();

        } catch (ClassNotFoundException e) {

            throw new IOException(e);

        }

    }

}