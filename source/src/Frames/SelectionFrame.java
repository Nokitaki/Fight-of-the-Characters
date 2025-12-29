/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

/**
 *
 * @author Ezzel
 */
import Frames.Homepage;
import Frames.Stage1FrameGojo;
import Frames.Stage1FrameGojo;
import Frames.Stage1FrameGojo;
import Frames.Stage1FrameGojo;
import Frames.Stage1FrameNaruto;
import Frames.Stage1FrameNaruto;
import Frames.Stage1FrameNaruto;
import Frames.Stage1FrameNaruto;
import Frames.Stage1FrameSasuke;
import Frames.Stage1FrameSasuke;
import Frames.Stage1FrameSasuke;
import Frames.Stage1FrameSasuke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Random;

public class SelectionFrame extends javax.swing.JFrame {

    /**
     * Creates new form SelectionFrame
     */
    private javax.swing.JLabel[] characterLabels;
    private int selectedIndex;
    
    private String playerName;
    
    public SelectionFrame(String name) {
        this.playerName = name;
        System.out.println(playerName);
        initComponents();
        centerFrame();
        
        characterLabels = new javax.swing.JLabel[]{
            lblNaruto, lblSasuke, lblGojo, lblIchigo 
        };
        
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_RIGHT) {
                    moveSelection(1);
                } else if (keyCode == KeyEvent.VK_LEFT) {
                    moveSelection(-1);
                } else if (keyCode == KeyEvent.VK_ENTER) {
            confirmSelection();
        }
            }
        });
        // Add mouse click listener to character labels
        for (int i = 0; i < characterLabels.length; i++) {
            final int index = i;
            characterLabels[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    selectedIndex = index;
                    updateSelection();
                    confirmSelection();
                }
            });
        }

        // Set focusable for key events
        setFocusable(true);
        requestFocus();
        
        selectedIndex = 0;
        updateSelection();
    }
    
    private void centerFrame() {
        // Get the screen dimension
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate the center position based on the frame size
        int centerX = (int) ((screenSize.getWidth() - getWidth()) / 2);
        int centerY = (int) ((screenSize.getHeight() - getHeight()) / 2);

        // Set the frame location to the center of the screen
        setLocation(centerX, centerY);
    }
    
    
    private void moveSelection(int offset) {
        selectedIndex = (selectedIndex + offset + characterLabels.length) % characterLabels.length;
        updateSelection();
    }

    private void updateSelection() {
    for (int i = 0; i < characterLabels.length; i++) {
        if (i == selectedIndex) {
            characterLabels[i].setBorder(javax.swing.BorderFactory.createLineBorder(Color.RED, 3));
            switch (i) {
                case 0:
                    lblNarutoFull.setVisible(true);
                    lblNarutotxt.setVisible(true);
                    lblSasukeFull.setVisible(false);
                    lblSasuketxt.setVisible(false);
                    lblIchigoFull.setVisible(false);
                    lblIchigotxt.setVisible(false);
                    lblGojoFull.setVisible(false);
                    lblGojotxt.setVisible(false);
                    break;
                case 1:
                    lblNarutoFull.setVisible(false);
                    lblNarutotxt.setVisible(false);
                    lblSasukeFull.setVisible(true);
                    lblSasuketxt.setVisible(true);
                    lblIchigoFull.setVisible(false);
                    lblIchigotxt.setVisible(false);
                    lblGojoFull.setVisible(false);
                    lblGojotxt.setVisible(false);
                    break;
                case 2:
                    lblNarutoFull.setVisible(false);
                    lblNarutotxt.setVisible(false);
                    lblSasukeFull.setVisible(false);
                    lblSasuketxt.setVisible(false);
                    lblIchigoFull.setVisible(false);
                    lblIchigotxt.setVisible(false);
                    lblGojoFull.setVisible(true);
                    lblGojotxt.setVisible(true);
                    break;
                case 3:
                    lblNarutoFull.setVisible(false);
                    lblNarutotxt.setVisible(false);
                    lblSasukeFull.setVisible(false);
                    lblSasuketxt.setVisible(false);
                    lblIchigoFull.setVisible(true);
                    lblIchigotxt.setVisible(true);
                    lblGojoFull.setVisible(false);
                    lblGojotxt.setVisible(false);
                    break;
            }
        } else {
            characterLabels[i].setBorder(javax.swing.BorderFactory.createEmptyBorder());
        }
    }
}

    
   int hero = 0;
    private void confirmSelection() {
    if (selectedIndex >= 0 && selectedIndex < characterLabels.length) {
        JLabel selectedCharacter = characterLabels[selectedIndex];
        selectedCharacter.setBackground(Color.YELLOW);
        String characterName = "";
        switch (selectedIndex) {
            case 0:
                characterName = "Naruto";
                hero = 1;  
                break;
            case 1:
                characterName = "Sasuke";
                hero = 2;
                break;
            case 2:
                characterName = "Gojo";
                hero = 3;
                break;
            case 3:
                characterName = "Ichigo";
                hero = 4;
                break;
        }
        int choice = JOptionPane.showConfirmDialog(SelectionFrame.this, "Start the game with " + characterName + "?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            startGame(characterName);
        } else {
            selectedCharacter.setBackground(Color.WHITE);
        }
        
    }
}


    private void startGame(String selectedCharacter) {
        // Implement your game logic here
        JOptionPane.showMessageDialog(this, "Game started with " + selectedCharacter);
        if(hero == 1){
            Stage1FrameNaruto naruto = new Stage1FrameNaruto(playerName);
            this.setVisible(false);
            naruto.setVisible(true);
        }
        else if(hero == 2){
            Stage1FrameSasuke sasuke = new Stage1FrameSasuke(playerName);
            this.setVisible(false);
            sasuke.setVisible(true);
        }
        else if(hero == 3){
            Stage1FrameGojo Gojo = new Stage1FrameGojo(playerName);
            this.setVisible(false);
            Gojo.setVisible(true);
        }
        
       else if(hero == 4){
            Stage1FrameIchigo ichigo = new Stage1FrameIchigo(playerName);
            this.setVisible(false);
            ichigo.setVisible(true);
        } 
        
    }
    
    private static String getLastInsertedPlayerName() {
    String playerName = "";
    String sql = "SELECT username FROM leaderboard ORDER BY id DESC LIMIT 1";

    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/fotc_db", "root", "");
         PreparedStatement statement = connection.prepareStatement(sql);
         ResultSet resultSet = statement.executeQuery()) {

        if (resultSet.next()) {
            playerName = resultSet.getString("username");
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Log or handle the exception appropriately
    }

    return playerName;
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        lblSasuketxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblIchigotxt = new javax.swing.JLabel();
        lblGojotxt = new javax.swing.JLabel();
        lblNarutotxt = new javax.swing.JLabel();
        lblNaruto = new javax.swing.JLabel();
        lblGojo = new javax.swing.JLabel();
        lblSasuke = new javax.swing.JLabel();
        lblIchigo = new javax.swing.JLabel();
        lblGojoFull = new javax.swing.JLabel();
        lblSasukeFull = new javax.swing.JLabel();
        lblNarutoFull = new javax.swing.JLabel();
        lblIchigoFull = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back (1).png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.MatteBorder(null)));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setMaximumSize(new java.awt.Dimension(909, 264));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 120, 30));

        lblSasuketxt.setFont(new java.awt.Font("Castellar", 3, 24)); // NOI18N
        lblSasuketxt.setText("SASUKE");
        getContentPane().add(lblSasuketxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 170, 80));

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel2.setText("CHOOSE A CHARACTER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 42));

        lblIchigotxt.setFont(new java.awt.Font("Castellar", 3, 24)); // NOI18N
        lblIchigotxt.setText("ICHIGO");
        getContentPane().add(lblIchigotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 130, 90));

        lblGojotxt.setFont(new java.awt.Font("Castellar", 3, 24)); // NOI18N
        lblGojotxt.setText("GOJO");
        getContentPane().add(lblGojotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, 60));

        lblNarutotxt.setFont(new java.awt.Font("Castellar", 3, 24)); // NOI18N
        lblNarutotxt.setText("NARUTO");
        getContentPane().add(lblNarutotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 60));

        lblNaruto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selectionImages/nrto (1).jpg"))); // NOI18N
        getContentPane().add(lblNaruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 131, -1));

        lblGojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selectionImages/rsz_gojo.png"))); // NOI18N
        getContentPane().add(lblGojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, -1, -1));

        lblSasuke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selectionImages/rsz_sasuke.png"))); // NOI18N
        getContentPane().add(lblSasuke, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        lblIchigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selectionImages/rsz_ichigo.png"))); // NOI18N
        getContentPane().add(lblIchigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        lblGojoFull.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selectionImages/gojofullbod.png"))); // NOI18N
        getContentPane().add(lblGojoFull, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 530));

        lblSasukeFull.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selectionImages/sasukefullbod.png"))); // NOI18N
        getContentPane().add(lblSasukeFull, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 250, 530));

        lblNarutoFull.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selectionImages/narutofullbod.png"))); // NOI18N
        getContentPane().add(lblNarutoFull, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 250, 540));

        lblIchigoFull.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selectionImages/ichigofullbod.png"))); // NOI18N
        getContentPane().add(lblIchigoFull, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 340, 530));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selectionImages/bgselect.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String last =  getLastInsertedPlayerName();
        Homepage homepageFrame = new Homepage(last);
        homepageFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(SelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        String defaultPlayerName = ""; // Provide the default player name
        SelectionFrame sl = new SelectionFrame(defaultPlayerName);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sl.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblGojo;
    private javax.swing.JLabel lblGojoFull;
    private javax.swing.JLabel lblGojotxt;
    private javax.swing.JLabel lblIchigo;
    private javax.swing.JLabel lblIchigoFull;
    private javax.swing.JLabel lblIchigotxt;
    private javax.swing.JLabel lblNaruto;
    private javax.swing.JLabel lblNarutoFull;
    private javax.swing.JLabel lblNarutotxt;
    private javax.swing.JLabel lblSasuke;
    private javax.swing.JLabel lblSasukeFull;
    private javax.swing.JLabel lblSasuketxt;
    // End of variables declaration//GEN-END:variables
}
