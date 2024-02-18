import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class froushgah extends JFrame {

    JLabel shalavr =new JLabel(new ImageIcon("shalvar.jfif"));
    JLabel laptop =new JLabel(new ImageIcon("laptop.jfif"));
    JLabel mobile =new JLabel(new ImageIcon("mobile.jpg"));
    JLabel chips =new JLabel(new ImageIcon("chips.jpeg"));
    JLabel ball =new JLabel(new ImageIcon("ball.jpg"));
    JLabel car =new JLabel(new ImageIcon("car.jpg"));
    JLabel shalavrl =new JLabel("شلوار 195000T");
    JLabel laptopl =new JLabel("لپ تاپ 25000000T");
    JLabel mobilel =new JLabel("موبایل 6750000T redmi");
    JLabel chipsl =new JLabel("چیپس 7500T");
    JLabel balll=new JLabel("توپ اوریجینال 750000T");
    JLabel carl =new JLabel("ماشین اسباب بازی 1200000T");
    JTextField shalvarf=new JTextField("0");
    JTextField laptopf=new JTextField("0");
    JTextField mobilef=new JTextField("0");
    JTextField chipsf=new JTextField("0");
    JTextField ballf=new JTextField("0");
    JTextField carf=new JTextField("0");
    JButton confirm=new JButton("تایید");

    int shalvarn;
    int laptopn;
    int mobilen;
    int chipsn;
    int balln;
    int carn;


    markaz st;
    froushgah(markaz s){
        st=s;
        tarrahi();
    }
    public void tarrahi(){
        this.setLayout(null);
        this.setTitle("فروشگاه");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

         confirm.setBounds(350,510,80,40);
         confirm.setBackground(new Color(0xE26009));
         confirm.addActionListener(e -> {
             try {
                 setconfirm();
             } catch (IOException ioException) {
                 ioException.printStackTrace();
             }
         });
         this.add(confirm);

        shalavr.setBounds(0,25,300,150);
        this.add(shalavr);

        laptop.setBounds(280,25,250,150);
        this.add(laptop);

        mobile.setBounds(550,25,200,150);
        this.add(mobile);

        chips.setBounds(25,280,200,150);
        this.add(chips);

        ball.setBounds(280,280,250,150);
        this.add(ball);

        car.setBounds(550,280,250,150);
        this.add(car);

        shalavrl.setBounds(120,180,100,25);
        shalavrl.setFont(new Font("calibre",Font.BOLD,16));
        this.add(shalavrl);

        laptopl.setBounds(380,110,250,150);
        laptopl.setFont(new Font("calibre",Font.BOLD,16));
        this.add(laptopl);

        mobilel.setBounds(600,110,200,150);
        mobilel.setFont(new Font("calibre",Font.BOLD,16));
        this.add(mobilel);

        chipsl.setBounds(120,430,100,25);
        chipsl.setFont(new Font("calibre",Font.BOLD,16));
        this.add(chipsl);

        balll.setBounds(350,430,180,25);
        balll.setFont(new Font("calibre",Font.BOLD,16));
        this.add(balll);

        carl.setBounds(590,430,180,25);
        carl.setFont(new Font("calibre",Font.BOLD,16));
        this.add(carl);

        shalvarf.setBounds(120,210,80,30);
        this.add(shalvarf);

        laptopf.setBounds(380,210,80,30);
        this.add(laptopf);

        mobilef.setBounds(600,210,80,30);
        this.add(mobilef);

        chipsf.setBounds(120,460,80,30);
        this.add(chipsf);

        ballf.setBounds(350,460,80,30);
        this.add(ballf);

        carf.setBounds(590,460,80,30);
        this.add(carf);
    }
    public void setconfirm() throws IOException {

        shalvarn=Integer.parseInt(shalvarf.getText());
        laptopn=Integer.parseInt(laptopf.getText());
        mobilen=Integer.parseInt(mobilef.getText());
        chipsn=Integer.parseInt(chipsf.getText());
        balln=Integer.parseInt(ballf.getText());
        carn=Integer.parseInt(carf.getText());


        int sum=(shalvarn*195000)+(laptopn*25000000)+(mobilen*6750000)+(chipsn*7500)+(balln*750000)+(carn*1200000);

        st.cost=sum;

        if (sum>0){
            st.factor=new File("factor.txt");
            st.writefactor=new FileWriter(st.factor);

            if (shalvarn>0){
                st.writefactor.write((shalvarn*195000)+"\n"+"195000"+"\n"+shalvarn+"\n"+"شلوار"+"\n");
            }
            if (laptopn>0){
                st.writefactor.write((laptopn*25000000)+"\n"+"25000000"+"\n"+laptopn+"\n"+"لپ تاپ"+"\n");
            }
            if (mobilen>0){
                st.writefactor.write((mobilen*6750000)+"\n"+"6750000"+"\n"+mobilen+"\n"+"موبایل"+"\n");
            }
            if (chipsn>0){
                st.writefactor.write((chipsn*7500)+"\n"+"7500"+"\n"+chipsn+"\n"+"چیپس"+"\n");
            }
            if (balln>0){
                st.writefactor.write((balln*750000)+"\n"+"750000"+"\n"+balln+"\n"+"توپ اوریجینال"+"\n");
            }
            if (carn>0){
                st.writefactor.write((carn*1200000)+"\n"+"1200000"+"\n"+carn+"\n"+"ماشین اسباب بازی"+"\n");
            }

            st.writefactor.flush();
            st.writefactor.close();
            st.recipet();
            this.dispose();
        }
    }
}
