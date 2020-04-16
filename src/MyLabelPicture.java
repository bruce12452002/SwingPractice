import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MyLabelPicture extends JFrame {
    private MyLabelPicture() {
        setBounds(100, 100, 300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();

        JLabel label = new JLabel("哇哈哈");// JLable 想取得裡面的內容，可用 setText 和 getText

        // 取得圖片方法一
        /*
                URL url = this.getClass().getResource("pikachu.png");
                System.out.println(url); // file:/D:/SwingPractice/out/production/SwingPractice/pikachu.png  抓取編譯後的圖片路徑
                ImageIcon imageIcon = new ImageIcon(url);
                */

        // 取得圖片方法二
        ImageIcon imageIcon = new ImageIcon("src/pikachu.png"); // 這種方法預設是從專案路徑開始


        ImageIcon newImageIcon = changeIconWidthAndHeight(imageIcon);
        label.setIcon(newImageIcon);

        container.add(label);
        setVisible(true);
    }

    private ImageIcon changeIconWidthAndHeight(ImageIcon imageIcon) {
        Image image = imageIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        return new ImageIcon(image);
    }

    public static void main(String[] args) {
        new MyLabelPicture();
    }
}
