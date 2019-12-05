/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import hibernate.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import pojos.Cliente;
import pojos.Coche;


/**
 *
 * @author carlos
 */
public class boxCoches extends javax.swing.JPanel {

    /**
     * Creates new form boxClientes
     */
    
    private Coches panelPadre;
    
    public boxCoches(String matricula, String modelo) {
        initComponents();
        lblMatricula.setText(matricula);
        lblDni.setText(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoEliminar = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblDigNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblDigTelf = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnDigAceptar = new javax.swing.JButton();
        btnDigCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lblDigEdad = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblDigPuntos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblDigDni = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblDigEmail = new javax.swing.JLabel();
        boxCliente = new javax.swing.JPanel();
        lblNomCli = new javax.swing.JLabel();
        lblDniCli = new javax.swing.JLabel();
        lblImg = new javax.swing.JLabel();
        btnSeleccionar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        btnModCli = new javax.swing.JButton();
        lblDni = new javax.swing.JLabel();
        lblDni1 = new javax.swing.JLabel();
        lblDniCli1 = new javax.swing.JLabel();

        dialogoEliminar.setTitle("ALERTA");
        dialogoEliminar.setMinimumSize(new java.awt.Dimension(416, 289));
        dialogoEliminar.setModal(true);
        dialogoEliminar.setResizable(false);
        dialogoEliminar.setSize(new java.awt.Dimension(416, 289));

        jLabel1.setText("DESEA ELIMINAR AL CLIENTE?");

        jLabel2.setText("Nombre");

        lblDigNombre.setText("jLabel3");

        jLabel4.setText("Telefono");

        lblDigTelf.setText("jLabel3");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/exclamation-mark.png"))); // NOI18N

        btnDigAceptar.setText("Aceptar");
        btnDigAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDigAceptarActionPerformed(evt);
            }
        });

        btnDigCancelar.setText("Cancelar");
        btnDigCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDigCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Edad");

        lblDigEdad.setText("jLabel3");

        jLabel15.setText("Puntos");

        lblDigPuntos.setText("jLabel3");

        jLabel3.setText("Dni/Cif");

        lblDigDni.setText("jLabel3");

        jLabel16.setText("Email");

        lblDigEmail.setText("jLabel3");

        javax.swing.GroupLayout dialogoEliminarLayout = new javax.swing.GroupLayout(dialogoEliminar.getContentPane());
        dialogoEliminar.getContentPane().setLayout(dialogoEliminarLayout);
        dialogoEliminarLayout.setHorizontalGroup(
            dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(dialogoEliminarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDigTelf, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDigNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDigEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDigPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDigDni, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDigEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoEliminarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoEliminarLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoEliminarLayout.createSequentialGroup()
                        .addComponent(btnDigAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDigCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        dialogoEliminarLayout.setVerticalGroup(
            dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoEliminarLayout.createSequentialGroup()
                .addGroup(dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoEliminarLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogoEliminarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoEliminarLayout.createSequentialGroup()
                        .addGroup(dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDigNombre))
                        .addGap(0, 0, 0)
                        .addGroup(dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDigTelf))
                        .addGap(0, 0, 0)
                        .addGroup(dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDigEdad)))
                    .addGroup(dialogoEliminarLayout.createSequentialGroup()
                        .addGroup(dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDigDni))
                        .addGap(0, 0, 0)
                        .addGroup(dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDigEmail))
                        .addGap(0, 0, 0)
                        .addGroup(dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDigPuntos))))
                .addGap(18, 18, 18)
                .addGroup(dialogoEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDigAceptar)
                    .addComponent(btnDigCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBorder(new javax.swing.border.MatteBorder(null));

        boxCliente.setBorder(new javax.swing.border.MatteBorder(null));

        lblNomCli.setText("Matricula");

        lblDniCli.setText("Marca");

        lblImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/sedan-car-front.png"))); // NOI18N

        btnSeleccionar.setText("Datos");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblNombre.setText("lblNombre");

        btnModCli.setText("Modificar");
        btnModCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModCliActionPerformed(evt);
            }
        });

        lblDni.setText("lblMarca");

        lblDni1.setText("lblModelo");

        lblDniCli1.setText("Modelo");

        javax.swing.GroupLayout boxClienteLayout = new javax.swing.GroupLayout(boxCliente);
        boxCliente.setLayout(boxClienteLayout);
        boxClienteLayout.setHorizontalGroup(
            boxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(boxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(boxClienteLayout.createSequentialGroup()
                        .addComponent(btnSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModCli, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, boxClienteLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(boxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(boxClienteLayout.createSequentialGroup()
                                .addComponent(lblNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))
                            .addGroup(boxClienteLayout.createSequentialGroup()
                                .addGroup(boxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(boxClienteLayout.createSequentialGroup()
                                        .addComponent(lblDniCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(boxClienteLayout.createSequentialGroup()
                                        .addComponent(lblDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblDni, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34))))))
            .addGroup(boxClienteLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(lblImg)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        boxClienteLayout.setVerticalGroup(
            boxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxClienteLayout.createSequentialGroup()
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(boxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomCli, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDniCli, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(boxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDniCli1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(boxClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModCli, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boxCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boxCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDigAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDigAceptarActionPerformed
        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        Cliente cliente = (Cliente) sesion.createCriteria(Cliente.class).add(Restrictions.eq("nombre", lblMatricula.getText())).uniqueResult();
        sesion.delete(cliente);
        sesion.getTransaction().commit();
        sesion.close();
        panelPadre.listarClientes();
        dialogoEliminar.setVisible(false);
    }//GEN-LAST:event_btnDigAceptarActionPerformed

    private void btnDigCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDigCancelarActionPerformed
        dialogoEliminar.setVisible(false);
    }//GEN-LAST:event_btnDigCancelarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        Cliente cliente = (Cliente) sesion.createCriteria(Cliente.class).add(Restrictions.eq("nombre", lblNombre.getText())).uniqueResult();
        panelPadre.setClienteEnSeleccion(cliente);
        panelPadre.mostrarDatosClienteSeleccionado();
        sesion.getTransaction().commit();
        sesion.close();
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        if(clienteEliminar instanceof Particular){
            clienteEliminar = (Particular) sesion.createCriteria(Cliente.class).add(Restrictions.eq("dni", this.lblDni.getText())).uniqueResult();
            Particular particular = (Particular)clienteEliminar;
            this.lblDigNombre.setText(particular.getNombre());
            this.lblDigDni.setText(particular.getDni());
            this.lblDigEmail.setText(clienteEliminar.getEmail());
            this.lblDigEdad.setText(String.valueOf(particular.getEdad()));
            this.lblDigPuntos.setText(String.valueOf(particular.getPuntos()));
            this.lblDigTelf.setText(clienteEliminar.getTelefono());
            sesion.close();
            dialogoEliminar.setVisible(true);
        }else{
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModCliActionPerformed

    }//GEN-LAST:event_btnModCliActionPerformed

    public Coches getPanelPadre() {
        return panelPadre;
    }

    public void setPanelPadre(Coches panelPadre) {
        this.panelPadre = panelPadre;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel boxCliente;
    private javax.swing.JButton btnDigAceptar;
    private javax.swing.JButton btnDigCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModCli;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JDialog dialogoEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDigDni;
    private javax.swing.JLabel lblDigEdad;
    private javax.swing.JLabel lblDigEmail;
    private javax.swing.JLabel lblDigNombre;
    private javax.swing.JLabel lblDigPuntos;
    private javax.swing.JLabel lblDigTelf;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblDni1;
    private javax.swing.JLabel lblDniCli;
    private javax.swing.JLabel lblDniCli1;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblNomCli;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
