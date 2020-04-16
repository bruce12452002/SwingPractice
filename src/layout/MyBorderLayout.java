package layout;

import javax.swing.*;
import java.awt.*;
import java.util.stream.Stream;

public class MyBorderLayout extends JFrame {
    private MyBorderLayout() {
        setBounds(50, 50, 300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();

        // 有東西南北中五個區域，不指定會是中，每個區域指能有一個組件，如果繼續加組件會後者蓋前蓋，水平和垂直距離預設都為 0
        // 會隨非改變窗體而變化
        // 東和西的上下距離和中間一樣，所以南和北很寬
        container.setLayout(new BorderLayout(0, 0)); // 預設就是 BorderLayout，所以可不寫
        container.add(new Label("C"), BorderLayout.CENTER); // BorderLayout.CENTER 可不寫
        container.add(new JButton("E"), BorderLayout.EAST);
        container.add(new TextField("W"), BorderLayout.WEST);
        container.add(new JCheckBox("S"), BorderLayout.SOUTH);
        container.add(new JRadioButton("N"), BorderLayout.NORTH);
        container.add(new JPasswordField("CENTER")); // 會覆蓋中
        container.add(new JTextArea("North"), BorderLayout.NORTH); // 覆蓋北
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyBorderLayout();
    }
}
