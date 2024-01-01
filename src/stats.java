
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author mary-emmabarnhill
 */
public class stats extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    reader readerObj = new reader();
    
    public stats() {
        initComponents();
        conn = databaseConnection.connection();
        getStatistics();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        avgDaysLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        booksThisMonthLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Sukhumvit Set", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Statistics");

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Average days per book:");

        avgDaysLabel.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        avgDaysLabel.setForeground(new java.awt.Color(255, 255, 255));
        avgDaysLabel.setText(" ");

        jLabel3.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Books read this month:");

        booksThisMonthLabel.setForeground(new java.awt.Color(255, 255, 255));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(avgDaysLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(booksThisMonthLabel)))
                .addContainerGap(230, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(avgDaysLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(booksThisMonthLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(571, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        homepage homeObj = new homepage();
        homeObj.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stats().setVisible(true);
            }
        });
    }
    
    private void getStatistics() {
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM books WHERE reader = '" + readerObj.getReader() + "' ";
            ResultSet rs = stmt.executeQuery(sql);

            int currAverage;
            int totalAverage = 0;
            ArrayList<String[]> bookData = new ArrayList<String[]>(100);
            
            int i;
            int count = 2;
            int currMonthBooks = 0;
            String newRow[];
            newRow = new String[count];
            while (rs.next())
            {
                for(i = 0; i < count; i++)
                {
                    newRow[i] = rs.getString(i+6);
                }
                bookData.add(newRow);     
            }

            for (i = 0; i < bookData.size(); i++) {
                String dateStarted = bookData.get(i)[0]; //rs.getString("dateStarted");
                String dateFinished = bookData.get(i)[1]; //rs.getString("dateFinished");

                String sql2 = "SELECT DATEDIFF('" + dateFinished + "', '" + dateStarted + "')AS DateDiff";
                
                ResultSet rs2 = stmt.executeQuery(sql2);
                rs2.next();
                currAverage = Integer.valueOf(rs2.getString("DateDiff"));
                totalAverage += currAverage;
                
                ResultSet rsBookMonth = stmt.executeQuery("SELECT MONTH('" + dateFinished + "') AS BookMonth");
                rsBookMonth.next();
                String bookMonth = rsBookMonth.getString("BookMonth");
                
                ResultSet rsCurrMonth = stmt.executeQuery("SELECT MONTH(NOW()) AS PresentMonth");
                rsCurrMonth.next();
                String currentMonth = rsCurrMonth.getString("PresentMonth");
                
                if (currentMonth.equals(bookMonth)) {
                    currMonthBooks += 1;
                }
            }
            avgDaysLabel.setText(String.valueOf(totalAverage / bookData.size()));
            booksThisMonthLabel.setText(String.valueOf(currMonthBooks));
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Exception : "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void storeData(ResultSet rs, ArrayList<String[]> data) {
        int i;
        int count = 2;
        String newRow[];
        newRow = new String[count];

        try
        {
            while (rs.next())
            {
                for(i = 3; i < 3 + count; i++)
                {
                    newRow[i] = rs.getString(i+3);
                }
                data.add(newRow);     
            }
        }

        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Exception : "+e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avgDaysLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel booksThisMonthLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}