/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.proyecto2_201700584;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo Roca
 */
public class crearEquipos extends javax.swing.JFrame {
    ListaEquipos lista = new ListaEquipos();
    /**
     * Creates new form crearEquipos
     */
    public crearEquipos() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
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
        txtID = new javax.swing.JTextField();
        txtMundiales = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bCrearEquipo = new javax.swing.JButton();
        bRegresar = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bCargaMasivaEquipos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Equipo");

        jLabel2.setText("Nombre Equipo");

        jLabel3.setText("Mundiales ganados");

        bCrearEquipo.setText("CREAR");
        bCrearEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCrearEquipoActionPerformed(evt);
            }
        });

        bRegresar.setText("REGRESAR");
        bRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresarActionPerformed(evt);
            }
        });

        bSalir.setText("SALIR");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        bCargaMasivaEquipos.setText("CARGA MASIVA");
        bCargaMasivaEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCargaMasivaEquiposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCargaMasivaEquipos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtMundiales)
                        .addComponent(txtNombre)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCrearEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bCrearEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(bRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMundiales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCargaMasivaEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCrearEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCrearEquipoActionPerformed

        crearEquipo();

    }//GEN-LAST:event_bCrearEquipoActionPerformed

    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
        marcoPrincipalAdmin admin = new marcoPrincipalAdmin();
        setVisible(false);
    }//GEN-LAST:event_bRegresarActionPerformed

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        paniniLogin p = new paniniLogin();
        setVisible(false);
        //        System.out.println(lista.Obtener(1, "usuario"));
        //        System.out.println(lista.Obtener(0, "usuario"));
    }//GEN-LAST:event_bSalirActionPerformed

    private void bCargaMasivaEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCargaMasivaEquiposActionPerformed
        BuscadorDeArchivosEquipo buscador = new BuscadorDeArchivosEquipo();
        BuscadorDeArchivosEquipo.queCarga = "equipos";
    }//GEN-LAST:event_bCargaMasivaEquiposActionPerformed

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
            java.util.logging.Logger.getLogger(crearEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crearEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crearEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crearEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crearEquipos().setVisible(true);
            }
        });
    }
    
    public void crearEquipo(){
        
        try{
            lista.añadirEquipo(txtID.getText(), txtNombre.getText(), txtMundiales.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Intente crear equipo de nuevo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }finally{
            JOptionPane.showMessageDialog(this, "Equipo creado con exito", "Creación de equipo", JOptionPane.INFORMATION_MESSAGE);
        }
        
//        for(int n = 0; n < lista.obtenerTamaño(); n++){
//            System.out.println(lista.Obtener(n, "nombre"));
//        }
    }
    
    public void cargaMasiva(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCargaMasivaEquipos;
    private javax.swing.JButton bCrearEquipo;
    private javax.swing.JButton bRegresar;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMundiales;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}