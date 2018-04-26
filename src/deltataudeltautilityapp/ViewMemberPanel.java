/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deltataudeltautilityapp;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ViewMemberPanel extends javax.swing.JPanel {
    MemberController mc = new MemberController();
    DefaultTableModel model;
    public ViewMemberPanel() {
        initComponents();
        model = new DefaultTableModel();
        viewMemberTable.setModel(model);
        String[] columnNames = {"First Name", "Last Name", "Position", "Year", "Major", "Email"};
        model.setColumnIdentifiers(columnNames);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        majorTextField = new javax.swing.JTextField();
        yearComboBox = new javax.swing.JComboBox<>();
        positionComboBox = new javax.swing.JComboBox<>();
        emailTextField = new javax.swing.JTextField();
        retreiveMemberButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewMemberTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 51, 153));

        jLabel2.setForeground(new java.awt.Color(255, 233, 0));
        jLabel2.setText("First Name");

        jLabel3.setForeground(new java.awt.Color(255, 233, 0));
        jLabel3.setText("Last Name");

        jLabel4.setForeground(new java.awt.Color(255, 233, 0));
        jLabel4.setText("Position");

        jLabel5.setForeground(new java.awt.Color(255, 233, 0));
        jLabel5.setText("Year");

        jLabel6.setForeground(new java.awt.Color(255, 233, 0));
        jLabel6.setText("Major");

        jLabel7.setForeground(new java.awt.Color(255, 233, 0));
        jLabel7.setText("Email");

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Freshman", "Sophmore", "Junior", "Senior", " " }));

        positionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "President", "Vice President", "Secretary", "Treasurer", "Recruitment", "DAA", "Sergant at Arms" }));

        retreiveMemberButton.setText("Retreive Members");
        retreiveMemberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retreiveMemberButtonActionPerformed(evt);
            }
        });

        viewMemberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(viewMemberTable);

        jButton1.setText("Get All Members");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(125, 125, 125))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(173, 173, 173)
                        .addComponent(jLabel7)
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(majorTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(emailTextField))
                        .addGap(87, 87, 87))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(retreiveMemberButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(majorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retreiveMemberButton)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void retreiveMemberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retreiveMemberButtonActionPerformed
        if (!firstNameTextField.getText().equals("")) {
            ArrayList<Member> members = mc.retreiveMemberByFirstName(firstNameTextField.getText());
            Object[]row = new Object[6];
            for(int i = 0; i < members.size();i++){
                Member m = members.get(i);
                row[0] = m.getFirstName();
                row[1] = m.getLastName();
                row[2] = m.getPosition();
                row[3] = m.getYear();
                row[4] = m.getMajor();
                row[5] = m.getEmail();
            }
            model.addRow(row);
        }


    }//GEN-LAST:event_retreiveMemberButtonActionPerformed
    public int getSelectedYear(Member member) {
        int yearSelected = 0;
        if (member.getYear().equals("Freshman")) {
            yearSelected = 0;
        } else if (member.getYear().equals("Sophmore")) {
            yearSelected = 1;
        } else if (member.getYear().equals("Junior")) {
            yearSelected = 2;
        } else {
            yearSelected = 3;
        }

        return yearSelected;
    }

    public int getSelectedPosition(Member member) {
        int selectedPosition = 0;

        if (member.getPosition().equals("President")) {
            selectedPosition = 0;
        } else if (member.getPosition().equals("Vice President")) {
            selectedPosition = 1;
        } else if (member.getPosition().equals("Secretary")) {
            selectedPosition = 2;
        } else if (member.getPosition().equals("Treasurer")) {
            selectedPosition = 3;
        } else if (member.getPosition().equals("Recruitment")) {
            selectedPosition = 4;
        } else if (member.getPosition().equals("DAA")) {
            selectedPosition = 5;
        } else if (member.getPosition().equals("Sergant at Arms")) {
            selectedPosition = 6;
        } else {
            selectedPosition = 7;
        }

        return selectedPosition;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField majorTextField;
    private javax.swing.JComboBox<String> positionComboBox;
    private javax.swing.JButton retreiveMemberButton;
    private javax.swing.JTable viewMemberTable;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
