/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

/**
 *
 * @author Ezzel
 */
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

public class SelectionFrame extends javax.swing.JFrame {

    /**
     * Creates new form SelectionFrame
     */
    private javax.swing.JLabel[] characterLabels;
    private int selectedIndex;
    private int heroSelected;
    private int Naruto = 1;
    private int Sasuke = 2;
    private int Gojo = 3;
    private int Ichigo = 4;
    
    public int getNaruto(){
        return Naruto;
    }
    public int getSasuke(){
        return Sasuke;
    }
    public int getGojo(){
        return Gojo;
    }
    public int getIchigo(){
        return Ichigo;
    }
    
    private String playerName;
     
    
   
     public int getHeroSelected(){
        return heroSelected;
    }
     public void setHeroSelected(int heroSelected){
        this.heroSelected = heroSelected;
    }
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
            } else {
                characterLabels[i].setBorder(javax.swing.BorderFactory.createEmptyBorder());
            }
        }
    }
    
    private void confirmSelection() {
    if (selectedIndex >= 0 && selectedIndex < characterLabels.length) {
        JLabel selectedCharacter = characterLabels[selectedIndex];
        selectedCharacter.setBackground(Color.YELLOW);
        String characterName = "";
        switch (selectedIndex) {
            case 0:
                characterName = "Naruto";
                setHeroSelected(1);
                break;
            case 1:
                characterName = "Sasuke";
                setHeroSelected(2);
                break;
            case 2:
                characterName = "Gojo";
                setHeroSelected(3);
                break;
            case 3:
                characterName = "Ichigo";
                setHeroSelected(4);
                break;
        }
        int choice = JOptionPane.showConfirmDialog(SelectionFrame.this, "Start the game with " + characterName + "?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            startGame(characterName);
            if(characterName=="Naruto"){
                Naruto=1;
            }
            else if(characterName=="Sasuke"){
                Naruto=2;
            } else if(characterName=="Gojo"){
                Naruto=3;
            } else if(characterName=="Ichigo"){
                Naruto=4;
            }
        } else {
            selectedCharacter.setBackground(Color.WHITE);
        }
        
    }
}


    private void startGame(String selectedCharacter) {
        // Implement your game logic here
        JOptionPane.showMessageDialog(this, "Game started with " + selectedCharacter);
        if(heroSelected == 1){
            Stage1FrameNaruto naruto = new Stage1FrameNaruto(playerName);
            this.setVisible(false);
            naruto.setVisible(true);
            heroSelected =1;
            
           
        }   
        else if(heroSelected == 2){
            Stage1FrameSasuke sasuke = new Stage1FrameSasuke(playerName);
            this.setVisible(false);
            sasuke.setVisible(true);
            heroSelected =2;
        }
        else if(heroSelected == 3){
            Stage1FrameGojo Gojo = new Stage1FrameGojo(playerName);
            this.setVisible(false);
            Gojo.setVisible(true);
            heroSelected =3;
            
        }
        
       else if(heroSelected == 4){
            Stage1FrameIchigo ichigo = new Stage1FrameIchigo(playerName);
            this.setVisible(false);
            ichigo.setVisible(true);
           heroSelected =4;
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

        lblNaruto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblGojo = new javax.swing.JLabel();
        lblSasuke = new javax.swing.JLabel();
        lblIchigo = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNaruto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selectionImages/nrto (1).jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel2.setText("Select Hero");

        lblGojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selectionImages/rsz_gojo.png"))); // NOI18N

        lblSasuke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selectionImages/rsz_sasuke.png"))); // NOI18N

        lblIchigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/selectionImages/rsz_ichigo.png"))); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(lblNaruto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblSasuke, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(lblGojo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lblIchigo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(289, 289, 289))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGojo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNaruto, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblSasuke, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addComponent(lblIchigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

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
       
        String defaultPlayerName = ""; // Provide the default player name
        SelectionFrame sl = new SelectionFrame(defaultPlayerName); 
       System.out.print(sl.getHeroSelected());
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sl.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblGojo;
    private javax.swing.JLabel lblIchigo;
    private javax.swing.JLabel lblNaruto;
    private javax.swing.JLabel lblSasuke;
    // End of variables declaration//GEN-END:variables
}
