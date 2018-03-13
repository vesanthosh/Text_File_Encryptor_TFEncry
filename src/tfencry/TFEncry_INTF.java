/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfencry;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author SANDY
 */
public class TFEncry_INTF extends javax.swing.JFrame {

    /**
     * Creates new form TFEncry_INTF
     */
    String filepath;
    String key;
    int keylength;

    public TFEncry_INTF() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        source_file = new javax.swing.JLabel();
        filetextfield = new javax.swing.JTextField();
        choosebtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        key_to_encrypt_or_decrypt = new javax.swing.JLabel();
        progressbar = new javax.swing.JProgressBar();
        filekeytextfield = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        encryptbtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        decryptbtn = new javax.swing.JButton();
        status_msg = new javax.swing.JLabel();
        menu_bar = new javax.swing.JMenuBar();
        file_menu = new javax.swing.JMenu();
        new_menu_item = new javax.swing.JMenuItem();
        open_menu_item = new javax.swing.JMenuItem();
        exit_menu_item = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TFEncry - Encrypt / Decrypt");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/tfencry/tfencry_about_icon.png")).getImage());
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        source_file.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        source_file.setForeground(new java.awt.Color(51, 51, 51));
        source_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tfencry/source_file_icon.png"))); // NOI18N
        source_file.setText("Source File *");

        filetextfield.setEditable(false);
        filetextfield.setBackground(new java.awt.Color(204, 204, 204));
        filetextfield.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        filetextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filetextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        choosebtn.setBackground(new java.awt.Color(204, 204, 204));
        choosebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        choosebtn.setForeground(new java.awt.Color(51, 51, 51));
        choosebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tfencry/choose_file_icon.png"))); // NOI18N
        choosebtn.setText("Open File");
        choosebtn.setFocusPainted(false);
        choosebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(source_file)
                    .addComponent(filetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(choosebtn, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choosebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(source_file)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filetextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        source_file.getAccessibleContext().setAccessibleName("source_file");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        key_to_encrypt_or_decrypt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        key_to_encrypt_or_decrypt.setForeground(new java.awt.Color(51, 51, 51));
        key_to_encrypt_or_decrypt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tfencry/key-icon.png"))); // NOI18N
        key_to_encrypt_or_decrypt.setText("Key to Encrypt / Decrypt *");

        progressbar.setMaximum(8);
        progressbar.setToolTipText("");
        progressbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        progressbar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        progressbar.setString("Key Strength");
        progressbar.setStringPainted(true);

        filekeytextfield.setBackground(new java.awt.Color(255, 255, 255));
        filekeytextfield.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        filekeytextfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        filekeytextfield.setToolTipText("");
        filekeytextfield.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        filekeytextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filekeytextfieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(key_to_encrypt_or_decrypt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(filekeytextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(progressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(key_to_encrypt_or_decrypt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(filekeytextfield)))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        encryptbtn.setBackground(new java.awt.Color(204, 204, 204));
        encryptbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        encryptbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tfencry/encrypt_icon.png"))); // NOI18N
        encryptbtn.setText("Encrypt");
        encryptbtn.setEnabled(false);
        encryptbtn.setFocusPainted(false);
        encryptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(encryptbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(encryptbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        decryptbtn.setBackground(new java.awt.Color(204, 204, 204));
        decryptbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        decryptbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tfencry/decrypt_icon.png"))); // NOI18N
        decryptbtn.setText("Decrypt");
        decryptbtn.setEnabled(false);
        decryptbtn.setFocusPainted(false);
        decryptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(decryptbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(decryptbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        status_msg.setForeground(new java.awt.Color(0, 0, 204));
        status_msg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        status_msg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tfencry/tfencry_about_icon.png"))); // NOI18N
        status_msg.setText("Progress");
        status_msg.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        file_menu.setText("File");

        new_menu_item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        new_menu_item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tfencry/new_file_icon.png"))); // NOI18N
        new_menu_item.setText("New");
        new_menu_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_menu_itemActionPerformed(evt);
            }
        });
        file_menu.add(new_menu_item);

        open_menu_item.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open_menu_item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tfencry/open_file_icon.png"))); // NOI18N
        open_menu_item.setText("Open...");
        open_menu_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                open_menu_itemActionPerformed(evt);
            }
        });
        file_menu.add(open_menu_item);

        exit_menu_item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tfencry/exit_icon.png"))); // NOI18N
        exit_menu_item.setText("Exit");
        exit_menu_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_menu_itemActionPerformed(evt);
            }
        });
        file_menu.add(exit_menu_item);

        menu_bar.add(file_menu);

        setJMenuBar(menu_bar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(status_msg)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status_msg)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosebtnActionPerformed
        // TODO add your handling code here:
        filechooser();
    }//GEN-LAST:event_choosebtnActionPerformed

    private void filechooser() {
        try {
            JFileChooser jc = new JFileChooser();
            jc.setDialogType(0);
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("Text Document Only", new String[]{"txt"});
            jc.setFileFilter(fnef);
            jc.showDialog(null, "Select Text File");
            File f = jc.getSelectedFile();
            filetextfield.setText(f.getName());
            filepath = f.getAbsolutePath();
        } catch (NullPointerException localNullPointerException) {
        }
    }

    private void exit_menu_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_menu_itemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exit_menu_itemActionPerformed

    private void new_menu_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_menu_itemActionPerformed
        // TODO add your handling code here:
        filepath = null;
        key = null;
        keylength = 0;
        filetextfield.setText("");
        filekeytextfield.setText("");
        progressbar.setString("Key Strength");
        progressbar.setValue(0);
        encryptbtn.setEnabled(false);
        decryptbtn.setEnabled(false);
        status_msg.setText("Progress");
        status_msg.setForeground(new Color(0, 0, 204));
    }//GEN-LAST:event_new_menu_itemActionPerformed

    private void open_menu_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_open_menu_itemActionPerformed
        // TODO add your handling code here:
        filechooser();
    }//GEN-LAST:event_open_menu_itemActionPerformed

    private void encryptbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptbtnActionPerformed
        try {
            FileInputStream fis = null;
            FileOutputStream fos = null;
            key = Arrays.toString(filekeytextfield.getPassword());
            fis = new FileInputStream(filepath);
            fos = new FileOutputStream("Encrypted.txt");
            DESKeySpec dks = new DESKeySpec(key.getBytes());
            SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
            SecretKey desKey = skf.generateSecret(dks);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(1, desKey);
            CipherInputStream cis = new CipherInputStream(fis, cipher);
            byte[] bytes = new byte[1024];
            int numBytes;
            while ((numBytes = cis.read(bytes)) != -1) {
                fos.write(bytes, 0, numBytes);
            }
            fos.flush();
            fos.close();
            cis.close();
            status_msg.setForeground(new Color(0, 153, 0));
            status_msg.setText("The file has been encrypted successfully");
        } catch (IOException | NoSuchPaddingException | InvalidKeySpecException | NoSuchAlgorithmException | InvalidKeyException localIOException) {
        } catch (NullPointerException e) {
            status_msg.setForeground(Color.red);
            status_msg.setText("Please open the .txt file");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_encryptbtnActionPerformed

    private void decryptbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptbtnActionPerformed
        // TODO add your handling code here:
        try {
            FileInputStream fis = null;
            FileOutputStream fos = null;
            fis = new FileInputStream(filepath);
            fos = new FileOutputStream("Decrypted.txt");
            key = Arrays.toString(filekeytextfield.getPassword());
            DESKeySpec dks = new DESKeySpec(key.getBytes());
            SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
            SecretKey desKey = skf.generateSecret(dks);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(2, desKey);
            CipherOutputStream cos = new CipherOutputStream(fos, cipher);
            byte[] bytes = new byte[1024];
            int numBytes;
            while ((numBytes = fis.read(bytes)) != -1) {
                cos.write(bytes, 0, numBytes);
            }
            cos.flush();
            cos.close();
            fis.close();
            status_msg.setForeground(new Color(0, 153, 0));
            status_msg.setText("The file has been decrypted successfully");
        } catch (IOException | NoSuchPaddingException | InvalidKeySpecException | InvalidKeyException | NoSuchAlgorithmException localIOException) {
        } catch (NullPointerException e) {
            status_msg.setForeground(Color.red);
            status_msg.setText("Please open the .txt file");
        }
    }//GEN-LAST:event_decryptbtnActionPerformed

    private void filekeytextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filekeytextfieldKeyReleased
        // TODO add your handling code here:
        keylength = filekeytextfield.getPassword().length;
        if (keylength == 0) {
            progressbar.setString("Key Strength");
            progressbar.setValue(keylength);
            encryptbtn.setEnabled(false);
            decryptbtn.setEnabled(false);
        } else if (keylength < 4) {
            progressbar.setForeground(new Color(236, 75, 20));
            progressbar.setString("Week");
            progressbar.setValue(keylength);
            encryptbtn.setEnabled(false);
            decryptbtn.setEnabled(false);
        } else if ((keylength >= 4) && (keylength < 8)) {
            progressbar.setForeground(new Color(231, 138, 35));
            progressbar.setString("Fair");
            progressbar.setValue(keylength);
            encryptbtn.setEnabled(false);
            decryptbtn.setEnabled(false);
        } else if (keylength == 8) {
            progressbar.setForeground(new Color(87, 156, 83));
            progressbar.setString("Strong");
            progressbar.setValue(keylength);
            encryptbtn.setEnabled(true);
            decryptbtn.setEnabled(true);
        } else if (keylength > 8) {
            progressbar.setString("No Effect After 8 Char");
            progressbar.setForeground(new Color(87, 156, 83));
            progressbar.setValue(keylength);
            encryptbtn.setEnabled(true);
            decryptbtn.setEnabled(true);
        }
    }//GEN-LAST:event_filekeytextfieldKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TFEncry_INTF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TFEncry_INTF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TFEncry_INTF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TFEncry_INTF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TFEncry_INTF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton choosebtn;
    private javax.swing.JButton decryptbtn;
    private javax.swing.JButton encryptbtn;
    private javax.swing.JMenuItem exit_menu_item;
    private javax.swing.JMenu file_menu;
    private javax.swing.JPasswordField filekeytextfield;
    private javax.swing.JTextField filetextfield;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel key_to_encrypt_or_decrypt;
    private javax.swing.JMenuBar menu_bar;
    private javax.swing.JMenuItem new_menu_item;
    private javax.swing.JMenuItem open_menu_item;
    private javax.swing.JProgressBar progressbar;
    private javax.swing.JLabel source_file;
    private javax.swing.JLabel status_msg;
    // End of variables declaration//GEN-END:variables
}
