package com.company;
import javax.swing.*;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader(" Ведущие криптовалюты");
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setSize(574,408);
        r.setResizable(false);
        r.setLocationRelativeTo(null);



    }

}
