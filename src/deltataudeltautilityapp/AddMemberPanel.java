/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deltataudeltautilityapp;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AddMemberPanel extends javax.swing.JPanel {

    private MemberController mc;
    private int result;

    public AddMemberPanel() {
        initComponents();
        mc = new MemberController();
        result = 0;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        positionComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        majorTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        retreiveButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        resultLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 51, 153));

        jLabel3.setForeground(new java.awt.Color(255, 223, 0));
        jLabel3.setText("First Name");

        jLabel1.setForeground(new java.awt.Color(255, 223, 0));
        jLabel1.setText("Last Name");

        jLabel2.setForeground(new java.awt.Color(255, 223, 0));
        jLabel2.setText("Position");

        positionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "President", "Vice President", "Secretary", "Treasurer", "Recruitment", "DAA", "Sergant at Arms", "General Member", " " }));

        jLabel4.setForeground(new java.awt.Color(255, 223, 0));
        jLabel4.setText("Year");

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Freshman", "Sophmore", "Junior", "Senior" }));

        jLabel5.setForeground(new java.awt.Color(255, 223, 0));
        jLabel5.setText("Major");

        jLabel6.setForeground(new java.awt.Color(255, 223, 0));
        jLabel6.setText("Email");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        retreiveButton.setText("Retreive");
        retreiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retreiveButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        resultLabel.setForeground(new java.awt.Color(255, 223, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(majorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateButton)
                            .addComponent(submitButton)
                            .addComponent(retreiveButton)))
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(resultLabel))
                .addContainerGap(537, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(positionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(1, 1, 1)
                        .addComponent(majorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(retreiveButton)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(resultLabel)
                .addGap(75, 75, 75))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

        if (firstNameTextField.getText().equals("") || lastNameTextField.getText().equals("") || majorTextField.getText().equals("") || emailTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out all fields!");
        } else {
            result = mc.insertNewMember(firstNameTextField.getText(), lastNameTextField.getText(),
                    positionComboBox.getItemAt(positionComboBox.getSelectedIndex()),
                    yearComboBox.getItemAt(yearComboBox.getSelectedIndex()),
                    majorTextField.getText(), emailTextField.getText());
            if (result != -1) {
                resultLabel.setText("Successfully Inserted!");
            } else {
                resultLabel.setText("Insert Failed!");
            }
        }


    }//GEN-LAST:event_submitButtonActionPerformed

    private void retreiveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retreiveButtonActionPerformed
        
        int yearSelected = 0;
        int positionSelected = 0;
        if(!firstNameTextField.getText().equals("")){
            ArrayList<Member>members = mc.retreiveMemberByFirstName(firstNameTextField.getText());
            yearSelected = getSelectedYear(members.get(0));
            positionSelected = getSelectedPosition(members.get(0));
            yearComboBox.setSelectedIndex(yearSelected);
            positionComboBox.setSelectedIndex(positionSelected);
            lastNameTextField.setText(members.get(0).getLastName());
            majorTextField.setText(members.get(0).getMajor());
            emailTextField.setText(members.get(0).getEmail());
        }
        else if(!lastNameTextField.getText().equals("")){
            ArrayList<Member>members = mc.retreiveMemberByLastName(lastNameTextField.getText());
            yearSelected = getSelectedYear(members.get(0));
            positionSelected = getSelectedPosition(members.get(0));
            yearComboBox.setSelectedIndex(yearSelected);
            positionComboBox.setSelectedIndex(positionSelected);
            firstNameTextField.setText(members.get(0).getFirstName());
            majorTextField.setText(members.get(0).getMajor());
            emailTextField.setText(members.get(0).getEmail());
        }
        else if(!emailTextField.getText().equals("")){
            ArrayList<Member>members = mc.retreiveMemberByEmail(emailTextField.getText());
            yearSelected = getSelectedYear(members.get(0));
            positionSelected = getSelectedPosition(members.get(0));
            yearComboBox.setSelectedIndex(yearSelected);
            positionComboBox.setSelectedIndex(positionSelected);
            firstNameTextField.setText(members.get(0).getFirstName());
            majorTextField.setText(members.get(0).getMajor());
            lastNameTextField.setText(members.get(0).getLastName());
        }
        else if(firstNameTextField.getText().equals("")&&
                lastNameTextField.getText().equals("")&&
                majorTextField.getText().equals("")&&emailTextField.getText().equals("")){
            ArrayList<Member>members = mc.retreiveMemberByPosition(getMemberPosition(positionComboBox.getSelectedIndex()));
            yearSelected = getSelectedYear(members.get(0));
            yearComboBox.setSelectedIndex(yearSelected);
            emailTextField.setText(members.get(0).getEmail());
            firstNameTextField.setText(members.get(0).getFirstName());
            majorTextField.setText(members.get(0).getMajor());
            lastNameTextField.setText(members.get(0).getLastName());
        }
        
    }//GEN-LAST:event_retreiveButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
       if (firstNameTextField.getText().equals("") || lastNameTextField.getText().equals("") || majorTextField.getText().equals("") || emailTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill out all fields!");
        } else {
            result = mc.updateMember(firstNameTextField.getText(), lastNameTextField.getText(),
                    positionComboBox.getItemAt(positionComboBox.getSelectedIndex()),
                    yearComboBox.getItemAt(yearComboBox.getSelectedIndex()),
                    majorTextField.getText(), emailTextField.getText());
            if (result != -1) {
                resultLabel.setText("Successfully Updated!");
            } else {
                resultLabel.setText("Insert Failed!");
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    
    public int getSelectedYear(Member member){
        int yearSelected = 0;
        if(member.getYear().equals("Freshman")){
                yearSelected = 0;
            }
            else if(member.getYear().equals("Sophmore")){
                yearSelected = 1;
            }
            else if(member.getYear().equals("Junior")){
                yearSelected = 2;
            }
            else{
                yearSelected = 3;
            }
        
        return yearSelected;
    }
    
    public int getSelectedPosition(Member member){
        int selectedPosition = 0;
        
        if(member.getPosition().equals("President")){
            selectedPosition = 0;
        }
        else if(member.getPosition().equals("Vice President")){
            selectedPosition = 1;
        }
        else if(member.getPosition().equals("Secretary")){
            selectedPosition = 2;
        }
        else if(member.getPosition().equals("Treasurer")){
            selectedPosition = 3;
        }
        else if(member.getPosition().equals("Recruitment")){
            selectedPosition = 4;
        }
        else if(member.getPosition().equals("DAA")){
            selectedPosition = 5;
        }
        else if(member.getPosition().equals("Sergant at Arms")){
            selectedPosition = 6;
        }
        else{
            selectedPosition = 7;
        }
            
        
            
     return selectedPosition;       
    }
    
    public String getMemberPosition(int index){
        String s = "";
        if(index == 0){
            s = "President";
        }
        else if(index == 1){
            s = "Vice President";
        }
        else if(index == 2){
            s = "Secretary";
        }
        else if(index == 3){
            s = "Treasurer";
        }
        else if(index == 4){
            s = "Recruitment";
        }
        else if(index == 5){
            s = "DAA";
        }
        else if(index == 6){
            s = "Sergant at Arms";
        }
        else{
           s = "General Member"; 
        }
        return s;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField majorTextField;
    private javax.swing.JComboBox<String> positionComboBox;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JButton retreiveButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JComboBox<String> yearComboBox;
    // End of variables declaration//GEN-END:variables
}
