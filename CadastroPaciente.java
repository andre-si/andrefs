/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package andrefs;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author André Felipe
 */
public class CadastroPaciente extends javax.swing.JFrame {

    PacienteDAO pacienteDAO = new PacienteDAO();
    /**
     * Creates new form CadastroPaciente
     */
    public CadastroPaciente() {
        initComponents();
        btnExcluir.setEnabled(false);//Desabilita o botão excluir
        this.preencherTabela(); // Preenche a tabela de Paciente
    }
    public void preencherTabela()
    {
        ArrayList pacientes; //ArrayList de medicos
        DefaultTableModel tabela = (DefaultTableModel)tabelaPacientes.getModel(); // Converte a tabela para o modelo padrão
        tabela.setRowCount(0); // Exclui todas as linha da tabela
        pacientes = pacienteDAO.listarPaciente(); //Preenche o arrayList com os dados do banco
        Iterator it = pacientes.iterator(); // Objeto para percorrer o arrayList
        while(it.hasNext())//Enquanto Encontrar Registros
        {
            Paciente paciente = (Paciente)it.next();
            tabela.addRow(new Object[]{paciente.getIdpaciente(),paciente.getNome(),paciente.getCPF(),paciente.getIdade()});
            //A Linha de cima preenche a tabela, adicionando uma linah na mesma com os dados de cada paciente encontrado.
        }
    }

    public void limparCampos()
    {
        idpaciente.setText("");
        txtNomePaciente.setText("");
        txtCPF.setText("");
        txtIdade.setText("");
        btnExcluir.setEnabled(false);//Desabilita o botão exlcuir
    }
    
    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) 
    {                                       
        // TODO add your handling code here:
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNomePaciente = new javax.swing.JTextField();
        idpaciente = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPacientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("CPF");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Id Paciente");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Idade");

        btnNovo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        tabelaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idpaciente", "Nome", "CPF", "Idade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPacientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvar)
                            .addComponent(btnExcluir)
                            .addComponent(btnNovo))
                        .addGap(88, 88, 88))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnExcluir, btnNovo, btnSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(idpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPacientesMouseClicked
        // TODO add your handling code here:
        btnExcluir.setEnabled(true);//Habilita o botão excluir
        idpaciente.setText(tabelaPacientes.getValueAt(tabelaPacientes.getSelectedRow(), 0).toString());
        txtNomePaciente.setText(tabelaPacientes.getValueAt(tabelaPacientes.getSelectedRow(),1).toString());
        txtCPF.setText(tabelaPacientes.getValueAt(tabelaPacientes.getSelectedRow(),2).toString());
        txtIdade.setText(tabelaPacientes.getValueAt(tabelaPacientes.getSelectedRow(),3).toString());
    }//GEN-LAST:event_tabelaPacientesMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        this.limparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed
    
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int resposta = JOptionPane.showConfirmDialog(rootPane,"DESEJA EXCLUIR O REGISTRO?");
        if (resposta ==0)
        {
        String Idpaciente = idpaciente.getText();
        String msg = pacienteDAO.excluirPaciente(Idpaciente);
        if (msg.equals("1"))
        {
            msg = "EXCLUSÃO COM SUSCESSO!";
        }
        JOptionPane.showMessageDialog(rootPane, msg);
        this.limparCampos();
        this.preencherTabela();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        //Teste Para verificar se os campos estão preenchidos
        if(txtNomePaciente.getText().trim().isEmpty() || txtCPF.getText().trim().isEmpty()
                || txtIdade.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(rootPane,"PREENCHA TODOS OS CAMPOS!");
        }
        else
        {
            Paciente paciente = new Paciente();
            if(!idpaciente.getText().isEmpty()) //Verifica se há valor em idMedico
            {
                paciente.setIdpaciente(Integer.parseInt(idpaciente.getText()));
            }
            paciente.setNome(txtNomePaciente.getText().trim());
            paciente.setCPF(txtCPF.getText().trim());
            paciente.setIdade(Integer.parseInt(txtIdade.getText().trim()));
        }
        String msg;
        Paciente paciente = null;
        if(paciente.getIdpaciente() == 0)
        {
            msg = pacienteDAO.cadastrarPaciente(paciente);
            if (msg.equals("1"))
            {
                msg = "CADASTRO EFETUADO COM SUCESSO!";
            }
            JOptionPane.showMessageDialog(rootPane, msg);
        }
        else
        {
            msg = pacienteDAO.atualizarPaciente(paciente);
            if (msg.equals("1"))
            {
                msg = ("ALTERAÇÃO EFETUADA COM SUCESSO");
            }
            JOptionPane.showMessageDialog(rootPane, msg);
        }
        this.limparCampos();
        this.preencherTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextField idpaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPacientes;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNomePaciente;
    // End of variables declaration//GEN-END:variables
}
