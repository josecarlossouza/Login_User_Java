/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.loginusuarios.telas;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ze
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    private TelaListUser listar;
    private TelaAdd add;
    private TelaAlt alt;
    private TelaDel del;
     
    public TelaInicial() {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenArq = new javax.swing.JMenu();
        MenList = new javax.swing.JMenuItem();
        MenAdd = new javax.swing.JMenuItem();
        MenAlt = new javax.swing.JMenuItem();
        MenDel = new javax.swing.JMenuItem();
        MenExit = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        MenArq.setText("Arquivo");

        MenList.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, 0));
        MenList.setText("Listar Usuários");
        MenList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenListActionPerformed(evt);
            }
        });
        MenArq.add(MenList);

        MenAdd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, 0));
        MenAdd.setText("Incluir Usuários");
        MenAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenAddActionPerformed(evt);
            }
        });
        MenArq.add(MenAdd);

        MenAlt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        MenAlt.setText("Alterar Usuários");
        MenAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenAltActionPerformed(evt);
            }
        });
        MenArq.add(MenAlt);

        MenDel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, 0));
        MenDel.setText("Remover Usuários");
        MenDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenDelActionPerformed(evt);
            }
        });
        MenArq.add(MenDel);

        MenExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, 0));
        MenExit.setText("Sair");
        MenExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenExitActionPerformed(evt);
            }
        });
        MenArq.add(MenExit);

        jMenuBar1.add(MenArq);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenAltActionPerformed
        // TODO add your handling code here:
        if (alt == null) {
            alt = new TelaAlt();
            alt.setVisible(true);
            try {
                alt.setMaximum(true);
            } catch (PropertyVetoException e) {
            // Vetoed by internalFrame
            // ... possibly add some handling for this case
            }
            Desktop.add(alt);
            alt.show();
            try {
                alt.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (!alt.isVisible()) {
            alt.setVisible(true);
            Desktop.add(alt);
            try {
                //Desktop.setSelectedFrame(listar);
                alt.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_MenAltActionPerformed

    private void MenDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenDelActionPerformed
        // TODO add your handling code here:
        if (del == null) {
            del = new TelaDel();
            del.setVisible(true);
            Desktop.add(del);
            del.show();
            try {
                del.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (!del.isVisible()) {
            del.setVisible(true);
            Desktop.add(del);
            try {
                //Desktop.setSelectedFrame(listar);
                del.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_MenDelActionPerformed

    private void MenExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenExitActionPerformed
        // TODO add your handling code here:
         int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
        }
    }//GEN-LAST:event_MenExitActionPerformed

    private void MenListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenListActionPerformed
        // TODO add your handling code here:
        if (listar == null) {
            listar = new TelaListUser();
            listar.setVisible(true);
            Desktop.add(listar);
            listar.show();
            try {
                listar.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (!listar.isVisible()) {
            listar.setVisible(true);
            Desktop.add(listar);
            try {
                //Desktop.setSelectedFrame(listar);
                listar.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_MenListActionPerformed

    private void MenAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenAddActionPerformed
        // TODO add your handling code here:
            if (add == null) {
            add = new TelaAdd();
            add.setVisible(true);
            Desktop.add(add);
            add.show();
            try {
                add.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (!add.isVisible()) {
            add.setVisible(true);
            Desktop.add(add);
            try {
                //Desktop.setSelectedFrame(listar);
                add.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(TelaInicial.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_MenAddActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem MenAdd;
    private javax.swing.JMenuItem MenAlt;
    private javax.swing.JMenu MenArq;
    private javax.swing.JMenuItem MenDel;
    private javax.swing.JMenuItem MenExit;
    private javax.swing.JMenuItem MenList;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
