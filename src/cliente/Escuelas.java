/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import DAO.CentroEstudiosDAO;
import DAO.EscuelaDAO;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Centrosdetrabajo;
import modelo.Escuela;
import remoto.interfaces;

/**
 *
 * @author freddy
 */
public class Escuelas extends javax.swing.JInternalFrame {
cliente clie;
Escuela es = new Escuela();
Centrosdetrabajo c = new Centrosdetrabajo();
    public Escuelas() 
    {
        List lista_escuelas_combo = new ArrayList();
        initComponents();
        try {
            interfaces op;
            op = (interfaces) Naming.lookup("rmi://localhost/persistencia");
            lista_escuelas_combo = op.listaEscuelas();
            String[] items;
        for(int i=0;i<lista_escuelas_combo.size();i++)
        {
            es=(Escuela)lista_escuelas_combo.get(i);
            CentroEstudiosDAO edao = new CentroEstudiosDAO();
            Centrosdetrabajo c ;
            c=edao.buscar(es.getCentrosdetrabajo().getIdcdt()); 
        
            jComboBox1.addItem(es.getCentrosdetrabajo().getIdcdt()+"-"+c.getNombre());
            //System.out.println("Nombre centro Trabajo: " +e.getCentrosdetrabajo().getNombre());
        }
  
     

        } catch (NotBoundException ex) {
            Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("ID:");

        jLabel4.setText("Nombre:");

        jLabel6.setText("Centro de Trabajo:");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jButton2.setText("Insertar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 255, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Escuelas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("ID: ");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField2.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Debe Ingresar un Nombre");
        }
        else
        {
            es.setNombre(jTextField2.getText());
            //es.setIdescuela(Integer.parseInt(jLabel5.getText()));
            String texto =(String) jComboBox1.getSelectedItem();
            System.out.println(texto);
            String[] parts = texto.split("-");
            String part =parts[0];
            System.out.println(part);
            c.setIdcdt(Integer.parseInt(part));
            es.setCentrosdetrabajo(c);
            try {
                interfaces op;
                op = (interfaces) Naming.lookup("rmi://localhost/persistencia");
                if (op.insertarEscuela(es)) {
                    this.jLabel5.setText("");
                    this.jTextField2.setText("");
                    JOptionPane.showMessageDialog(null, "Se inserto correctamente");
                    this.jLabel5.setText("");
                    this.jTextField2.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error");
                }


            } catch (NotBoundException ex) {
                Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (MalformedURLException ex) {
                Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, ex);
            } catch (RemoteException ex) {
                Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, ex);
            }
            }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
        
            if (this.jTextField2.getText().length()>0)
            {
            es.setNombre(jTextField2.getText());
            es.setIdescuela(Integer.parseInt(jLabel5.getText()));
            String texto =(String) jComboBox1.getSelectedItem();
            System.out.println(texto);
            String[] parts = texto.split("-");
            String part =parts[0];
            System.out.println(part);
            c.setIdcdt(Integer.parseInt(part));
            es.setCentrosdetrabajo(c);
                interfaces op;
                op = (interfaces) Naming.lookup("rmi://localhost/persistencia");
                if (op.actualizarEscuela(es)) {
                    JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
                    this.jLabel5.setText("");
                this.jTextField2.setText("");
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe buscar primero el centro de trabajo para poder eliminar o actualizar ");
            }
        } catch (NotBoundException ex) {
            Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if (this.jTextField2.getText().length()>0)
            {
                interfaces op;
                op = (interfaces) Naming.lookup("rmi://localhost/persistencia");
                es.setNombre(this.jTextField2.getText());
                es.setIdescuela(Integer.parseInt(jLabel5.getText()));
                if (op.eliminarEscuela(es)) {
                    JOptionPane.showMessageDialog(null, "Se Elimino correctamente");
                    this.jLabel5.setText("");
                this.jTextField2.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debe buscar primero escuela para poder eliminar o actualizar ");
            }
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(Centros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            interfaces op;
            op = (interfaces) Naming.lookup("rmi://localhost/persistencia");
    
            es=op.buscaEscuela(Integer.parseInt(jTextField1.getText()));
            if (es != null)
            {
                this.jLabel5.setText(Integer.toString(es.getIdescuela()));
                this.jTextField2.setText(es.getNombre());
                this.jTextField1.setText("");
                CentroEstudiosDAO edao = new CentroEstudiosDAO();
                Centrosdetrabajo c ;
                c=edao.buscar(es.getCentrosdetrabajo().getIdcdt()); 
                //this.jComboBox1.removeAllItems();
                //this.jComboBox1.addItem(es.getCentrosdetrabajo().getIdcdt()+"-"+c.getNombre());
                this.jComboBox1.setSelectedItem(es.getCentrosdetrabajo().getIdcdt()+"-"+c.getNombre());
                this.jTextField1.setText("");
                
                
            } else
            {
                JOptionPane.showMessageDialog(null, "No existe");
            }

        } catch (NotBoundException ex) {
            Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Escuelas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
