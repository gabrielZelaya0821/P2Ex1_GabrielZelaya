/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package p2ex1_gabrielzelaya;

/**
 *
 * @author gabri
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
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

        CRUD = new javax.swing.JFrame();
        JTP_crud = new javax.swing.JTabbedPane();
        JP_crear = new javax.swing.JPanel();
        Btn_PC = new javax.swing.JButton();
        btn_Laptop = new javax.swing.JButton();
        JP_listar = new javax.swing.JPanel();
        JP_eliminar = new javax.swing.JPanel();
        JF_crearPC = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        JL_ip = new javax.swing.JLabel();
        JTF_ip = new javax.swing.JTextField();
        bg_principal = new javax.swing.JPanel();
        btn_ingresar = new javax.swing.JButton();
        btn_crud = new javax.swing.JButton();

        CRUD.setMinimumSize(new java.awt.Dimension(846, 486));
        CRUD.setResizable(false);

        JP_crear.setBackground(new java.awt.Color(102, 102, 255));
        JP_crear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_PC.setText("PC");
        Btn_PC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_PCMouseClicked(evt);
            }
        });
        JP_crear.add(Btn_PC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 100, 50));

        btn_Laptop.setText("LAPTOP");
        JP_crear.add(btn_Laptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 90, 50));

        JTP_crud.addTab("Crear", JP_crear);

        javax.swing.GroupLayout JP_listarLayout = new javax.swing.GroupLayout(JP_listar);
        JP_listar.setLayout(JP_listarLayout);
        JP_listarLayout.setHorizontalGroup(
            JP_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        JP_listarLayout.setVerticalGroup(
            JP_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        JTP_crud.addTab("Listar", JP_listar);

        javax.swing.GroupLayout JP_eliminarLayout = new javax.swing.GroupLayout(JP_eliminar);
        JP_eliminar.setLayout(JP_eliminarLayout);
        JP_eliminarLayout.setHorizontalGroup(
            JP_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 647, Short.MAX_VALUE)
        );
        JP_eliminarLayout.setVerticalGroup(
            JP_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );

        JTP_crud.addTab("Eliminar", JP_eliminar);

        javax.swing.GroupLayout CRUDLayout = new javax.swing.GroupLayout(CRUD.getContentPane());
        CRUD.getContentPane().setLayout(CRUDLayout);
        CRUDLayout.setHorizontalGroup(
            CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JTP_crud, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        CRUDLayout.setVerticalGroup(
            CRUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CRUDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JTP_crud)
                .addGap(18, 18, 18))
        );

        JF_crearPC.setBackground(new java.awt.Color(102, 102, 255));
        JF_crearPC.setResizable(false);
        JF_crearPC.setSize(new java.awt.Dimension(436, 233));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(430, 221));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JL_ip.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        JL_ip.setText("IP Adress:");
        jPanel1.add(JL_ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 60, 30));

        JTF_ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTF_ipActionPerformed(evt);
            }
        });
        jPanel1.add(JTF_ip, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 260, 30));

        javax.swing.GroupLayout JF_crearPCLayout = new javax.swing.GroupLayout(JF_crearPC.getContentPane());
        JF_crearPC.getContentPane().setLayout(JF_crearPCLayout);
        JF_crearPCLayout.setHorizontalGroup(
            JF_crearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_crearPCLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        JF_crearPCLayout.setVerticalGroup(
            JF_crearPCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JF_crearPCLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        bg_principal.setBackground(new java.awt.Color(102, 102, 255));
        bg_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_ingresar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btn_ingresar.setText("Ingresar");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        bg_principal.add(btn_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 230, 169, 67));

        btn_crud.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        btn_crud.setText("CRUD");
        btn_crud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_crudMouseClicked(evt);
            }
        });
        btn_crud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crudActionPerformed(evt);
            }
        });
        bg_principal.add(btn_crud, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 119, 169, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_crudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_crudMouseClicked
        this.setVisible(false);
        CRUD.setLocationRelativeTo(this);
        CRUD.setVisible(true);
    }//GEN-LAST:event_btn_crudMouseClicked

    private void btn_crudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_crudActionPerformed

    private void Btn_PCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_PCMouseClicked
        CRUD.setVisible(false);
        JF_crearPC.setLocationRelativeTo(this);
        JF_crearPC.setVisible(true);
    }//GEN-LAST:event_Btn_PCMouseClicked

    private void JTF_ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTF_ipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTF_ipActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_PC;
    private javax.swing.JFrame CRUD;
    private javax.swing.JFrame JF_crearPC;
    private javax.swing.JLabel JL_ip;
    private javax.swing.JPanel JP_crear;
    private javax.swing.JPanel JP_eliminar;
    private javax.swing.JPanel JP_listar;
    private javax.swing.JTextField JTF_ip;
    private javax.swing.JTabbedPane JTP_crud;
    private javax.swing.JPanel bg_principal;
    private javax.swing.JButton btn_Laptop;
    private javax.swing.JButton btn_crud;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}