package layout;

import javax.swing.*;
import java.awt.*;

public class MyNullLayout extends JFrame {
    private MyNullLayout(){
        setBounds(50,50, 300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(null); // 絕對 Layout，絕對的意思，就是改變視窗大小時，並不會因此而改變，這行不寫，整個畫面是一個按鈕

        JButton btn = new JButton("按我");
        btn.setBounds(70,70, 100,50);// 有設定 Layout 時，這行不寫不會顯示；沒設定 Layout 時，這行不寫整個畫面是一個按鈕
        container.add(btn);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyNullLayout();
    }
}
