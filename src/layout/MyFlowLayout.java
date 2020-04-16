package layout;

import javax.swing.*;
import java.awt.*;
import java.util.stream.Stream;

public class MyFlowLayout extends JFrame {
    private MyFlowLayout() {
        setBounds(50, 50, 300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();

        // 流的 Layout，預設是從左到右、置中對齊、元件和元件的水平和垂直距離都為 5，會隨著調整視窗而改變，但縮的太小也是無法顯示的
        container.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        Stream.iterate(0, i -> ++i).limit(10).forEach(i -> container.add(new JButton("按我" + i)));

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFlowLayout();
    }
}
