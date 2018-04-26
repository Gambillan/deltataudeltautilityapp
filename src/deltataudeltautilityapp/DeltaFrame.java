
package deltataudeltautilityapp;

import java.awt.GridLayout;


public class DeltaFrame extends javax.swing.JFrame {

    private PanelManager pm;
    public DeltaFrame() {
        initComponents();
        this.setLayout(new GridLayout(0, 1, 1, 0));
        pm = mainPanel1.getPanelManager();
    }
    
    public PanelManager getPanelManager(){
        PanelManager pm = mainPanel1.getPanelManager();
        return pm;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        mainPanel1 = new deltataudeltautilityapp.MainPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        startScreenMenuItem = new javax.swing.JMenuItem();
        viewMemberMenuItem = new javax.swing.JMenuItem();
        addMemberMenuItem = new javax.swing.JMenuItem();
        viewTaskMenuItem = new javax.swing.JMenuItem();
        addTaskMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("View");

        startScreenMenuItem.setText("Start Screen");
        startScreenMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                startScreenMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(startScreenMenuItem);

        viewMemberMenuItem.setText("view member");
        viewMemberMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                viewMemberMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(viewMemberMenuItem);

        addMemberMenuItem.setText("Add member");
        addMemberMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addMemberMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(addMemberMenuItem);

        viewTaskMenuItem.setText("view task");
        viewTaskMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                viewTaskMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(viewTaskMenuItem);

        addTaskMenuItem.setText("add task");
        addTaskMenuItem.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addTaskMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(addTaskMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startScreenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startScreenMenuItemActionPerformed
        pm.goToPanel(0);
    }//GEN-LAST:event_startScreenMenuItemActionPerformed

    private void viewMemberMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMemberMenuItemActionPerformed
        pm.goToPanel(1);
    }//GEN-LAST:event_viewMemberMenuItemActionPerformed

    private void addMemberMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberMenuItemActionPerformed
        pm.goToPanel(2);
    }//GEN-LAST:event_addMemberMenuItemActionPerformed

    private void viewTaskMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskMenuItemActionPerformed
        pm.goToPanel(3);
    }//GEN-LAST:event_viewTaskMenuItemActionPerformed

    private void addTaskMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskMenuItemActionPerformed
        pm.goToPanel(4);
    }//GEN-LAST:event_addTaskMenuItemActionPerformed

    
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
            java.util.logging.Logger.getLogger(DeltaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeltaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeltaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeltaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeltaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addMemberMenuItem;
    private javax.swing.JMenuItem addTaskMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private deltataudeltautilityapp.MainPanel mainPanel1;
    private javax.swing.JMenuItem startScreenMenuItem;
    private javax.swing.JMenuItem viewMemberMenuItem;
    private javax.swing.JMenuItem viewTaskMenuItem;
    // End of variables declaration//GEN-END:variables
}
