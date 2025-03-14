import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Hello extends JFrame {


    private JPanel pnMain;
    private JLabel lbWelcome;
    private JPanel pnWelcome;

    public Hello() {
        initComponents();
    }

    private void initComponents() {
        setContentPane(pnMain);
        setTitle("Frame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);

        lbWelcome.setFont(new Font("Arial", Font.BOLD, 100));


        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription("Textová popiska menu");
        menuBar.add(menu);

        JMenuItem itemPorovnavacCisel = new JMenuItem("Porovnávač čísel");
        menu.add(itemPorovnavacCisel);
        JMenuItem itemMainMenu = new JMenuItem("Main Menu");
        menu.add(itemMainMenu);

        itemPorovnavacCisel.addActionListener(e ->zmacknutePorovnatItem());





    }

    private void zmacknutePorovnatItem() {
        Porovnavac porovnavac = new Porovnavac();
        porovnavac.setVisible(true);
    }





}
