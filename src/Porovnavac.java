import javax.swing.*;

public class Porovnavac extends JFrame {
    private JPanel pnMain;
    private JButton btnPorovnat;
    private JTextField txtFPrvni;
    private JTextField txtFDruhy;
    private JTextArea txtAMain;

    public Porovnavac() {
        initComponents();
    }

    private void initComponents() {
        setContentPane(pnMain);
        setTitle("Porovnávač čísel");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);

        btnPorovnat.addActionListener(e -> porovnej());
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
