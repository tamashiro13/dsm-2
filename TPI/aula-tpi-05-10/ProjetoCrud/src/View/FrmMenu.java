package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Menu principal do sistema.
 * Os ícones ficam em src/View/icones e são carregados pelo classpath
 * com o caminho /View/icones/NOME.png
 */
public class FrmMenu extends JFrame {

    private static final String PASTA_ICONES = "/View/icones/";

    /**
     * Carrega um ícone sem derrubar o programa caso o arquivo não exista.
     * Se o caminho estiver errado, avisa no console e devolve null.
     */
    private static ImageIcon icone(String nome) {
        URL url = FrmMenu.class.getResource(PASTA_ICONES + nome);
        if (url == null) {
            System.err.println("Icone nao encontrado no classpath: " + PASTA_ICONES + nome);
            return null;
        }
        return new ImageIcon(url);
    }

    public FrmMenu() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Menu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        // Fundo (fundo.jpg tem 400x300)
        ImageIcon fundo = icone("fundo.jpg");
        JLabel lblFundo = new JLabel();
        lblFundo.setLayout(null);
        if (fundo != null) {
            lblFundo.setIcon(fundo);
        } else {
            lblFundo.setOpaque(true);
            lblFundo.setBackground(new Color(230, 230, 230));
        }
        lblFundo.setPreferredSize(new java.awt.Dimension(400, 300));

        JLabel lblTitulo = new JLabel("Menu Principal", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblTitulo.setBounds(0, 20, 400, 30);
        lblFundo.add(lblTitulo);

        JButton btnUsuarios = criarBotao("Usuários", "cadastros.png", 60, 90);
        btnUsuarios.addActionListener(evt -> {
            new FrmUsuario().setVisible(true);
        });
        lblFundo.add(btnUsuarios);

        JButton btnSair = criarBotao("Sair", "sair.png", 220, 90);
        btnSair.addActionListener(evt -> System.exit(0));
        lblFundo.add(btnSair);

        setContentPane(lblFundo);
        pack();
        setLocationRelativeTo(null);
    }

    private JButton criarBotao(String texto, String nomeIcone, int x, int y) {
        JButton b = new JButton(texto);
        ImageIcon ic = icone(nomeIcone);
        if (ic != null) {
            b.setIcon(ic);
        }
        b.setHorizontalTextPosition(SwingConstants.CENTER);
        b.setVerticalTextPosition(SwingConstants.BOTTOM);
        b.setBounds(x, y, 120, 110);
        b.setBorder(BorderFactory.createEtchedBorder());
        return b;
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(FrmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new FrmMenu().setVisible(true));
    }
}
