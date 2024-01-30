/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sanus
 */
public class MyCurrencyConverter extends javax.swing.JFrame {
    String s[]={"Unit","Indian Rupee","US Dollar","Canadian Dollar","Branzelian Real","Philippine Pisco","Nigerian Naira","Kenyan Shilling","Indonesian Rupiah","Pakistani Rupee"};
    double USDollar=1.31;
    double NigerianNaira=476.57;
    double BranzelianReal=5.47;
    double CanadeianDollar=1.71;
    double KenyanShilling=132.53;
    double IndonesianRupiah=19554.94;
    double IndianRupee=95.21;
    double PhilippinPisco=71.17;
    double PakistaniRupee=162.74;
       
    public MyCurrencyConverter() {
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

        jPanel1 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        fromAmt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        from = new javax.swing.JComboBox<>();
        to = new javax.swing.JComboBox<>();
        toAmt = new javax.swing.JTextField();
        convertCurr = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        toUnit = new javax.swing.JLabel();
        fromUnit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l1.setText("From");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Currency Convert");

        l2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l2.setText("To");

        from.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CURRENCY", "INDIA", "USA", "CANDA", "BRAZIL", "PHILIPPINE", "NIGERIA", "KENYAN", "INDONESIA", "PAKISTAN", " ", " ", " " }));
        from.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fromItemStateChanged(evt);
            }
        });

        to.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CURRENCY", "INDIA", "USA", "CANDA", "BRAZIL", "PHILIPPINE", "NIGERIA", "KENYAN", "INDONESIA", "PAKISTAN" }));
        to.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                toItemStateChanged(evt);
            }
        });
        to.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toActionPerformed(evt);
            }
        });

        toAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toAmtActionPerformed(evt);
            }
        });

        convertCurr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        convertCurr.setText("Convert Currency");
        convertCurr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertCurrActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        toUnit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        toUnit.setText("Unit");

        fromUnit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fromUnit.setText("Unit");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(fromUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(322, 322, 322)
                        .addComponent(toUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fromAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(from, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(282, 282, 282)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(to, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(toAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(convertCurr, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(52, 52, 52)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(from, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(to))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fromAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(toAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(toUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertCurr, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
            from.setSelectedIndex(0);
            to.setSelectedIndex(0);
            fromAmt.setText("");
            toAmt.setText("");
        
    }//GEN-LAST:event_resetActionPerformed

    private void toAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toAmtActionPerformed

    private void toActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_toActionPerformed

    private void fromItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fromItemStateChanged
        int ind=from.getSelectedIndex();
        fromUnit.setText(s[ind]);
    }//GEN-LAST:event_fromItemStateChanged

    private void toItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_toItemStateChanged
                int ind=to.getSelectedIndex();
        toUnit.setText(s[ind]);
    }//GEN-LAST:event_toItemStateChanged

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
            System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void convertCurrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertCurrActionPerformed
            double amountChange=Double.parseDouble(fromAmt.getText());
            double amtInPound=0.0;
            String temp;
            switch(from.getSelectedItem().toString())
            {
                case "INDIA":
                                amtInPound=amountChange/IndianRupee;
                    
                break;
                case "USA":
                                amtInPound=amountChange/USDollar;

                break;
                case "CANDA":
                                amtInPound=amountChange/CanadeianDollar;

                break;    
                case "BRAZIL":
                                 amtInPound=amountChange/BranzelianReal;

                break;    
                case "PHILIPPINE":
                                  amtInPound=amountChange/PhilippinPisco;
;

                break;    
                case "NIGERIA":
                                    amtInPound=amountChange/NigerianNaira;

                break;    
                case "KENYAN":
                                    amtInPound=amountChange/KenyanShilling;

                break;
                case "INDONESIA":
                                    amtInPound=amountChange/IndonesianRupiah;

                break;
                case "PAKISTAN":
                                    amtInPound=amountChange/PakistaniRupee;

                break;
                }
                amountChange=0.0;
            switch(to.getSelectedItem().toString())
            {
                case "INDIA":
                                amountChange=amtInPound*IndianRupee;
                                
                break;
                case "USA":
                                amountChange=amtInPound*USDollar;

                break;
                case "CANDA":
                                amountChange=amtInPound*CanadeianDollar;

                break;    
                case "BRAZIL":
                                 amountChange=amtInPound*BranzelianReal;

                break;    
                case "PHILIPPINE":
                                  amountChange=amtInPound*PhilippinPisco;
;

                break;    
                case "NIGERIA":
                                    amountChange=amtInPound*NigerianNaira;

                break;    
                case "KENYAN":
                                    amountChange=amtInPound*KenyanShilling;

                break;
                case "INDONESIA":
                                    amountChange=amtInPound*IndonesianRupiah;

                break;
                case "PAKISTAN":
                                    amountChange=amtInPound*PakistaniRupee;

                break;
                

            }
            temp=String.format("%.2f",amountChange);
            toAmt.setText(temp);



        
    }//GEN-LAST:event_convertCurrActionPerformed

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
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertCurr;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> from;
    private javax.swing.JTextField fromAmt;
    private javax.swing.JLabel fromUnit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JButton reset;
    private javax.swing.JComboBox<String> to;
    private javax.swing.JTextField toAmt;
    private javax.swing.JLabel toUnit;
    // End of variables declaration//GEN-END:variables
}
