import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class MyComboBox extends JFrame {
    {
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(null);

        // 方法一
        //        JComboBox<String> comboBox = new JComboBox<>(new String[]{"aaa", "bbb", "ccc"});

        // 方法二
        //        Vector<String> vector = new Vector<>();
        //        vector.add("xx");
        //        vector.add("oo");
        //        JComboBox<String> comboBox = new JComboBox<>(vector);

        // 方法三
        //        JComboBox<String> comboBox = new JComboBox<>();
        //        comboBox.addItem("abc");
        //        comboBox.addItem("def");

        // 方法四
        //        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        //        comboBoxModel.addElement("good");
        //        comboBoxModel.addElement("bad");
        //
        //        JComboBox<String> comboBox = new JComboBox<>();
        //        comboBox.setModel(comboBoxModel);

        // 方法五
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(new String[]{"aaa", "bbb", "ccc"}); // 建構子還可以放 Vector
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setModel(comboBoxModel);


        comboBox.setBounds(new Rectangle(10, 10, 50, 70));
        comboBox.setEditable(true); // 預設為 false，改了後 index 會變 -1，如果再改成原本有的值也會回復原來的 index
        container.add(comboBox);

        buttonEvent(comboBox, container);

        setVisible(true);
    }

    private void buttonEvent(JComboBox<String> comboBox, Container container) {
        JButton button = new JButton("按我");
        button.addActionListener(actionEvent -> System.out.println(comboBox.getSelectedIndex() + "=" + comboBox.getSelectedItem()));
        button.setBounds(100, 10, 100, 50);
        container.add(button);
    }


    public static void main(String[] args) {
        new MyComboBox();
    }
}
