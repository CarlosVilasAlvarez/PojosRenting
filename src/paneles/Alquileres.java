package paneles;

import hibernate.NewHibernateUtil;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import metodos.Altas;
import metodos.Buscar;
import org.hibernate.Session;
import pojos.Alquiler;
import pojos.Cliente;
import pojos.Coche;
import pojos.Empresa;
import pojos.LargoPlazo;
import pojos.Particular;

public class Alquileres extends javax.swing.JPanel implements IClientesAlquileres, ICochesAlquileres{
    
    private JPanel panelMainClientes;
    private JPanel panelMainCoches;
    private JPanel panelMainAlquileres;
    private JFrame aplicacion;
    private Cliente clienteSel;
    private Coche cocheSel;
    
    /**
     * Creates new form Alquileres
     */
    public Alquileres() {
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date now = new Date();
        entFechaI.setText(sdf.format(now));
        listarAlquileres();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seleccionCoche = new javax.swing.JDialog();
        seleccionCliente = new javax.swing.JDialog();
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
        entBuscarDni = new javax.swing.JTextField();
        entBuscarFechaI = new javax.swing.JTextField();
        entBuscarDuracion = new javax.swing.JTextField();
        entBuscarFechaF = new javax.swing.JTextField();
        entBuscarMatricula = new javax.swing.JTextField();
        entBuscarPrecio = new javax.swing.JTextField();
        lblModTelefono = new javax.swing.JLabel();
        lblModFechaNac = new javax.swing.JLabel();
        panelDatosClientes = new javax.swing.JPanel();
        lblDni = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        btnAlta = new javax.swing.JButton();
        btnBuscarShow = new javax.swing.JButton();
        entFechaI = new javax.swing.JTextField();
        entFechaF = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        entCoche = new javax.swing.JTextField();
        btnSeleccionarCliente = new javax.swing.JButton();
        btnSeleccionarCoche = new javax.swing.JButton();
        entCliente = new javax.swing.JTextField();
        window = new javax.swing.JPanel();

        seleccionCoche.setSize(new java.awt.Dimension(809, 606));

        seleccionCliente.setSize(new java.awt.Dimension(809, 606));

        dialogoBuscar.setTitle("ALERTA");
        dialogoBuscar.setMinimumSize(new java.awt.Dimension(416, 299));
        dialogoBuscar.setModal(true);
        dialogoBuscar.setResizable(false);
        dialogoBuscar.setSize(new java.awt.Dimension(472, 385));

        jLabel6.setText("BUSQUEDA ALQUILERES");

        lblModNombre.setText("DNI/CIF");

        lblModApel.setText("Duracion");

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

        lblModDni.setText("Fecha inicio");

        lblModEmail.setText("Fecha fin");

        lblModTelefono.setText("Matricula");

        lblModFechaNac.setText("Precio");

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
                                .addComponent(lblModNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(entBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogoBuscarLayout.createSequentialGroup()
                                .addComponent(lblModApel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(entBuscarDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dialogoBuscarLayout.createSequentialGroup()
                                .addComponent(lblModTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(entBuscarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogoBuscarLayout.createSequentialGroup()
                                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblModEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblModFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblModDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(entBuscarFechaF, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(entBuscarFechaI, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(entBuscarPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                            .addComponent(btnBuscarCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(entBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModDni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entBuscarFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblModTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entBuscarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblModEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entBuscarFechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblModApel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entBuscarDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblModFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(entBuscarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(dialogoBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarAceptar)
                    .addComponent(btnBuscarCancelar1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatosClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(0, 0, 0)));

        lblDni.setText("Fecha Inicio");

        lblTelefono.setText("Fecha Final");

        btnAlta.setText("ALTA");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnBuscarShow.setText("BUSCAR");
        btnBuscarShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarShowActionPerformed(evt);
            }
        });

        entCoche.setEditable(false);

        btnSeleccionarCliente.setText("Selec Cliente");
        btnSeleccionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarClienteActionPerformed(evt);
            }
        });

        btnSeleccionarCoche.setText("Selec Coche");
        btnSeleccionarCoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarCocheActionPerformed(evt);
            }
        });

        entCliente.setEditable(false);

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
                            .addGroup(panelDatosClientesLayout.createSequentialGroup()
                                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTelefono)
                                    .addComponent(btnSeleccionarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSeleccionarCoche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(entCoche, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(entFechaI, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entFechaF, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entCliente)))
                            .addComponent(btnBuscarShow, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelDatosClientesLayout.setVerticalGroup(
            panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosClientesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleccionarCliente)
                    .addComponent(entCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entCoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionarCoche))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDni))
                .addGap(18, 18, 18)
                .addGroup(panelDatosClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entFechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono))
                .addGap(30, 30, 30)
                .addComponent(btnAlta)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarShow)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        window.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDatosClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(window, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatosClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(window, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarShowActionPerformed
        dialogoBuscar.setVisible(true);
    }//GEN-LAST:event_btnBuscarShowActionPerformed

    private void btnSeleccionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarClienteActionPerformed
        listarClientes(); //Listo los clientes en el dialogo
        seleccionCliente.setVisible(true); //Enseño el dialogo
    }//GEN-LAST:event_btnSeleccionarClienteActionPerformed

    private void btnSeleccionarCocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarCocheActionPerformed
        listarCoches(); //Listo los clientes en el dialogo
        seleccionCoche.setVisible(true); //Enseño el dialogo
    }//GEN-LAST:event_btnSeleccionarCocheActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        try{
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date fechaI = sdf.parse(this.entFechaI.getText());
            Date fechaF = sdf.parse(this.entFechaF.getText());
            float precioTotal,
                    descuento = 0;
            int duracion = (int) ((fechaF.getTime() - fechaI.getTime()) / 86400000);
            if (clienteSel instanceof Particular) {
                if (((Particular)clienteSel).getPuntos() == 15) {
                    descuento = 0.1f;
                }

            } else if (((Empresa)clienteSel).getnAlquileres() > 100) {
                descuento = 0.1f;
            }
            precioTotal = cocheSel.getPrecioDia() * duracion * (descuento + 1);
            Alquiler alquiler = null;
            LargoPlazo largoPlazo = null;
            if(clienteSel instanceof Particular) {
                alquiler = new Alquiler(fechaI, fechaF, cocheSel, precioTotal, descuento);
                alquiler.setParticular((Particular)clienteSel);
            }else {
                alquiler = new Alquiler(fechaI, fechaF, cocheSel, precioTotal, descuento);
                alquiler.setEmpresa((Empresa)clienteSel);
            }
            Altas.alquileres(alquiler);
            if(duracion > 30) {
                largoPlazo = new LargoPlazo(fechaI, fechaF, cocheSel, precioTotal, descuento);
                Altas.largoPlazo(largoPlazo);
            }
            vaciarCampos();
        }catch(ParseException pe){
            System.out.println(pe);
            vaciarCampos();
        }
        listarAlquileres();
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnBuscarAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAceptarActionPerformed
        List<Coche> coches = Buscar.coches(entBuscarMatricula.getText(), "", "", "", "", "");
        Coche coche = null;
        if(coches != null){ 
           coche = coches.get(0); 
        }
        List<Cliente> particulares = Buscar.particulares("", entBuscarDni.getText(), "", "", "", "", "");
        Particular particular = null;
        if(particulares != null && particulares.size() > 0){
            particular = ((Particular)particulares.get(0));
        }
        List<Cliente> empresas = Buscar.empresas("", entBuscarDni.getText(), "", "");
        Empresa empresa = null;
        if(empresas != null && empresas.size() > 0){
            empresa = ((Empresa)empresas.get(0));
        }
        List<Alquiler> alquileres = Buscar.alquileres(this.entBuscarPrecio.getText(),this.entBuscarFechaI.getText() ,this.entBuscarFechaF.getText() , coche, particular, empresa);
        listarAlquileres(alquileres);
        this.dialogoBuscar.setVisible(false);
    }//GEN-LAST:event_btnBuscarAceptarActionPerformed

    private void btnBuscarCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCancelar1ActionPerformed
        dialogoBuscar.setVisible(false);
    }//GEN-LAST:event_btnBuscarCancelar1ActionPerformed
    
    @Override
    public void listarClientes(){ //lista los clientes
        if(panelMainClientes != null){
            panelMainClientes.removeAll();
            panelMainClientes.revalidate();
            panelMainClientes.repaint();
            seleccionCliente.remove(panelMainClientes);
            seleccionCliente.revalidate();
            seleccionCliente.repaint();
        }

        panelMainClientes = new JPanel(new BorderLayout());
        seleccionCliente.add(panelMainClientes);
        GridBagLayout innerLayout = new GridBagLayout();
        GridBagConstraints innerConstraints = new GridBagConstraints();
        JPanel innerPanel = new JPanel(innerLayout);

        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        List<Cliente> clientes = sesion.createCriteria(Cliente.class).list();//quitar esta linea
        int numeroClientes = clientes.size();
        int numeroIteracionesX = (numeroClientes/3)+1;
        int numeroIteracionesTotales = 0;

        innerConstraints.weightx = 0.5;
        innerConstraints.weighty = 0.5;
        innerConstraints.gridy = 0;

        for(int i = 0; i < numeroIteracionesX; i++){    
            for(int j = 0; j < 3; j++){
                if(numeroIteracionesTotales != numeroClientes){
                    Cliente cliente = clientes.get(numeroIteracionesTotales);
                    boxClientes boxCliente;
                    if(cliente instanceof Particular){
                        boxCliente = new boxClientes(((Particular)cliente).getNombre(), ((Particular)cliente).getDni());
                    }else{
                        boxCliente = new boxClientes(((Empresa)cliente).getNombre(), ((Empresa)cliente).getCif());
                    }
                    boxCliente.setPanelPadre(this);
                    boxCliente.setClienteRepresentado(cliente);
                    boxCliente.setCentrarEnDialogo(seleccionCliente);
                    boxCliente.getBtnSeleccionar().setVisible(true);
                    boxCliente.getBtnModCli().setVisible(false);
                    boxCliente.getBtnEliminar().setVisible(false);
                    innerConstraints.gridx = j;
                    innerConstraints.gridy = i;
                    innerPanel.add(boxCliente, innerConstraints);
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
        panelMainClientes.add(scrollPanel, BorderLayout.CENTER);
        sesion.close();

    }
    
    @Override
    public void listarCoches(){
        if(panelMainCoches != null){
            panelMainCoches.removeAll();
            panelMainCoches.revalidate();
            panelMainCoches.repaint();
            seleccionCoche.remove(panelMainCoches);
            seleccionCoche.revalidate();
            seleccionCoche.repaint();
        }
        
        panelMainCoches = new JPanel(new BorderLayout());
        seleccionCoche.add(panelMainCoches);
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
                    boxCoches.getBtnModCoc().setVisible(false);
                    boxCoches.getBtnEliminar().setVisible(false);
                    boxCoches.getBtnSeleccionar().setVisible(true);
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
        panelMainCoches.add(scrollPanel, BorderLayout.CENTER);
        sesion.getTransaction().commit();
        sesion.close();
    
    }
    
    public void listarAlquileres(){
        if(panelMainAlquileres != null){
            panelMainAlquileres.removeAll();
            panelMainAlquileres.revalidate();
            panelMainAlquileres.repaint();
            window.remove(panelMainAlquileres);
            window.revalidate();
            window.repaint();
        }
        
        panelMainAlquileres = new JPanel(new BorderLayout());
        window.add(panelMainAlquileres);
        GridBagLayout innerLayout = new GridBagLayout();
        GridBagConstraints innerConstraints = new GridBagConstraints();
        JPanel innerPanel = new JPanel(innerLayout);
        
        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        List<Alquiler> alquileres = sesion.createCriteria(Alquiler.class).list();
        int numeroAlquileres = alquileres.size();
        int numeroIteracionesX = (numeroAlquileres/3)+1;
        int numeroIteracionesTotales = 0;
        
        innerConstraints.weightx = 0.5;
        innerConstraints.weighty = 0.5;
        innerConstraints.gridy = 0;
        
        for(int i = 0; i < numeroIteracionesX; i++){    
            for(int j = 0; j < 3; j++){
                if(numeroIteracionesTotales != numeroAlquileres){
                    Alquiler alquiler = alquileres.get(numeroIteracionesTotales);
                    boxAlquileres boxAlquiler;
                    if(alquiler.getParticular() != null) {
                        boxAlquiler = new boxAlquileres(alquiler.getParticular().getDni(), alquiler.getCoche().getMatricula(), alquiler.getCodigo());
                    }else {
                        boxAlquiler = new boxAlquileres(alquiler.getEmpresa().getCif(), alquiler.getCoche().getMatricula(), alquiler.getCodigo());
                    }
                    boxAlquiler.setPanelPadre(this);
                    boxAlquiler.setAlquilerRepresentado(alquiler);
                    boxAlquiler.setAplicacion(aplicacion);
                    innerConstraints.gridx = j;
                    innerConstraints.gridy = i;
                    innerPanel.add(boxAlquiler, innerConstraints);
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
        panelMainAlquileres.add(scrollPanel, BorderLayout.CENTER);
        sesion.close();
    
    }
    
    public void listarAlquileres(List<Alquiler> alquileres){ //modificar el metodo para que reciba el array de clientes
        if(panelMainAlquileres != null){
            panelMainAlquileres.removeAll();
            panelMainAlquileres.revalidate();
            panelMainAlquileres.repaint();
            window.remove(panelMainAlquileres);
            window.revalidate();
            window.repaint();
        }
        
        panelMainAlquileres = new JPanel(new BorderLayout());
        window.add(panelMainAlquileres);
        GridBagLayout innerLayout = new GridBagLayout();
        GridBagConstraints innerConstraints = new GridBagConstraints();
        JPanel innerPanel = new JPanel(innerLayout);
        
        Session sesion = NewHibernateUtil.getSession();
        sesion.beginTransaction();
        int numeroAlquileres = alquileres.size();
        int numeroIteracionesX = (numeroAlquileres/3)+1;
        int numeroIteracionesTotales = 0;
        
        innerConstraints.weightx = 0.5;
        innerConstraints.weighty = 0.5;
        innerConstraints.gridy = 0;
        
        for(int i = 0; i < numeroIteracionesX; i++){    
            for(int j = 0; j < 3; j++){
                if(numeroIteracionesTotales != numeroAlquileres){
                    Alquiler alquiler = alquileres.get(numeroIteracionesTotales);
                    boxAlquileres boxAlquiler;
                    if(alquiler.getParticular() != null) {
                        boxAlquiler = new boxAlquileres(alquiler.getParticular().getDni(), alquiler.getCoche().getMatricula(), alquiler.getCodigo());
                    }else {
                        boxAlquiler = new boxAlquileres(alquiler.getEmpresa().getCif(), alquiler.getCoche().getMatricula(), alquiler.getCodigo());
                    }
                    boxAlquiler.setPanelPadre(this);
                    boxAlquiler.setAlquilerRepresentado(alquiler);
                    boxAlquiler.setAplicacion(aplicacion);
                    innerConstraints.gridx = j;
                    innerConstraints.gridy = i;
                    innerPanel.add(boxAlquiler, innerConstraints);
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
        panelMainAlquileres.add(scrollPanel, BorderLayout.CENTER);
        sesion.close();
    
    }
    
    public void vaciarCampos() {
        entCliente.setText("");
        entCoche.setText("");
        entFechaI.setText("");
        entFechaF.setText("");
    }

    public JFrame getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(JFrame aplicacion) {
        this.aplicacion = aplicacion;
    }

    public Cliente getClienteSel() {
        return clienteSel;
    }

    public void setClienteSel(Cliente clienteSel) {
        this.clienteSel = clienteSel;
    }

    public Coche getCocheSel() {
        return cocheSel;
    }

    public void setCocheSel(Coche cocheSel) {
        this.cocheSel = cocheSel;
    }

    public JDialog getSeleccionCliente() {
        return seleccionCliente;
    }

    public void setSeleccionCliente(JDialog seleccionCliente) {
        this.seleccionCliente = seleccionCliente;
    }

    public JDialog getSeleccionCoche() {
        return seleccionCoche;
    }

    public void setSeleccionCoche(JDialog seleccionCoche) {
        this.seleccionCoche = seleccionCoche;
    }

    public JTextField getEntCliente() {
        return entCliente;
    }

    public void setEntCliente(JTextField entCliente) {
        this.entCliente = entCliente;
    }

    public JTextField getEntCoche() {
        return entCoche;
    }

    public void setEntCoche(JTextField entCoche) {
        this.entCoche = entCoche;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnBuscarAceptar;
    private javax.swing.JButton btnBuscarCancelar1;
    private javax.swing.JButton btnBuscarShow;
    private javax.swing.JButton btnSeleccionarCliente;
    private javax.swing.JButton btnSeleccionarCoche;
    private javax.swing.JDialog dialogoBuscar;
    private javax.swing.JTextField entBuscarDni;
    private javax.swing.JTextField entBuscarDuracion;
    private javax.swing.JTextField entBuscarFechaF;
    private javax.swing.JTextField entBuscarFechaI;
    private javax.swing.JTextField entBuscarMatricula;
    private javax.swing.JTextField entBuscarPrecio;
    private javax.swing.JTextField entCliente;
    private javax.swing.JTextField entCoche;
    private javax.swing.JTextField entFechaF;
    private javax.swing.JTextField entFechaI;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblModApel;
    private javax.swing.JLabel lblModDni;
    private javax.swing.JLabel lblModEmail;
    private javax.swing.JLabel lblModFechaNac;
    private javax.swing.JLabel lblModNombre;
    private javax.swing.JLabel lblModTelefono;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel panelDatosClientes;
    private javax.swing.JDialog seleccionCliente;
    private javax.swing.JDialog seleccionCoche;
    private javax.swing.JPanel window;
    // End of variables declaration//GEN-END:variables
}
