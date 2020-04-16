package layout;

import javax.swing.*;
import java.awt.*;
import java.util.stream.Stream;

public class MyGridLayout extends JFrame {
    private MyGridLayout() {
        setBounds(50, 50, 300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();

        // 像 Excel
        // 上下多少、左右多少，左右距離、上下距離，預設是 1,0,0,0
        // 隨著改變視窗而變化
        container.setLayout(new GridLayout(3, 4, 0, 0));

        // 如果超過 rows * cols，此例為 3 * 4，左右會增加，上下不會動
        Stream.iterate(0, i -> ++i).limit(16).forEach(i -> container.add(new JButton("rb" + i)));

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyGridLayout();
    }
}
