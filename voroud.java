import javax.swing.*;
import java.awt.*;

public class voroud extends JFrame {

    JButton kharidar=new JButton("ورود به عنوان خریدار");
    JButton  modir  = new JButton("ورود به عنوان مدیر");

    markaz st;
    voroud(markaz s) {
        st = s;
        tarrahi();
    }

    public void tarrahi() {
        this.setLayout(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("ورود");
        this.setResizable(false);
        this.setSize(300, 250);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        kharidar.setBounds(40,50,200,25);
        kharidar.addActionListener(e -> setKharidar());
        kharidar.setBackground(new Color(0x84F608));
        this.add(kharidar);

        modir.setBounds(40,110,200,25);
        modir.setBackground(new Color(0xD06C94));
        this.add(modir);

    }
    public void setKharidar(){
      st.moshtari();
      this.dispose();
    }
}