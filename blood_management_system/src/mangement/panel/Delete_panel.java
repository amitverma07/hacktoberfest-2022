
package mangement.panel;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import mangement.MySqlConnect;

public class Delete_panel extends javax.swing.JPanel {
    
    private Cursor textCursor, handCursor;

    /**
     * Creates new form Delete_panel
     */
    public Delete_panel() {
        initComponents();
        
        advantage_Blood.setWrapStyleWord(true); //Wrap the word in text area
        advantage_Blood.setLineWrap(true);  // Line Wrap in the text area
        
        delete_textArea.setWrapStyleWord(true);  
        delete_textArea.setLineWrap(true);
        
        // Creating Cursor
        
        textCursor = new Cursor(Cursor.TEXT_CURSOR);
        handCursor = new Cursor(Cursor.HAND_CURSOR);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        delete_textArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        account_number = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        advantage_Blood = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 270, -1));

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Are you sure you want to delete your Account ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, 69));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 360, 20));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 0, 51));
        delete.setText("Delete ");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 120, 40));

        delete_textArea.setBackground(new java.awt.Color(51, 0, 51));
        delete_textArea.setColumns(20);
        delete_textArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        delete_textArea.setForeground(new java.awt.Color(255, 255, 255));
        delete_textArea.setRows(5);
        jScrollPane2.setViewportView(delete_textArea);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 330, 150));

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Your 12 digit number");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 300, 39));

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Reason of leaving ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 300, 39));

        account_number.setBackground(new java.awt.Color(51, 0, 51));
        account_number.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        account_number.setForeground(new java.awt.Color(255, 255, 255));
        account_number.setBorder(null);
        jPanel1.add(account_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 240, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 240, 10));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 560, 540));

        advantage_Blood.setEditable(false);
        advantage_Blood.setBackground(new java.awt.Color(51, 51, 51));
        advantage_Blood.setColumns(20);
        advantage_Blood.setForeground(new java.awt.Color(255, 255, 255));
        advantage_Blood.setLineWrap(true);
        advantage_Blood.setRows(5);
        advantage_Blood.setText("Blood donation has many benefits for the blood donor. It gives certain facilities to the people while the blood was donating. It is a good thing for everyone. It is safe for blood giving people.\n\nSaves the life of someone\n\nIf we donate the blood, then we can save someone life.It will be very honorable for us. Many of the people need the urgent blood, so we can keep that person by donating the blood. It gives much satisfaction to us, which is the biggest thing that we will never experience.\nBlood donation is our human duty. Our body does not get affected if we donate blood. The body can repair the loss within a few days. So we must come forward to give blood as it can make sure the return of a dying man again into the light of life.\n\nEveryone has to give the blood for better health and save someone life. During the giving of blood as it is painless and will take about an hour only. So whenever we have spare time, we can visit the hospital and donate the blood. We will surely feel happy as people will shower their blessings on us for giving ourselves blood and saving their life.\nREDUCES CANCER RISK\n\nGive blood to help lower your risk of cancer. According to the Miller-Keystone Blood Center, consistent blood donation is associated with lowered risks of cancers, including liver, lung, colon, stomach and throat cancers. Risk levels drop in correlation with how often participants donate blood.\n\nFREE HEALTH SCREENING DONE\n\nIn addition to all of these benefits, a donor receives a free prior health screening plus mini blood test. There will be an HB level test, as well as a blood pressure and body check. Blood is also tested for some major diseases and the donor is immediately informed in strict confidentiality if any of these tests show positive results.\n");
        advantage_Blood.setBorder(null);
        advantage_Blood.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        advantage_Blood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                advantage_BloodMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(advantage_Blood);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 440, 470));

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Advantages of the Blood Donation");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 300, 39));
    }// </editor-fold>//GEN-END:initComponents

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        
        delete.setCursor(handCursor);
        delete.setBackground(Color.RED);
        delete.setForeground(Color.white);
        
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
       delete.setBackground(Color.WHITE);
       delete.setForeground(new Color(0, 0, 51));
    }//GEN-LAST:event_deleteMouseExited

    private void advantage_BloodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advantage_BloodMouseEntered
        
        advantage_Blood.setCursor(textCursor);
    }//GEN-LAST:event_advantage_BloodMouseEntered
    // To validate field    
    private boolean validateField(){
        
        if (account_number.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Please enter your 12 digit number","Warning",JOptionPane.PLAIN_MESSAGE);
            
            return false;
        }
        
        return true;
    }

    
    
    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        

        
        if (validateField()){
            
             try  {
            
            Connection conn = MySqlConnect.ConnectDB();
            String query = "DELETE FROM blood_management_system.donar_information WHERE phoneNumber = '"+account_number.getText()+"'";
            PreparedStatement pst = conn.prepareStatement(query);
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Successfully","Success",JOptionPane.PLAIN_MESSAGE);
            
        }catch (Exception e){
            
            /* IGNORE */
        }
        }
        
       
        
    }//GEN-LAST:event_deleteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField account_number;
    private javax.swing.JTextArea advantage_Blood;
    private javax.swing.JButton delete;
    private javax.swing.JTextArea delete_textArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField phone_Number;
    // End of variables declaration//GEN-END:variables
}
