
package mangement.panel;

import java.awt.Cursor;
import mangement.Donor_form;
import mangement.Home;
import mangement.Sell_Blood;
import mangement.need_Blood;

public class Home_panel extends javax.swing.JPanel {
    
    private Cursor hand_cursor = new Cursor(Cursor.HAND_CURSOR);;

 
    /**
     * Creates new form Home_panel
     */
    public Home_panel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        beDonar = new javax.swing.JLabel();
        need_blood = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        search_donar = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(80, 103, 162));
        setForeground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Donate blood and be the reason of smile to many faces");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 390, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome to Blood Management System");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 500, 90));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Be Blood Donar.png"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, 160));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Search.png"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 120, 130));

        beDonar.setBackground(new java.awt.Color(80, 103, 162));
        beDonar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        beDonar.setForeground(new java.awt.Color(255, 255, 255));
        beDonar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        beDonar.setText("Be a Donor ");
        beDonar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                beDonarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                beDonarMouseEntered(evt);
            }
        });
        add(beDonar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 150, 40));

        need_blood.setBackground(new java.awt.Color(80, 103, 162));
        need_blood.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        need_blood.setForeground(new java.awt.Color(255, 255, 255));
        need_blood.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        need_blood.setText("Sell Blood");
        need_blood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                need_bloodMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                need_bloodMouseEntered(evt);
            }
        });
        add(need_blood, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 380, 160, 40));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 130, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 140, 50));

        search_donar.setBackground(new java.awt.Color(80, 103, 162));
        search_donar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search_donar.setForeground(new java.awt.Color(255, 255, 255));
        search_donar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        search_donar.setText("Need Blood ?");
        search_donar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_donarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                search_donarMouseEntered(evt);
            }
        });
        add(search_donar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 160, 40));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 140, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Need Blood.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 160, 150));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 204));
        jLabel2.setText("To our Visitor who need blood  ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 220, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 204));
        jLabel4.setText("Easier Than Ever");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 160, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 204));
        jLabel7.setText("Save Lives!!");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 120, 20));

        jLabel9.setForeground(new java.awt.Color(102, 255, 204));
        jLabel9.setText("Sell your Blood ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 100, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 255, 204));
        jLabel10.setText("Find the Donor Available");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 180, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 204));
        jLabel11.setText("Donate your Valuable Blood");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 210, 20));

        jLabel12.setForeground(new java.awt.Color(255, 204, 204));
        jLabel12.setText("Join The Community");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 130, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 204));
        jLabel13.setText("Near You!!");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 110, 20));

        jLabel14.setForeground(new java.awt.Color(204, 255, 204));
        jLabel14.setText("Just one More Step");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 110, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void beDonarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beDonarMouseClicked

        Donor_form newForm = new Donor_form();
        newForm.setVisible(true);

    }//GEN-LAST:event_beDonarMouseClicked

    private void beDonarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beDonarMouseEntered

        beDonar.setCursor(hand_cursor);
    }//GEN-LAST:event_beDonarMouseEntered

    private void need_bloodMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_need_bloodMouseEntered

        need_blood.setCursor(hand_cursor);
    }//GEN-LAST:event_need_bloodMouseEntered

    private void search_donarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_donarMouseEntered

        search_donar.setCursor(hand_cursor);
    }//GEN-LAST:event_search_donarMouseEntered
    
    private void need_bloodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_need_bloodMouseClicked
        
        Sell_Blood sell = new Sell_Blood();
        sell.setVisible(true);
    }//GEN-LAST:event_need_bloodMouseClicked

    private void search_donarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_donarMouseClicked
        
        need_Blood need_blood = new need_Blood();
        need_blood.setVisible(true);
    }//GEN-LAST:event_search_donarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel beDonar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel need_blood;
    private javax.swing.JLabel search_donar;
    // End of variables declaration//GEN-END:variables
}