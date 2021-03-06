/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.VeiculoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Veiculo;

/**
 *
 * @author Senai
 */
public class TelaVeiculo extends javax.swing.JInternalFrame {

    VeiculoController veiculoController;
    ArrayList<Veiculo> listaVeiculo;
    Veiculo veiculo;

    /**
     * Creates new form TelaVeiculos
     */
    public TelaVeiculo() {
        initComponents();
        setModelo();
        limpaCampos();
        
        veiculoController = new VeiculoController();
        listaVeiculo();
        this.setSize(530,530);
        this.setLocation(80,320);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCadastrosVeiculo = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTipoVeiculo = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtTipoCombustivel = new javax.swing.JTextField();
        txtCarga = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Cadastro de Veículo");
        getContentPane().setLayout(null);

        btnCadastrar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(320, 280, 100, 30);

        btnLimpar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(210, 280, 80, 30);

        tblCadastrosVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCadastrosVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCadastrosVeiculoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblCadastrosVeiculo);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(12, 349, 490, 95);

        btnExcluir.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(420, 460, 80, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        jLabel6.setText("Cadastro do Veículo");
        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(100, 20, 243, 37);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Tipo Veículo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 100, 85, 30);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Placa:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 140, 60, 30);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Tipo do Combustível:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 180, 138, 30);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Carga:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 220, 50, 30);

        txtTipoVeiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoVeiculoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTipoVeiculo);
        txtTipoVeiculo.setBounds(200, 100, 240, 30);

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        txtPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaKeyTyped(evt);
            }
        });
        getContentPane().add(txtPlaca);
        txtPlaca.setBounds(200, 140, 240, 30);

        txtTipoCombustivel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoCombustivelKeyTyped(evt);
            }
        });
        getContentPane().add(txtTipoCombustivel);
        txtTipoCombustivel.setBounds(200, 180, 240, 30);

        txtCarga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCargaKeyTyped(evt);
            }
        });
        getContentPane().add(txtCarga);
        txtCarga.setBounds(200, 220, 240, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        addVeiculo();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpaCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tblCadastrosVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCadastrosVeiculoMouseClicked
        carregaVeiculo();
    }//GEN-LAST:event_tblCadastrosVeiculoMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        deleteVeiculo();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtTipoVeiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoVeiculoKeyTyped
        if (evt.getKeyChar() == 10) {
            txtPlaca.grabFocus();
        }
    }//GEN-LAST:event_txtTipoVeiculoKeyTyped

    private void txtPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaKeyTyped
        if (evt.getKeyChar() == 10) {
            txtTipoCombustivel.grabFocus();
        }
    }//GEN-LAST:event_txtPlacaKeyTyped

    private void txtTipoCombustivelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoCombustivelKeyTyped
        if (evt.getKeyChar() == 10) {
            txtCarga.grabFocus();
        }
    }//GEN-LAST:event_txtTipoCombustivelKeyTyped

    private void txtCargaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCargaKeyTyped
        if (evt.getKeyChar() == 10) {
            btnCadastrar.grabFocus();
        }
    }//GEN-LAST:event_txtCargaKeyTyped

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlacaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCadastrosVeiculo;
    private javax.swing.JTextField txtCarga;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTipoCombustivel;
    private javax.swing.JTextField txtTipoVeiculo;
    // End of variables declaration//GEN-END:variables

    DefaultTableModel modelo;

    private void setModelo() {

        modelo = new DefaultTableModel();
        modelo.addColumn("idveiculo");
        modelo.addColumn("tipoveiculo");
        modelo.addColumn("placa");
        modelo.addColumn("tipocombustivel");
        modelo.addColumn("carga");
        tblCadastrosVeiculo.setModel(modelo);

    }

    private void addVeiculo() {

        /*if (txtIdVeiculo.getText().equals("")) {
         JOptionPane.showMessageDialog(null, "Campo idveiculo Invalido");
         txtIdVeiculo.grabFocus();
         return;
         } else */ if (txtTipoVeiculo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo tipoveiculo Invalido");
            txtTipoVeiculo.grabFocus();
            return;
        } else if (txtPlaca.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo placa Invalido");
            txtPlaca.grabFocus();
            return;
        } else if (txtTipoCombustivel.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo tipocombustivel Invalido");
            txtTipoCombustivel.grabFocus();
            return;
        } else if (txtCarga.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo carga Invalido");
            txtCarga.grabFocus();
            return;
        }
        if (veiculo == null) {
            veiculo = new Veiculo();
        }

        //veiculo.setIdVeiculo(Integer.parseInt(txtIdVeiculo.getText()));
        veiculo.setTipoVeiculo(txtTipoVeiculo.getText());
        veiculo.setPlaca(txtPlaca.getText());
        veiculo.setTipoCombustivel(txtTipoCombustivel.getText());
        veiculo.setCarga(txtCarga.getText());
        if (veiculoController.insereUsuario(veiculo)) {
            insereTabela(veiculo);
            limpaCampos();
            listaVeiculo();
        }
    }

    public void insereTabela(Veiculo veiculo) {
        Object[] linha = new Object[10];
        linha[0] = veiculo.getIdVeiculo();
        linha[1] = veiculo.getTipoVeiculo();
        linha[2] = veiculo.getPlaca();
        linha[3] = veiculo.getTipoCombustivel();
        linha[4] = veiculo.getCarga();
        modelo.addRow(linha);
    }

    public void listaVeiculo() {
        setModelo();
        ArrayList<Veiculo> lista;
        lista = veiculoController.getVeiculo();
        for (int x = 0; x < lista.size(); x++) {
            Veiculo ve = lista.get(x);
            insereTabela(ve);
        }
        listaVeiculo = lista;
    }

    private void limpaCampos() {
        veiculo = null;

        
        txtTipoVeiculo.setText("");
        txtPlaca.setText("");
        txtTipoCombustivel.setText("");
        txtCarga.setText("");
    }

    private int pegaIdSelecionado() {
        int linha = tblCadastrosVeiculo.getSelectedRow();
        return Integer.parseInt(modelo.getValueAt(linha, 0).toString());
    }

    private void deleteVeiculo() {
        int numero = pegaIdSelecionado();
        String id = null;
        JOptionPane.showMessageDialog(null, "Deletando veiculo de nome: " + id);
        veiculoController.deleteVeiculo(numero);
        listaVeiculo();
    }

    private void carregaVeiculo() {
        int id = pegaIdSelecionado();
        for (int x = 0; x < listaVeiculo.size(); x++) {
            Veiculo ve = listaVeiculo.get(x);
            if (id == ve.getIdVeiculo()) {

                
                txtTipoVeiculo.setText(ve.getTipoVeiculo());
                txtPlaca.setText(ve.getPlaca() + "");
                txtTipoCombustivel.setText(ve.getTipoCombustivel() + "");
                txtCarga.setText(ve.getCarga());
                veiculo = ve;
                break;
            }
        }
    }

}
