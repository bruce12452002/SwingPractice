import javax.swing.*;
import java.awt.*;

public class Main {
    private JFrame frame = new JFrame(); // 開發中，都是繼承 JFrame，這樣以下的 frame. 就可以刪除了
    private ImageIcon imageIcon = new ImageIcon("src/pikachu.png");
    private JButton button = new JButton("鼻孔癢", changeIconWidthAndHeight());

    private Main() {
        frame.setResizable(true); // 預設為 true
        frame.setLocation(100, 100); // 窗體左上角的起始顯示位置，預設為 0, 0
        frame.setSize(800, 600);
        //  frame.setBounds(100, 100, 800, 600); // 上兩行可用這一行搞定
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /**  按下右上角關閉的事件
                 *  DO_NOTHING_ON_CLOSE ：不做任何事
                 *   HIDE_ON_CLOSE：預設值，隱藏窗體，但程式沒關
                 *   DISPOSE_ON_CLOSE：釋放資源後關閉，所以會感覺停一下後才關閉
                 *   EXIT_ON_CLOSE：關閉程式
                 */

        Container container = frame.getContentPane();
        container.setBackground(Color.PINK);
        // container.setBackground(new Color(0, 255, 0)); // 使用 RGB
        container.add(new JLabel("Hello Swing")); // 也可用 remove 移除某個組件

//        frame.setLayout(new BorderLayout());
        header();

        frame.setVisible(true); // 以上都準備完畢再顯示，否則可能要改變視窗大小才會有反應
    }

    private ImageIcon changeIconWidthAndHeight() {
        Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

    private void header() {
        frame.add(button, BorderLayout.NORTH);
    }


    public static void main(String[] args) {
        new Main();
    }
}
