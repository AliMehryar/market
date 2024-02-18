import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class moshtarijadid extends JFrame {

    JLabel name=new JLabel("نام کاربری");
    JLabel code=new JLabel("کد عبور");
    JTextField namefield=new JTextField();
    JTextField codefield=new JTextField();
    JButton sabt=new JButton("ثبت");


    markaz st;
    moshtarijadid(markaz s){
        st=s;
        tarrahi();
    }
    public void tarrahi(){
        this.setTitle("مشتریان");
        this.setLayout(null);
        this.setSize(350,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);



        name.setBounds(220,85,120,25);
        this.add(name);
        code.setBounds(220,125,120,25);
        this.add(code);


        namefield.setBounds(50,85,150,25);
        this.add(namefield);
        codefield.setBounds(50,125,150,25);
        this.add(codefield);

        sabt.setBounds(100,160,80,30);
        sabt.setBackground(new Color(0x97F810));
        sabt.addActionListener(e -> {
            try { add();} catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        this.add(sabt);
    }

    public void add() throws IOException{

        st.moshtariyan=new File("moshtariyan.txt");

        st.moshtariwriting=new FileWriter(st.moshtariyan,true);

        st.moshtariwriting.write(namefield.getText()+"/"+codefield.getText());

        st.moshtariwriting.write("\n");

        st.moshtariwriting.close();
        this.dispose();
        st.moshtari();
    }
}
