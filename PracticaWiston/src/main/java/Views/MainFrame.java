/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import POJO.Activos;
import POJO.Tiposjijo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class MainFrame extends javax.swing.JFrame {
  DefaultTableModel  tablica1 = new  DefaultTableModel();
  List Activos = new ArrayList();
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabluca = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtValorActivo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbTipoActivo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtValorSalvamento = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabluca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1", "2", "3", " 4", "5", " 6", " 7", " 8"
            }
        ));
        jScrollPane1.setViewportView(tabluca);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setText("Nombre");
        jPanel2.add(jLabel1, new java.awt.GridBagConstraints());

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 80;
        jPanel2.add(txtNombre, gridBagConstraints);

        jLabel2.setText("Valor Activo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        jPanel2.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 80;
        jPanel2.add(txtValorActivo, gridBagConstraints);

        jLabel3.setText("Tipo Activo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel2.add(jLabel3, gridBagConstraints);

        cmbTipoActivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Edificios", "Vehiculo", "Maquinaria", "Mobiliria", "Equipo oficina " }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 60;
        jPanel2.add(cmbTipoActivo, gridBagConstraints);

        jLabel4.setText("Valor Salvamento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        jPanel2.add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 80;
        jPanel2.add(txtValorSalvamento, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnCalcular.setText("Calcular ");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel3.add(btnCalcular);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void Create(){
        Activos act = new Activos();
          String nombre  ;
          String tipoActivo;
          String ValorActivo , ValorSalvamento;
          nombre = txtNombre.getText();
          ValorActivo = txtValorActivo.getText();
          tipoActivo = cmbTipoActivo.getSelectedItem().toString();
          ValorSalvamento = txtValorSalvamento.getText();
          
          act.setNombre(nombre);
          act.setValorActivo(ValorActivo);
          act.setTipoActivo(tipoActivo);
          act.setValorSalvamento(ValorSalvamento);
          Activos.add(act);
          System.out.println("Se añadio a la lista papi");
    }
    public void MostrarDatos(JTable tabla ,List<Activos> activos ){
        DefaultTableModel tablica1 = new DefaultTableModel();
        tablica1 = (DefaultTableModel) tabla.getModel();
        while (tabla.getRowCount()<Activos.size()){
            tablica1.addRow(new Object[]{});
        }
         for(int i = 0;i<Activos.size();i++){
            int total = 0;
            tabla.setValueAt(activos.get(i).getNombre(), i, 1);
            for(int j = 0; j<activos.get(i).getTipoActivo().geta;j++){
                tabla.setValueAt(activos.get(i).getDepreciacion()[j], i, j+1);
                total += activos.get(i).getDepreciacion()[j];
            }
        
    }
    }
    public int getAños(){
        int años = 0;
        String nombre;
        nombre = cmbTipoActivo.getSelectedItem().toString();
      if(nombre == "Edificios"){
          años = 20;
      }
      if(nombre == "vehiculo"){
          años = 5;
      }
      if(nombre == "Maquinaria"){
          años = 8;
      }
      if(nombre == "Mobiliario"){
          años = 2;
      }
      if(nombre == "Equipo oficina"){
          años = 1;
      }
        return años;
    }
    
    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        Create();

    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JComboBox<String> cmbTipoActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabluca;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtValorActivo;
    private javax.swing.JTextField txtValorSalvamento;
    // End of variables declaration//GEN-END:variables
}