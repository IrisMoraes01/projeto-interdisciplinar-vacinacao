/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import model.Enfermeira;
import repository.ArmazenaConsulta;
import repository.ArmazenaPaciente;


public class ConsultasEnfermeira extends javax.swing.JFrame {
    String dadosConsultaAtiva;
    Enfermeira enfermeira = new Enfermeira();
    public ConsultasEnfermeira() {
        initComponents();
        ArmazenaConsulta.getConsultas()
                .forEach(consulta -> this.cbConsultasEnfermeiraAtivas
                        .addItem(consulta.getPaciente().getNome()+"-"+consulta.getPaciente().getIdade()+"-"+consulta.getPaciente().getCartaoDoSus()));
    }
    double mls;
    int dadosIdade;
    int dadosCartaoSus;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        cbConsultasEnfermeiraAtivas = new javax.swing.JComboBox<>();
        txtMlsPaciente = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vacinação - Enfermeira");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultas Ativas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        cbConsultasEnfermeiraAtivas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< Consultas ativas >" }));
        cbConsultasEnfermeiraAtivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbConsultasEnfermeiraAtivasActionPerformed(evt);
            }
        });

        txtMlsPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMlsPacienteActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtMlsPaciente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbConsultasEnfermeiraAtivas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cbConsultasEnfermeiraAtivas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(txtMlsPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnConfirmar)
                .addGap(18, 18, 18)
                .addComponent(btnVoltar)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Vacinação - Enfermeira");
        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        ConsultasEnfermeira.this.dispose();
        new TelaPrincipalEnfermeira().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        dadosConsultaAtiva = cbConsultasEnfermeiraAtivas.getSelectedItem().toString();
        String[] separarDados = dadosConsultaAtiva.split("-");
        dadosIdade = Integer.parseInt(separarDados[1]);
        dadosCartaoSus = Integer.parseInt(separarDados[2]);
        mls = enfermeira.aplicarVacina(dadosIdade, dadosCartaoSus);
        txtMlsPaciente.setText(String.valueOf(mls));
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void cbConsultasEnfermeiraAtivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConsultasEnfermeiraAtivasActionPerformed
        // TODO add your handling code here:      
    }//GEN-LAST:event_cbConsultasEnfermeiraAtivasActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        // TODO add your handling code here:
        Enfermeira enfermeira = new Enfermeira();
        enfermeira.alterarCartaoDeAgendamento(dadosCartaoSus,String.valueOf(mls));
        JOptionPane.showMessageDialog(null, "Consulta confirmada!");
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txtMlsPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMlsPacienteActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtMlsPacienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultasEnfermeira().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbConsultasEnfermeiraAtivas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMlsPaciente;
    // End of variables declaration//GEN-END:variables

}
