/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;
import Project.ConnectionProvider;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author rasika
 */
public class Tech3 extends javax.swing.JFrame {
public String questionId="1";
public String answer;
public String marks1;
public int marks=0;
//String score="0";
public void answerCheck()
{
    String studentAnswer="";
if(jRadioButton1.isSelected())
{
studentAnswer=jRadioButton1.getText();
}
else if(jRadioButton2.isSelected())
{
studentAnswer=jRadioButton2.getText();
}
else if(jRadioButton3.isSelected())
{
studentAnswer=jRadioButton3.getText();
}
else
{
studentAnswer=jRadioButton4.getText();
}
if(studentAnswer.equals(answer))
{
marks=marks+1;
String marks1=String.valueOf(marks);
jLabel3.setText(marks1);
}
else
{
    String name=jLabel4.getText();
    try{
    Connection con=ConnectionProvider.getCon();
    Statement st=con.createStatement();
    st.executeUpdate("update details set marks='"+marks+"' where name='"+name+"'");
    String marks1=String.valueOf(marks);
     setVisible(false);
    new Congo(marks1).setVisible(true);
      
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}
//question number change
int questionId1=Integer.parseInt(questionId);
questionId1=questionId1+1;
questionId=String.valueOf(questionId1);
//clear jRadioButton
jRadioButton1.setSelected(false);
jRadioButton2.setSelected(false);
jRadioButton3.setSelected(false);
jRadioButton4.setSelected(false);
if(questionId.equals("25"))
{
jButton1.setVisible(false);
}
}

public void Question()
{
try
{
Connection con=ConnectionProvider.getCon();
Statement st=con.createStatement();
ResultSet rsl=st.executeQuery("select *from tech3  where id='"+questionId+"'");
while(rsl.next())
{
jLabel2.setText(rsl.getString(2));
jRadioButton1.setText(rsl.getString(3));
jRadioButton2.setText(rsl.getString(4));
jRadioButton3.setText(rsl.getString(5));
jRadioButton4.setText(rsl.getString(6));
answer=rsl.getString(7);
}
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null, e);
}
}

    /**
     * Creates new form Tech3
     */
public Tech3() {
        initComponents();
}
    public Tech3(String name) {
        initComponents();
          this.setLocationRelativeTo(null);
           jLabel4.setText(name);
        try
        {
         Connection con=ConnectionProvider.getCon();
         Statement st=con.createStatement();
         ResultSet rsl=st.executeQuery("select *from tech3 where id='"+questionId+"'");
         while(rsl.next())
        {
        jLabel2.setText(rsl.getString(2));
        jRadioButton1.setText(rsl.getString(3));
        jRadioButton2.setText(rsl.getString(4));
        jRadioButton3.setText(rsl.getString(5));
        jRadioButton4.setText(rsl.getString(6));
        answer=rsl.getString(7);
        }
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        }       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 660, 80));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 176, 1360, 70));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("00");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 646, 110, 70));

        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton2.setContentAreaFilled(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 670, 80));

        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton3.setContentAreaFilled(false);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 365, 680, 80));

        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton4.setContentAreaFilled(false);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 515, 680, 80));

        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 740, 150, 90));

        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 790, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Game/TECH.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1518, 850));
        jLabel1.setMinimumSize(new java.awt.Dimension(1518, 850));
        jLabel1.setPreferredSize(new java.awt.Dimension(1518, 850));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 1510, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
      if(jRadioButton1.isSelected())
{
jRadioButton2.setSelected(false);
jRadioButton3.setSelected(false);
jRadioButton4.setSelected(false);
}    // TODO add your handling code here:
     // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
       if(jRadioButton2.isSelected())
{
jRadioButton1.setSelected(false);
jRadioButton3.setSelected(false);
jRadioButton4.setSelected(false);
}    // TODO add your handling code here:
    // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
       if(jRadioButton3.isSelected())
{
jRadioButton1.setSelected(false);
jRadioButton2.setSelected(false);
jRadioButton4.setSelected(false);
}    // TODO add your handling code here:
    // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
      if(jRadioButton4.isSelected())
{
jRadioButton1.setSelected(false);
jRadioButton3.setSelected(false);
jRadioButton2.setSelected(false);
}    // TODO add your handling code here:
     // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         answerCheck();
           Question();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Tech3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tech3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tech3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tech3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tech3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
