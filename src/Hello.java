import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Hello extends JFrame {


    private JPanel pnMain;
    private JLabel lbWelcome;
    private JPanel pnSide;
    private JPanel pnWelcome;
    private JButton btnPorovnat;
    private JTextField txtFPrvni;
    private JTextField txtFDruhy;
    private JTextArea txtAMain;

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
        btnPorovnat.addActionListener(e -> porovnej());
        itemMainMenu.addActionListener(e -> zmacknuteMenuItem());




    }

    private void zmacknutePorovnatItem() {
       pnSide.setVisible(true);
       pnWelcome.setVisible(false);
    }
    private void zmacknuteMenuItem() {
        pnSide.setVisible(false);
        pnWelcome.setVisible(true);
    }

    private void porovnej() {
        try {
            int cislo1 = Integer.parseInt(txtFPrvni.getText());
            int cislo2 = Integer.parseInt(txtFDruhy.getText());
            int mensiCislo = Math.min(cislo1, cislo2);

            String Text = txtAMain.getText();
            if (Text.equals("Zadej čísla!")) {
                Text = "";
            }
            String novyText = String.valueOf(mensiCislo);
            txtAMain.setText(Text + (Text.isEmpty() ? "" : "\n") + novyText);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Zadej čísla!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


}
