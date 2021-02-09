package com.company;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import static java.awt.Font.*;

public class Reader extends  JFrame{

    Document document = Jsoup.connect("https://ru.investing.com/crypto/").get();
    java.util.List<String> elements = document.getElementsByTag("h2").eachText();
    java.util.List<String> elements1 = document.getElementsByTag("thead").eachText();
    List<String> elements2 = document.getElementsByTag("tr").eachText();

    JLabel l1 = new JLabel(elements2.get(0));
    JLabel l2= new JLabel(elements2.get(1));
    JLabel l3 = new JLabel(elements2.get(2));
    JLabel l4 = new JLabel(elements2.get(3));
    JLabel l5 = new JLabel(elements2.get(4));
    JLabel l6 = new JLabel(elements2.get(5));
    JLabel l7 = new JLabel(elements2.get(6));
    JLabel l8 = new JLabel(elements2.get(7));

        public Reader(String s) throws IOException {
            super(s);
            setContentPane(new BgPanel());
            Container cont = getContentPane();
            l1.setForeground(Color.orange) ;
            l2.setForeground(Color.green) ;
            l3.setForeground(Color.green) ;
            l4.setForeground(Color.green) ;
            l5.setForeground(Color.green) ;
            l6.setForeground(Color.green) ;
            l7.setForeground(Color.green) ;
            Font font = new Font("Bitstream Charter", BOLD,15);
            Font font1 = new Font("Bitstream Charter", BOLD,12);

            l1.setFont(font1);
            l2.setFont(font);
            l3.setFont(font);
            l4.setFont(font);
            l5.setFont(font);
            l6.setFont(font);
            l7.setFont(font);

            setLayout(new FlowLayout());
            Container container = this.getContentPane();
            container.setLayout(new GridLayout(7,0));
            container.add(l1);
            container.add(l2);
            container.add(l3);
            container.add(l4);
            container.add(l5);
            container.add(l6);
            container.add(l7);
        }
    }
class BgPanel extends JPanel {
    public void paintComponent(Graphics g) {
        Image im = null;
        try {
            im = ImageIO.read(new File("Новая папка/12345.jpeg"));
        } catch (IOException e) {
        }
        g.drawImage(im, 0, 0, null);


    }
}
