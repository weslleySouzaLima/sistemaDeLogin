
package com.mapaprog2.view;

import com.mapaprog2.core.dao.conexao.conexaoJDBC;
import com.mapaprog2.core.dao.UsuarioDAO;
import com.mapaprog2.core.entity.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author weslley
 */
public class telaCadastro extends javax.swing.JFrame {

    
    
    private  conexaoJDBC usuarioDAO;

    /**
     * Creates new form telaCadastro
     */
    public telaCadastro() {
        initComponents();
        usuarioDAO = new conexaoJDBC();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoCadLogin = new javax.swing.JTextField();
        campoCadEmail = new javax.swing.JTextField();
        campoCadNome = new javax.swing.JTextField();
        campoCadSenha = new javax.swing.JPasswordField();
        botaoSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(173, 234, 234));
        jPanel1.setFocusTraversalPolicyProvider(true);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Cadastrar novo Usuário");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Email:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Senha:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Login:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Nome:");

        campoCadLogin.setBackground(new java.awt.Color(190, 190, 190));
        campoCadLogin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        campoCadLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCadLoginActionPerformed(evt);
            }
        });

        campoCadEmail.setBackground(new java.awt.Color(190, 190, 190));
        campoCadEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        campoCadEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCadEmailActionPerformed(evt);
            }
        });

        campoCadNome.setBackground(new java.awt.Color(190, 190, 190));
        campoCadNome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        campoCadNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCadNomeActionPerformed(evt);
            }
        });

        campoCadSenha.setBackground(new java.awt.Color(190, 190, 190));
        campoCadSenha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        campoCadSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCadSenhaActionPerformed(evt);
            }
        });

        botaoSalvar.setBackground(new java.awt.Color(0, 255, 0));
        botaoSalvar.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoSalvar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCadLogin)
                            .addComponent(campoCadSenha)
                            .addComponent(campoCadEmail)
                            .addComponent(campoCadNome))))
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoCadNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCadLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCadEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCadSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSalvar)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCadLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCadLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCadLoginActionPerformed

    private void campoCadEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCadEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCadEmailActionPerformed

    private void campoCadNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCadNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCadNomeActionPerformed

    private void campoCadSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCadSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCadSenhaActionPerformed

    
    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        String nome, login, senha, email;
        
        nome = campoCadNome.getText();
        login = campoCadLogin.getText();
        senha = campoCadSenha.getText();
        email = campoCadEmail.getText();
        
        Usuario usuario = new Usuario();
        usuario.setCampoCadNome(nome);
        usuario.setCampoCadLogin(login);
        usuario.setCampoCadSenha(senha);
        usuario.setCampoCadEmail(email);
        
        UsuarioDAO objusuariodao = new UsuarioDAO();
        objusuariodao.cadastrar(usuario);
        
        limparTela();
            JOptionPane.showMessageDialog(rootPane, "Usuário cadastrado com sucesso", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            fecharTela();
    }//GEN-LAST:event_botaoSalvarActionPerformed
  
     private void fecharTela() {
        dispose(); // Isso fecha apenas a janela atual
    }

   private void limparTela(){
        campoCadNome.setText("");
        campoCadLogin.setText("");
        campoCadSenha.setText("");
        campoCadEmail.setText("");
        
    }
   
   
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoCadEmail;
    private javax.swing.JTextField campoCadLogin;
    private javax.swing.JTextField campoCadNome;
    private javax.swing.JPasswordField campoCadSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
