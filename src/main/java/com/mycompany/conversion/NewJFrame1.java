/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.conversion;

import javax.swing.JOptionPane;

/**
 *
 * @author Sohail
 */
public class NewJFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    String box3,box5;
    public NewJFrame1() {
        initComponents();
        this.setBounds(0,0,600,700);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        box1 = new javax.swing.JComboBox<>();
        box4 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(170, 40, 180, 30);

        jButton1.setText("OKAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 250, 72, 23);

        box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Temperature", "Fahrenhiet", "Celcius" }));
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });
        getContentPane().add(box1);
        box1.setBounds(200, 80, 150, 30);

        box4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Temperature", "Celcius", "Fahrenhiet", " " }));
        box4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box4ActionPerformed(evt);
            }
        });
        getContentPane().add(box4);
        box4.setBounds(200, 120, 150, 30);

        jLabel1.setBackground(new java.awt.Color(204, 204, 0));
        jLabel1.setText("From");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 90, 37, 16);

        jLabel3.setText("To");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 130, 30, 16);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 190, 163, 32);

        jLabel2.setText("Enter Temperature");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 50, 120, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String s1,s2;
        
//        s1=jTextField1.getText();
//        float i=Float.parseFloat(s1);
//        double f1=(i-32)/1.8;
//        s2=box1.getItemAt(box1.getSelectedIndex());


        System.out.println("Here"+box3);
        s1=jTextField1.getText();
        
        if(s1.equals(""))
        {
        JOptionPane.showMessageDialog(null,"Not Empty");
        }
        else 
        {
        if(box3.equals("Select Temperature") && box5.equals("Select Temperature"))
        {
          JOptionPane.showMessageDialog(null,"Select Temperature");
        }
        else 
        {
        if(box3.equals("Fahrenhiet") && box5.equals("Celcius")){
           s1=jTextField1.getText();
           float i=Float.parseFloat(s1);
           double f1=(i-32)/1.8;
           s2=String.valueOf(f1);
           jLabel4.setText(s2+" C");
        }
        else if(box3.equals("Celcius") && box5.equals("Fahrenhiet")){
           s1=jTextField1.getText();
           float i=Float.parseFloat(s1);
           double f1=(i*9/5)+32;
           s2=String.valueOf(f1);
           jLabel4.setText(s2+" F");
        
        }
        }
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
        // TODO add your handling code here:
        box3=box1.getSelectedItem().toString();
//        System.out.println(box3);
//        String s1;
//        
//        jLabel4.setText(box2);
//        String box4=jLabel5.getText().toString();
//        
//        
    }//GEN-LAST:event_box1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void box4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box4ActionPerformed
        // TODO add your handling code here:
       box5=box4.getSelectedItem().toString();
//        jLabel5.setText(box2);
//        box3=box2;
    }//GEN-LAST:event_box4ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> box1;
    private javax.swing.JComboBox<String> box4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
