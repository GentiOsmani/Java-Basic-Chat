import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame() {
        super("Chat");
        JButton btn = new JButton("Click me");
        JTextArea text = new JTextArea();
        JTextField enterchat = new JTextField();
        JPanel panel = new JPanel();
        Toolkit kit = this.getToolkit();
        JPanel subPanel = new JPanel();

        Font font = new Font("Arial", Font.BOLD, 20);
        text.setFont(font);

        //JFrame Parameters
        Dimension dim = kit.getScreenSize();
        setSize(dim.height / 2, dim.width / 2);
        setLayout(new BorderLayout());
        getContentPane().setBackground(new Color(221, 160, 221));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        enterchat.setPreferredSize(new Dimension(400, 50));

        //button
        btn.setBounds(200, 150, 150, 100);
        btn.setFocusable(false);
        btn.addActionListener(e -> {
            text.append(enterchat.getText());
            enterchat.setText("");
            text.append("\n");
        });

        //panel
        panel.setLayout(new BorderLayout());
        text.setEditable(false);

        //adding parts
        subPanel.add(btn);
        subPanel.add(enterchat);
        panel.add(text, BorderLayout.CENTER);
        subPanel.add(btn);
        panel.add(subPanel, BorderLayout.SOUTH);
        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);

    }
}