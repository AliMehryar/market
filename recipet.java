import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class recipet extends JFrame {

    JTextField hazineh=new JTextField();
    JLabel kharid=new JLabel("مجموع کل خرید");
    JButton end=new JButton("ثبت خرید");



    markaz st;
    recipet(markaz s){
        st=s;
        try {
            tarrahi();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void tarrahi() throws IOException {

        this.setLayout(null);
        this.setTitle("فاکتور");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(500,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);


        kharid.setBounds(300,150,100,25);
        kharid.setFont(new Font("Dubai",Font.BOLD,14));
        kharid.setForeground(new Color(0xEC051F));
        this.add(kharid);

        hazineh.setBounds(125,150,150,25);
        hazineh.setText(String.valueOf(st.cost));
        this.add(hazineh);

        end .setBounds(200,190,80,30);
        end.setBackground(new Color(0x5599D5));
        end.addActionListener(e -> setEnd());
        this.add(end);



        String[] columns={"قیمت کل","قیمت","تعداد کالا","نام کالا"};
        Object [][] rows=new Object[6][24];

        st.factor=new File("factor.txt");
        Scanner read=new Scanner(st.factor);

        int i=0;
        while (read.hasNextLine()){
            for (int j=0;j<4;j++){
                String add=read.nextLine();
                rows [i][j]=add;
                if (j==3){
                    i++;
                }
            }
        }

        JTable table=new JTable(rows,columns);
        JScrollPane pane=new JScrollPane(table);
        pane.setBounds(20,20,450,100);
        table.setFillsViewportHeight(true);
        pane.setVisible(true);
        this.add(pane);

    }
    public void setEnd(){
        JOptionPane.showMessageDialog(this,"خرید با موفقیت انجام شد","Confirmed",JOptionPane.INFORMATION_MESSAGE);
        this.dispose();

    }
}
