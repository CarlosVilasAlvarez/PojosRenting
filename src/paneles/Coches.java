package paneles;

import hibernate.NewHibernateUtil;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import metodos.Altas;
import metodos.Buscar;
import metodos.Modificar;
import metodos.Validar;
import org.hibernate.Session;
import pojos.Coche;

public class Coches extends javax.swing.JPanel implements ICochesAlquileres{
    
    private Coche cocheEnSeleccion = null;
    private JPanel panelMain;
    private JFrame aplicacion;
    
    /**
     * Creates new form Clientes
     */
    public Coches() {
        initComponents();
        listarCoches();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogoBuscar = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        lblModNombre = new javax.swing.JLabel();
        lblModApel = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnBuscarAceptar = new javax.swing.JButton();
        btnBuscarCancelar1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        lblModDni = new javax.swing.JLabel();
        lblModEmail = new javax.swing.JLabel();
        entBuscarMatricula = new javax.swing.JTextField();
        entBuscarEstado = new javax.swing.JTextField();
        entBuscarModelo = new javax.swing.JTextField();
        entBuscarAnhos = new javax.swing.JTextField();
        entBuscarMarca = new javax.swing.JTextField();
        entBuscarFecha = new javax.swing.JTextField();
        lblModTelefono = new javax.swing.JLabel();
        lblModFechaNac = new javax.swing.JLabel();
        entBuscarPrecio = new javax.swing.JTextField();
        lblModPuntos = new javax.swing.JLabel();
        panelDatosClientes = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        entMatricula = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        btnAlta = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        entEstado = new javax.swing.JTextField();
        entMarca = new javax.swing.JTextField();
        entFechaPMatricula = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        lblNombre1 = new javax.swing.JLabel();
        entModelo = new javax.swing.JTextField();
        entPrecioDia = new javax.swing.JTextField();
        lblPrecioDia = new javax.swing.JLabel();
        btnRecargar = new javax.swing.JButton();
        window = new javax.swing.JPanel();

        dialogoBuscar.setTitle("ALERTA");
        dialogoBuscar.setMinimumSize(new java.awt.Dimension(416, 299));
        dialogoBuscar.setModal(true);
        dialogoBuscar.setResizable(false);
        dialogoBuscar.setSize(new java.awt.Dimension(472, 405));

        jLabel6.setText("BUSQUEDA COCHES");

        lblModNombre.setText("Matricula");

        lblModApel.setText("Mocelo");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/searcher.png"))); // NOI18N

        btnBuscarAceptar.setText("Aceptar");
        btnBuscarAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAceptarActionPerformed(evt);
            }
        });

        btnBuscarCancelar1.setText("Cancelar");
        btnBuscarCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCancelar1ActionPerformed(evt);
            }
        });

        lblModDni.setText("Estado");

        lblModEmail.setText("Años");

        entBuscarFecha.setToolTipText("(dd/MM/yyyy)");

        lblModTelefono.setText("Marca");

        lblModFechaNac.setText("Fecha PM");

        lblModPuntos.setText("Precio Dia");

        javax.swing.GroupLayout dialogoBuscarLayout = new javax.swing.GroupLayout(dialogoBuscar.getContentPane());
        dialogoBuscar.getContentPane().setLayout(dialogoBuscarLayout);
        dialogoBuscarLayout.setHorizontalGroup(
            dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(dialogoBuscarLayout.createSequentialGroup()
                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoBuscarLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(dialogoBuscarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscarAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dialogoBuscarLayout.createSequentialGroup()
                                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblModPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entBuscarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entBuscarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(dialogoBuscarLayout.createSequentialGroup()
                                .addComponent(lblModApel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(entBuscarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogoBuscarLayout.createSequentialGroup()
                                .addComponent(lblModTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(entBuscarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogoBuscarLayout.createSequentialGroup()
                                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblModEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblModFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblModDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(entBuscarAnhos, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(entBuscarEstado, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(entBuscarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                            .addComponent(btnBuscarCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        dialogoBuscarLayout.setVerticalGroup(
            dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogoBuscarLayout.createSequentialGroup()
                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoBuscarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogoBuscarLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entBuscarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModDni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entBuscarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblModTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entBuscarMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblModEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entBuscarAnhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblModApel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entBuscarModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblModFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entBuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entBuscarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarAceptar)
                    .addComponent(btnBuscarCancelar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setMaximumSize(new java.awt.Dimension(1061, 606));
        setMinimumSize(new java.awt.Dimension(1061, 606));

        panelDatosClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));

        lblNombre.setText("Matricula");

        entMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entMatriculaKeyPressed(evt);
            }
        });

        lblDni.setText("Estado");

        lblTelefono.setText("Marca");

        lblEmail.setText("Fecha PM");

        btnAlta.setText("ALTA");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        entEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entEstadoKeyPressed(evt);
            }
        });

        entMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entMarcaKeyPressed(evt);
            }
        });

        entFechaPMatricula.setToolTipText("(dd/MM/yyyy)");
        entFechaPMatricula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entFechaPMatriculaKeyPressed(evt);
            }
        });

        lblNombre1.setText("Modelo");

        entModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entModeloKeyPressed(evt);
            }
        });

        entPrecioDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entPrecioDiaKeyPressed(evt);
            }
        });

        lblPrecioDia.setText("Precio/Dia");

        btnRecargar.setText("RECARGAR");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosClientesLayout = new javax.swing.GroupLayout(panelDatosClientes);
        panelDatosClientes.setLayout(panelDatosClientesLayout);
        panelDatosClientesLayout.setHorizontalGroup(
            panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(panelDatosClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelDatosClientesLayout.createSequentialGroup()
                        .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefono)
                            .addComponent(lblDni)
                            .addComponent(lblEmail)
                            .addComponent(lblPrecioDia))
                        .addGap(19, 19, 19)
                        .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entMatricula, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(entEstado)
                            .addComponent(entMarca)
                            .addComponent(entFechaPMatricula)
                            .addComponent(entModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(entPrecioDia)))
                    .addGroup(panelDatosClientesLayout.createSequentialGroup()
                        .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblNombre1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnRecargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDatosClientesLayout.setVerticalGroup(
            panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClientesLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(entMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre1)
                    .addComponent(entModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDni))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entFechaPMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entPrecioDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecioDia))
                .addGap(38, 38, 38)
                .addComponent(btnAlta)
                .addGap(18, 18, 18)
                .addComponent(btnRecargar)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        window.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDatosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(window, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(window, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
            
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.dialogoBuscar.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaPM = sdf.parse(entFechaPMatricula.getText());
            DateFormat formatter = new SimpleDateFormat("yyyyMMdd");
            Date fechaHoy = new Date();
            int d1 = Integer.parseInt(formatter.format(fechaPM));
            int d2 = Integer.parseInt(formatter.format(fechaHoy));
            int anhos = (d2-d1)/10000;
            if(Validar.matricula(entMatricula.getText()) == true){
                entMatricula.setForeground(Color.red);
            }else if (Validar.cadena(entModelo.getText()) == true){
                entModelo.setForeground(Color.red);
            }else if (Validar.cadena(entEstado.getText()) == true){
                entEstado.setForeground(Color.red);
            }else if (Validar.cadena(entMarca.getText()) == true){
                entMarca.setForeground(Color.red);
            }else if (Validar.precio(entPrecioDia.getText()) == true){
                entPrecioDia.setForeground(Color.red);
            }else{
                Coche coche = new Coche(entMatricula.getText(), entModelo.getText(), entMarca.getText(), entEstado.getText(), anhos, fechaPM, Float.parseFloat(entPrecioDia.getText()));
                Altas.coches(coche);
                vaciarCampos();
            }
        }catch(ParseException pe){
            System.out.println(pe);
            vaciarCampos();
        }
        listarCoches();
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnBuscarAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAceptarActionPerformed
        List<Coche> coches;
        coches = Buscar.coches(entBuscarMatricula.getText(), entBuscarModelo.getText(), entBuscarEstado.getText(), entBuscarMarca.getText(), entBuscarFecha.getText(), entBuscarAnhos.getText(), entBuscarPrecio.getText());
        listarCoches(coches);
        this.dialogoBuscar.setVisible(false);
    }//GEN-LAST:event_btnBuscarAceptarActionPerformed

    private void btnBuscarCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCancelar1ActionPerformed
        dialogoBuscar.setVisible(false);
    }//GEN-LAST:event_btnBuscarCancelar1ActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed
        listarCoches();
    }//GEN-LAST:event_btnRecargarActionPerformed

    private void entMatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entMatriculaKeyPressed
        String cadena = entMatricula.getText();
        int maxLength = (cadena.length() < 6)?cadena.length():6;
        cadena = cadena.substring(0, maxLength);
        entMatricula.setText(cadena);
    }//GEN-LAST:event_entMatriculaKeyPressed

    private void entModeloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entModeloKeyPressed
        String cadena = entModelo.getText();
        int maxLength = (cadena.length() < 29)?cadena.length():29;
        cadena = cadena.substring(0, maxLength);
        entModelo.setText(cadena);
    }//GEN-LAST:event_entModeloKeyPressed

    private void entEstadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entEstadoKeyPressed
        String cadena = entEstado.getText();
        int maxLength = (cadena.length() < 29)?cadena.length():29;
        cadena = cadena.substring(0, maxLength);
        entEstado.setText(cadena);
    }//GEN-LAST:event_entEstadoKeyPressed

    private void entMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entMarcaKeyPressed
        String cadena = entMarca.getText();
        int maxLength = (cadena.length() < 29)?cadena.length():29;
        cadena = cadena.substring(0, maxLength);
        entMarca.setText(cadena);
    }//GEN-LAST:event_entMarcaKeyPressed

    private void entFechaPMatriculaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entFechaPMatriculaKeyPressed
        String cadena = entFechaPMatricula.getText();
        int maxLength = (cadena.length() < 9)?cadena.length():9;
        cadena = cadena.substring(0, maxLength);
        entFechaPMatricula.setText(cadena);
    }//GEN-LAST:event_entFechaPMatriculaKeyPressed

    private void entPrecioDiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entPrecioDiaKeyPressed
        String cadena = entPrecioDia.getText();
        int maxLength = (cadena.length() < 9)?cadena.length():9;
        cadena = cadena.substring(0, maxLength);
        entPrecioDia.setText(cadena);
    }//GEN-LAST:event_entPrecioDiaKeyPressed

    public void mostrarDatosCocheSeleccionado(){  
        this.entMatricula.setText(cocheEnSeleccion.getMatricula());
        this.entModelo.setText(cocheEnSeleccion.getModelo());
        this.entMarca.setText(cocheEnSeleccion.getMarca());
        this.entEstado.setText(cocheEnSeleccion.getEstado());
    }
    
    @Override
    public void listarCoches(){
        if(panelMain != null){
            panelMain.removeAll();
            panelMain.revalidate();
            panelMain.repaint();
            window.remove(panelMain);
            window.revalidate();
            window.repaint();
        }
        
        panelMain = new JPanel(new BorderLayout());
        window.add(panelMain);
        GridBagLayout innerLayout = new GridBagLayout();
        GridBagConstraints innerConstraints = new GridBagConstraints();
        JPanel innerPanel = new JPanel(innerLayout);
        
        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        List<Coche> coches = sesion.createCriteria(Coche.class).list();
        int numeroCoches = coches.size();
        int numeroIteracionesX = (numeroCoches/3)+1;
        int numeroIteracionesTotales = 0;
        
        innerConstraints.weightx = 0.5;
        innerConstraints.weighty = 0.5;
        innerConstraints.gridy = 0;
        
        for(int i = 0; i < numeroIteracionesX; i++){    
            for(int j = 0; j < 3; j++){
                if(numeroIteracionesTotales != numeroCoches){
                    Coche coche = coches.get(numeroIteracionesTotales);
                    boxCoches boxCoches = new boxCoches(coche.getMatricula(), coche.getMarca(), coche.getModelo());
                    boxCoches.setPanelPadre(this);
                    boxCoches.setCocheRepresentado(coche);
                    innerConstraints.gridx = j;
                    innerConstraints.gridy = i;
                    innerPanel.add(boxCoches, innerConstraints);
                    numeroIteracionesTotales++;
                }else{
                    break;
                }
            }
        }

        JPanel innerVoidPanel = new JPanel();
        innerConstraints.weighty = 1.0;
        innerConstraints.fill = GridBagConstraints.VERTICAL;
        innerLayout.setConstraints(innerVoidPanel, innerConstraints);
        innerPanel.add(innerVoidPanel);

        //...

        JScrollPane scrollPanel = new JScrollPane(innerPanel);
        scrollPanel.getVerticalScrollBar().setUnitIncrement(16);
        panelMain.add(scrollPanel, BorderLayout.CENTER);
        sesion.getTransaction().commit();
        sesion.close();
    
    }
    
    public void listarCoches(List<Coche> coches){
        
        if(panelMain != null){
            panelMain.removeAll();
            panelMain.revalidate();
            panelMain.repaint();
            window.remove(panelMain);
            window.revalidate();
            window.repaint();
        }

        panelMain = new JPanel(new BorderLayout());
        window.add(panelMain);
        GridBagLayout innerLayout = new GridBagLayout();
        GridBagConstraints innerConstraints = new GridBagConstraints();
        JPanel innerPanel = new JPanel(innerLayout);

        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        int numeroCoches;
        if(coches != null){
            numeroCoches = coches.size();
        }else{
            numeroCoches = 0;
        }
        int numeroIteracionesX = (numeroCoches/3)+1;
        int numeroIteracionesTotales = 0;

        innerConstraints.weightx = 0.5;
        innerConstraints.weighty = 0.5;
        innerConstraints.gridy = 0;

        for(int i = 0; i < numeroIteracionesX; i++){    
            for(int j = 0; j < 3; j++){
                if(numeroIteracionesTotales != numeroCoches){
                    Coche coche = coches.get(numeroIteracionesTotales);
                    boxCoches boxCoches = new boxCoches(coche.getMatricula(), coche.getMarca(), coche.getModelo());
                    boxCoches.setPanelPadre(this);
                    boxCoches.setCocheRepresentado(coche);
                    innerConstraints.gridx = j;
                    innerConstraints.gridy = i;
                    innerPanel.add(boxCoches, innerConstraints);
                    numeroIteracionesTotales++;
                }else{
                    break;
                }
            }
        }

        JPanel innerVoidPanel = new JPanel();
        innerConstraints.weighty = 1.0;
        innerConstraints.fill = GridBagConstraints.VERTICAL;
        innerLayout.setConstraints(innerVoidPanel, innerConstraints);
        innerPanel.add(innerVoidPanel);

        //...

        JScrollPane scrollPanel = new JScrollPane(innerPanel);
        scrollPanel.getVerticalScrollBar().setUnitIncrement(16);
        panelMain.add(scrollPanel, BorderLayout.CENTER);
        sesion.getTransaction().commit();
        sesion.close();
        
    }
    
    public void vaciarCampos() {
        entEstado.setText("");
        entFechaPMatricula.setText("");
        entMarca.setText("");
        entMatricula.setText("");
        entModelo.setText("");
        entPrecioDia.setText("");
    }

    public Coche getCocheEnSeleccion() {
        return cocheEnSeleccion;
    }

    public void setCocheEnSeleccion(Coche cocheEnSeleccion) {
        this.cocheEnSeleccion = cocheEnSeleccion;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarAceptar;
    private javax.swing.JButton btnBuscarCancelar1;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JDialog dialogoBuscar;
    private javax.swing.JTextField entBuscarAnhos;
    private javax.swing.JTextField entBuscarEstado;
    private javax.swing.JTextField entBuscarFecha;
    private javax.swing.JTextField entBuscarMarca;
    private javax.swing.JTextField entBuscarMatricula;
    private javax.swing.JTextField entBuscarModelo;
    private javax.swing.JTextField entBuscarPrecio;
    private javax.swing.JTextField entEstado;
    private javax.swing.JTextField entFechaPMatricula;
    private javax.swing.JTextField entMarca;
    private javax.swing.JTextField entMatricula;
    private javax.swing.JTextField entModelo;
    private javax.swing.JTextField entPrecioDia;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblModApel;
    private javax.swing.JLabel lblModDni;
    private javax.swing.JLabel lblModEmail;
    private javax.swing.JLabel lblModFechaNac;
    private javax.swing.JLabel lblModNombre;
    private javax.swing.JLabel lblModPuntos;
    private javax.swing.JLabel lblModTelefono;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPrecioDia;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel panelDatosClientes;
    private javax.swing.JPanel window;
    // End of variables declaration//GEN-END:variables
}
