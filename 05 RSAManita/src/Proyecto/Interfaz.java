//Hecho por Ledesma Hernández Leonardo
package Proyecto;

import java.math.BigInteger;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {

    private final JPanel Principal;
    private final JPanel Head;
    private final JLabel Titulo;
    private final JPanel Foot;
    private final JPanel Body;
    private final JTextField TextoDescifrado;
    private final JLabel Indicacion2;
    private final JTextField Entrada;
    private final JLabel Instruccion;
    private final JButton Vaciar;
    private final JButton Cifradoinador;
    private final JScrollPane jScrollPane1;
    private final JTextArea Salida;
    private final JLabel Indicacion1;
  
    
    public Interfaz() {
        Principal = new JPanel();
        Head = new JPanel();
        Titulo = new JLabel();
        Foot = new JPanel();
        Body = new JPanel();
        TextoDescifrado = new JTextField();
        Indicacion2 = new JLabel();
        Entrada = new JTextField();
        Instruccion = new JLabel();
        Vaciar = new JButton();
        Cifradoinador = new JButton();
        jScrollPane1 = new JScrollPane();
        Salida = new JTextArea();
        Indicacion1 = new JLabel();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("RSA Manita");
        setResizable(false);

        Principal.setBackground(new Color(39, 195, 148));

        Head.setBackground(new Color(1, 116, 119));

        Titulo.setFont(new Font("Tahoma", 1, 36)); 
        Titulo.setForeground(new Color(248, 255, 250));
        Titulo.setText("RSA Manita");

        GroupLayout jPanel1Layout = new GroupLayout(Head);
        Head.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addComponent(Titulo)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Titulo)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Foot.setBackground(new java.awt.Color(1, 116, 119));

        GroupLayout jPanel2Layout = new GroupLayout(Foot);
        Foot.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        Body.setBackground(new java.awt.Color(63, 186, 165));

        TextoDescifrado.setEditable(false);
        TextoDescifrado.setBackground(new java.awt.Color(248, 255, 250));
        TextoDescifrado.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); 
        TextoDescifrado.setForeground(new java.awt.Color(81, 102, 107));
        TextoDescifrado.setBorder(null);

        Indicacion2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); 
        Indicacion2.setForeground(new java.awt.Color(248, 255, 250));
        Indicacion2.setText("Descifrado");

        Entrada.setBackground(new java.awt.Color(248, 255, 250));
        Entrada.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); 
        Entrada.setForeground(new java.awt.Color(81, 102, 107));
        Entrada.setBorder(null);
        Entrada.setSelectedTextColor(new java.awt.Color(81, 102, 107));
        Entrada.setSelectionColor(new java.awt.Color(1, 116, 119));

        Instruccion.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); 
        Instruccion.setForeground(new java.awt.Color(248, 255, 250));
        Instruccion.setText("Texto a cifrar");

        Vaciar.setBackground(new java.awt.Color(1, 116, 119));
        Vaciar.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Vaciar.setForeground(new java.awt.Color(248, 255, 250));
        Vaciar.setText("Borrar");
        Vaciar.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Vaciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                VaciarActionPerformed(evt);
            }
        });

        Cifradoinador.setBackground(new java.awt.Color(1, 116, 119));
        Cifradoinador.setFont(new java.awt.Font("Segoe UI", 1, 18)); 
        Cifradoinador.setForeground(new java.awt.Color(248, 255, 250));
        Cifradoinador.setText("Cifrar");
        Cifradoinador.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Cifradoinador.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CifradoinadorActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Salida.setEditable(false);
        Salida.setBackground(new Color(248, 255, 250));
        Salida.setFont(new Font("Segoe UI Light", 0, 18)); 
        Salida.setForeground(new Color(81, 102, 107));
        Salida.setBorder(null);
        jScrollPane1.setViewportView(Salida);

        Indicacion1.setFont(new Font("Tw Cen MT", 0, 24)); 
        Indicacion1.setForeground(new Color(248, 255, 250));
        Indicacion1.setText("Cifrado");

        GroupLayout jPanel3Layout = new GroupLayout(Body);
        Body.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Indicacion1)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(Entrada, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Instruccion))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(TextoDescifrado, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Indicacion2))))
                        .addGap(63, 63, 63))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(Cifradoinador, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(Vaciar, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(Instruccion)
                    .addComponent(Indicacion2))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(Entrada, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoDescifrado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Indicacion1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(Cifradoinador)
                    .addComponent(Vaciar))
                .addGap(22, 22, 22))
        );

        GroupLayout PrincipalLayout = new GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(PrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(Head, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Foot, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(Body, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        PrincipalLayout.setVerticalGroup(PrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addComponent(Head, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Body, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Foot, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(Principal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(Principal, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                 

    private void CifradoinadorActionPerformed(ActionEvent evt) {        
        try {
            String mensaje = Entrada.getText();
            RSA rsa = new RSA(1024);

            // Generar números primos y claves
            rsa.generarPrimos();
            rsa.generarClaves();

            // Cifrar el mensaje
            BigInteger[] mensajeCifrado = rsa.cifrar(mensaje);

            // Generar texto a partir de los números cifrados
            StringBuilder textoCifrado = new StringBuilder();
            for (BigInteger num : mensajeCifrado) {
                textoCifrado.append(num).append(" ");
            }

            String formattedText = textoCifrado.toString();
            StringBuilder finalText = new StringBuilder();
            int charsPerLine = 75;

            for (int i = 0; i < formattedText.length(); i += charsPerLine) {
                finalText.append(formattedText, i, Math.min(formattedText.length(), i + charsPerLine)).append("\n");
            }

            Salida.setText("");
            Salida.setText(finalText.toString());

            // Descifrar el mensaje cifrado
            String mensajeDescifrado = rsa.descifrar(mensajeCifrado);

            // Mostrar el mensaje descifrado
            TextoDescifrado.setText("");
            TextoDescifrado.setText(mensajeDescifrado);
        } catch (Exception e) {
            String mensajeError = "Se produjo un error al cifrar/descifrar el mensaje.\nDetalles: " + e.getMessage();
            JOptionPane.showMessageDialog(this, mensajeError, "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }                                                                                      

    private void VaciarActionPerformed(ActionEvent evt) {                                       
        Entrada.setText("");
        Salida.setText("");
        TextoDescifrado.setText("");
    }                                      

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
}