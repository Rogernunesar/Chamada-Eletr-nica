 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Util.ValidarException;
import javax.swing.JOptionPane;
import model_Control.AlunoControl;
import model_Control.MatriculaControl;

/**
 *
 * @author rogerio
 */
public class Chamada extends javax.swing.JInternalFrame {

    private final MatriculaControl matriculaControl;
    private final AlunoControl alunoControl;

    /**
     * Creates new form matriculaView
     */
    public Chamada() {
        matriculaControl = new MatriculaControl();
        alunoControl = new AlunoControl();
        initComponents();
    }
    public AlunoControl getAlunoControl(){
               return alunoControl;
    }
    public MatriculaControl getMatriculaControl() {
        return matriculaControl;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        ChamadaEscolarPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ChamadaEscolarPU").createEntityManager();
        alunoQuery = java.beans.Beans.isDesignTime() ? null : ChamadaEscolarPUEntityManager.createQuery("SELECT a FROM Aluno a");
        alunoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : alunoQuery.getResultList();
        alunoQuery1 = java.beans.Beans.isDesignTime() ? null : ChamadaEscolarPUEntityManager.createQuery("SELECT a FROM Aluno a");
        alunoList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : alunoQuery1.getResultList();
        jtfDataMat = new javax.swing.JPanel();
        jlbTurma = new javax.swing.JLabel();
        jtfData = new javax.swing.JTextField();
        jlbData = new javax.swing.JLabel();
        jComboTurma = new javax.swing.JComboBox<>();
        jjbRelatorio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jpnbotoes = new javax.swing.JPanel();
        jbVoltar = new javax.swing.JButton();
        jbConfirma = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAvançar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextNumAluno = new javax.swing.JTextField();
        jLabelAlunoSelec = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jCheckPresenc1 = new javax.swing.JCheckBox();
        jCheckPresenc2 = new javax.swing.JCheckBox();
        jCheckPresenc3 = new javax.swing.JCheckBox();
        jCheckPresenc4 = new javax.swing.JCheckBox();
        jCheckPresenc5 = new javax.swing.JCheckBox();
        jCheckPresenc6 = new javax.swing.JCheckBox();
        jLNPresenca = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setTitle("Matrícula");

        jtfDataMat.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbTurma.setText("Selecionar Turmas");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${matriculaControl.matriculaDigitado.dataMatricula}"), jtfData, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jlbData.setText("Data ");

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${matriculaControl.turmaTabela}");
        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jComboTurma);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${matriculaControl.matriculaDigitado.turma}"), jComboTurma, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jjbRelatorio.setText("Gerar Relátorio");

        javax.swing.GroupLayout jtfDataMatLayout = new javax.swing.GroupLayout(jtfDataMat);
        jtfDataMat.setLayout(jtfDataMatLayout);
        jtfDataMatLayout.setHorizontalGroup(
            jtfDataMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtfDataMatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTurma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jlbData)
                .addGap(2, 2, 2)
                .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jjbRelatorio)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jtfDataMatLayout.setVerticalGroup(
            jtfDataMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jtfDataMatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jtfDataMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbTurma)
                    .addComponent(jComboTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jjbRelatorio)
                    .addComponent(jlbData))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        eLProperty = org.jdesktop.beansbinding.ELProperty.create("${matriculaControl.matriculaTabela}");
        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, eLProperty, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cod_Matricula}"));
        columnBinding.setColumnName("Cod_ Matricula");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${num_chamada}"));
        columnBinding.setColumnName("Num_chamada");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${aluno.nome}"));
        columnBinding.setColumnName("Aluno");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${turma.nomeTurma}"));
        columnBinding.setColumnName("Serie");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataMatricula}"));
        columnBinding.setColumnName("Data Matricula");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${matriculaControl.matriculaSelecionado}"), jTable1, org.jdesktop.beansbinding.BeanProperty.create("selectedElement"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTable1);

        jpnbotoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jbVoltar.setText("Volar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jbConfirma.setText("Confimar");
        jbConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmaActionPerformed(evt);
            }
        });

        jbExcluir.setText("Cancelar");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbAvançar.setText("Avançar");
        jbAvançar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAvançarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nº");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${matriculaControl.matriculaDigitado.num_chamada}"), jTextNumAluno, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabelAlunoSelec.setText("Aluno Selecionado ");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${matriculaControl.matriculaDigitado.aluno.nome}"), jTextField3, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jCheckPresenc1.setIconTextGap(8);

        jLNPresenca.setText("Nº Presença");

        javax.swing.GroupLayout jpnbotoesLayout = new javax.swing.GroupLayout(jpnbotoes);
        jpnbotoes.setLayout(jpnbotoesLayout);
        jpnbotoesLayout.setHorizontalGroup(
            jpnbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnbotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextNumAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jpnbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnbotoesLayout.createSequentialGroup()
                        .addGroup(jpnbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAlunoSelec)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnbotoesLayout.createSequentialGroup()
                                .addComponent(jCheckPresenc1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckPresenc2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckPresenc3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckPresenc4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckPresenc5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckPresenc6))
                            .addComponent(jLNPresenca)))
                    .addGroup(jpnbotoesLayout.createSequentialGroup()
                        .addComponent(jbVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbAvançar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnbotoesLayout.setVerticalGroup(
            jpnbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnbotoesLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jpnbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelAlunoSelec)
                    .addComponent(jLNPresenca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextNumAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCheckPresenc1)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckPresenc3)
                    .addComponent(jCheckPresenc4)
                    .addComponent(jCheckPresenc5)
                    .addComponent(jCheckPresenc6)
                    .addComponent(jCheckPresenc2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnbotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbConfirma)
                    .addComponent(jbVoltar)
                    .addComponent(jbAvançar)
                    .addComponent(jbExcluir))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfDataMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jpnbotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfDataMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnbotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        matriculaControl.novo();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmaActionPerformed
                 
        try{
        matriculaControl.salvar();
        JOptionPane.showMessageDialog(this, 
                  "matricula salva com sucesso",
                   "Salvar matricula", 
                   JOptionPane.INFORMATION_MESSAGE);
        }catch (ValidarException e){
            JOptionPane.showMessageDialog(this, 
                    e.getMessage(),
                   "Falha de Validaçã", 
                   JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbConfirmaActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        if(JOptionPane.showConfirmDialog(this, "Deseja excluir o cleinte?",
                                         "Excliur matricula",
                                         JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION ){
                               matriculaControl.excluir();
                               JOptionPane.showMessageDialog(this, 
                                     "matricula excluido com sucesso",
                                      "Excluir matricula", JOptionPane.INFORMATION_MESSAGE);
        }   
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAvançarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAvançarActionPerformed
        matriculaControl.pesquisar();
    }//GEN-LAST:event_jbAvançarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager ChamadaEscolarPUEntityManager;
    private java.util.List<model_domain.Aluno> alunoList;
    private java.util.List<model_domain.Aluno> alunoList1;
    private javax.persistence.Query alunoQuery;
    private javax.persistence.Query alunoQuery1;
    private javax.swing.JCheckBox jCheckPresenc1;
    private javax.swing.JCheckBox jCheckPresenc2;
    private javax.swing.JCheckBox jCheckPresenc3;
    private javax.swing.JCheckBox jCheckPresenc4;
    private javax.swing.JCheckBox jCheckPresenc5;
    private javax.swing.JCheckBox jCheckPresenc6;
    private javax.swing.JComboBox<String> jComboTurma;
    private javax.swing.JLabel jLNPresenca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAlunoSelec;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextNumAluno;
    private javax.swing.JButton jbAvançar;
    private javax.swing.JButton jbConfirma;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JButton jjbRelatorio;
    private javax.swing.JLabel jlbData;
    private javax.swing.JLabel jlbTurma;
    private javax.swing.JPanel jpnbotoes;
    private javax.swing.JTextField jtfData;
    private javax.swing.JPanel jtfDataMat;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
