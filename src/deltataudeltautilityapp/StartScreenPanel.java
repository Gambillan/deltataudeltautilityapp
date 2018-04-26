/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deltataudeltautilityapp;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author gambila
 */
public class StartScreenPanel extends javax.swing.JPanel {

    BufferedImage logo;
    
    public StartScreenPanel() {
        initComponents();
        
        try
        {
            logo = ImageIO.read(getClass().getResource("/images/deltlogoscaled.png"));
        } catch (IOException ex)
        {
            System.out.println("Error loading logo: " + ex.getMessage());
        }
    }
    
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(logo,175,150 , this);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        viewMemberButton = new javax.swing.JButton();
        addMemberButton = new javax.swing.JButton();
        viewTasksButton = new javax.swing.JButton();
        addTasksButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 51, 153));

        viewMemberButton.setText("View Member Roster");
        viewMemberButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                viewMemberButtonActionPerformed(evt);
            }
        });

        addMemberButton.setText("Add/Update Member Roster");

        viewTasksButton.setText("View Tasks");

        addTasksButton.setText("Add/Update Tasks");

        jLabel1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 223, 0));
        jLabel1.setText("Delta Tau Delta Task Manager");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addMemberButton)
                    .addComponent(viewMemberButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewTasksButton)
                    .addComponent(addTasksButton))
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 480, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewTasksButton)
                    .addComponent(viewMemberButton))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMemberButton)
                    .addComponent(addTasksButton))
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewMemberButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_viewMemberButtonActionPerformed
    {//GEN-HEADEREND:event_viewMemberButtonActionPerformed
        
    }//GEN-LAST:event_viewMemberButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMemberButton;
    private javax.swing.JButton addTasksButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton viewMemberButton;
    private javax.swing.JButton viewTasksButton;
    // End of variables declaration//GEN-END:variables
}
