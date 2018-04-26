
package deltataudeltautilityapp;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;


public class MainPanel extends javax.swing.JPanel {

    private PanelManager panelManager;
    private ArrayList<JPanel>panels;
    public MainPanel() {
        initComponents();
        this.setLayout(new GridLayout(0, 1, 0, 0));
        panels = new ArrayList<>();
        panels.add(new StartScreenPanel());
        panels.add(new ViewMemberPanel());
        panels.add(new AddMemberPanel());
        panels.add(new ViewTaskPanel());
        panels.add(new AddTaskPanel());
        this.setFocusable(true);
        
        panelManager = new PanelManager(this, panels);
        
    }
    
    public PanelManager getPanelManager() {
        return panelManager;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
