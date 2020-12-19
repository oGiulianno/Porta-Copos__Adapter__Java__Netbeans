/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import classes.Copo_Adaptador;
import classes.Copo_Cilindrico;
import classes.Copo_Hexagonal;
import classes.Copo_Quadrado;
import classes.Porta_Copo_Redondo;

/**
 *
 * @author Giu
 */
public class Tela_Principal extends javax.swing.JFrame {
    

    /**
     * Creates new form Tela_Principal
     */
    public Tela_Principal() {
        initComponents();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Resultado = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton_C_C = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton_C_Q = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton_C_H = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea_Resultado.setColumns(20);
        jTextArea_Resultado.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Resultado);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Porta Copo = Padrão = 10");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Copo Quadrado = Normal = 10");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Copo Hexagonal = Normal = 10");

        jButton_C_C.setText("Executar");
        jButton_C_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_C_CActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7))
                .addGap(52, 52, 52)
                .addComponent(jButton_C_C, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jButton_C_C, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Copo Quadrado = Pequeno = 5");

        jButton_C_Q.setText("Executar");
        jButton_C_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_C_QActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Copo Quadrado = Grande = 15");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jButton_C_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_C_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addGap(22, 22, 22))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Copo Hexagonal = Pequeno = 5");

        jButton_C_H.setText("Executar");
        jButton_C_H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_C_HActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Copo Hexagonal = Grande = 15");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(51, 51, 51)
                        .addComponent(jButton_C_H, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_C_H, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 59, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_C_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_C_CActionPerformed
        // TODO add your handling code here:
        
        //String entrada = "";
        String saida_dados = "\n";
        
        // PORTA COPO e COPO CILINDRICO
        Porta_Copo_Redondo porta_copo = new Porta_Copo_Redondo(10);
        Copo_Cilindrico copo_cilindrico = new Copo_Cilindrico(10);
        
        //copo cilindrico
        //entrada = jTextField_C_C.getText();
        //porta_copo.setRaio(Double.parseDouble(entrada));
        
        if (porta_copo.encaixaQ(copo_cilindrico)) {
            //String saida_dados = "\n\n\n";
                saida_dados += "Copo Quadrado: " + copo_cilindrico.getRaioQ() +"\n";
                saida_dados += "O tamanho escolhido cabe no Porta Copos." +"\n";
                //jTextArea_Resultado.setText(saida_dados);
        }
        
        if (porta_copo.encaixaH(copo_cilindrico)) {
            //String saida_dados = "\n\n\n";
                saida_dados += "Copo Hexagonal: " + copo_cilindrico.getRaioQ() +"\n";
                saida_dados += "O tamanho escolhido cabe no Porta Copos." +"\n";
                //jTextArea_Resultado.setText(saida_dados);
        }
        jTextArea_Resultado.setText(saida_dados);
       
        
    }//GEN-LAST:event_jButton_C_CActionPerformed

    private void jButton_C_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_C_QActionPerformed
        // TODO add your handling code here:
        
        String saida_dados = "\n";
        
        Porta_Copo_Redondo porta_copo = new Porta_Copo_Redondo(10);
        Copo_Cilindrico copo_cilindrico = new Copo_Cilindrico(10);
        
        // COPO QUADRADO
        Copo_Quadrado copo_Q = new Copo_Quadrado(ERROR);
        Copo_Quadrado copo_Q_pequeno = new Copo_Quadrado(5);
        Copo_Quadrado copo_Q_grande = new Copo_Quadrado(15); // 14 = 9,8
        
        Copo_Adaptador copo_Q_pequeno_ADP = new Copo_Adaptador(copo_Q_pequeno);
        Copo_Adaptador copo_Q_grande_ADP = new Copo_Adaptador(copo_Q_grande);
        
        //copo cilindrico
        //entrada = jTextField_C_Q.getText();
        //copo_Q.setLargura(Double.parseDouble(entrada));
        
        if (porta_copo.encaixaQ(copo_Q_pequeno_ADP)) {
            //String saida_dados = "\n\n\n";
                saida_dados += "Copo Quadrado: " + copo_Q_pequeno.getLargura() +"\n";
                saida_dados += "O tamanho escolhido cabe no Porta Copos." +"\n";
                //jTextArea_Resultado.setText(saida_dados);
        }
        if (!porta_copo.encaixaQ(copo_Q_grande_ADP)) {
            //String saida_dados = "\n\n\n";
                saida_dados += "Copo Quadrado: " + copo_Q_grande.getLargura() +"\n";
                saida_dados += "O tamanho escolhido NÂO cabe no Porta Copos." +"\n";
                //jTextArea_Resultado.setText(saida_dados);
        }
        jTextArea_Resultado.setText(saida_dados);
    }//GEN-LAST:event_jButton_C_QActionPerformed

    private void jButton_C_HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_C_HActionPerformed
        // TODO add your handling code here:
        
        String saida_dados = "\n";
        
        Porta_Copo_Redondo porta_copo = new Porta_Copo_Redondo(10);
        Copo_Cilindrico copo_cilindrico = new Copo_Cilindrico(10);
        
        // COPO HEXAGONAL
        Copo_Hexagonal copo_H = new Copo_Hexagonal(ERROR);
        Copo_Hexagonal copo_H_pequeno = new Copo_Hexagonal(5);
        Copo_Hexagonal copo_H_grande = new Copo_Hexagonal(15); // 14 = 9,8
        
        Copo_Adaptador copo_H_pequeno_ADP = new Copo_Adaptador(copo_H_pequeno);
        Copo_Adaptador copo_H_grande_ADP = new Copo_Adaptador(copo_H_grande);
        
        //entrada = jTextField_C_H.getText();
        //copo_H.setLargura(Double.parseDouble(entrada));
        
        if (porta_copo.encaixaH(copo_H_pequeno_ADP)) {
            //String saida_dados = "\n\n\n";
                saida_dados += "Copo Hexagonal: " + copo_H_pequeno.getLargura() +"\n";
                saida_dados += "O tamanho escolhido cabe no Porta Copos." +"\n";
                //jTextArea_Resultado.setText(saida_dados);
        }
        if (!porta_copo.encaixaH(copo_H_grande_ADP)) {
            //String saida_dados = "\n\n\n";
                saida_dados += "Copo Hexagonal: " + copo_H_grande.getLargura() +"\n";
                saida_dados += "O tamanho escolhido NÂO cabe no Porta Copos." +"\n";
                //jTextArea_Resultado.setText(saida_dados);
        }
        jTextArea_Resultado.setText(saida_dados);
        
    }//GEN-LAST:event_jButton_C_HActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_C_C;
    private javax.swing.JButton jButton_C_H;
    private javax.swing.JButton jButton_C_Q;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea_Resultado;
    // End of variables declaration//GEN-END:variables
}
