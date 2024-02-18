import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class moshtari extends JFrame {

    JLabel name=new JLabel("نام کاربری");
    JLabel code=new JLabel("کد عبور");
    JTextField namefield=new JTextField();
    JTextField codefield=new JTextField();
    JButton sabt=new JButton("بررسی");
    JLabel register=new JLabel("ثبت نام کاربر");
    JButton jadid=new JButton("برای ثبت نام اینحا کلیک کنید");
    JLabel  show=new JLabel("خوش آمدید");

    markaz st;
    moshtari(markaz s){
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

        show.setBounds(150,40,120,25);
        this.add(show);


        name.setBounds(220,85,120,25);
        this.add(name);
        code.setBounds(220,125,120,25);
        this.add(code);


        namefield.setBounds(50,85,150,25);
        this.add(namefield);
        codefield.setBounds(50,125,150,25);
        this.add(codefield);

        sabt.setBounds(100,160,80,30);
        sabt.setBackground(new Color(0x65F107));
        sabt.addActionListener(e -> {
            try {
                barrasi();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
        this.add(sabt);


        register.setBounds(200,235,150,25);
        register.setForeground(new Color(0x0808E5));
        this.add(register);

        jadid.setBounds(25,240,150,15);
        jadid.addActionListener(e -> setnew());
        this.add(jadid);

    }

    public void barrasi() throws IOException {
        int index=0;
        st.moshtariyan=new File("moshtariyan.txt");
        Scanner read = new Scanner(st.moshtariyan);
        while (read.hasNextLine()){
            String check=read.nextLine();
            if (check.equals(namefield.getText()+"/"+codefield.getText())){
                index++;
                JOptionPane.showMessageDialog(this,"ورود با موفقیت انجام شد","Confirmed",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                st.froushgah();
                break;
            }
        }
        if (index==0){
            JOptionPane.showMessageDialog(this, "رمز عبود یا نام کاربری اشتباه است", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    public void setnew(){
        this.dispose();
        st.moshtarijadid();
    }
}
