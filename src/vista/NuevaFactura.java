package vista;

import clases.*;
import java.text.ParseException;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class NuevaFactura extends javax.swing.JPanel {

    SistemaFacturacion sistemaFacturacion;
    private List<DetalleFactura> detallesSeleccionados = new ArrayList<>();

    public NuevaFactura(SistemaFacturacion sistemaFacturacion) {
        initComponents();
        this.sistemaFacturacion = sistemaFacturacion;

        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("MM/dd/yyyy");
        String fechaFormateada = formato.format(fecha);
        fechaFacturaTxt.setText(fechaFormateada);
        numeroFacturaTxt.setText(obtenerNumeroFactura());
        inicializarProductosDisponibles();
    }

    private void limpiarCampos() {
        nitClienteTxt.setText("");
        nombreClienteTxt.setText("");
        cantidadArticuloTxt.setText("");
        detallesSeleccionados.clear();
        ArticulosAgregados.setText("");
        numeroFacturaTxt.setText(obtenerNumeroFactura());
    }

    private void agregarArticulosSeleccionadosTextArea() {
        ArticulosAgregados.setText("");
        // Agregar los detalles al TextArea y calcular el total
        double total = 0;


        for (DetalleFactura detalle : detallesSeleccionados) {
            Articulo articulo = detalle.getArticulo();
           int cantidad = detalle.getCantidad();

        ArticulosAgregados.append(cantidad + "x    nombre: " + articulo.getNombre() + " - - - -   Precio:  " + articulo.getPrecio()  + " - - - - SubTotal :  " + articulo.getPrecio()*cantidad+ "\n");
        total += articulo.getPrecio() * cantidad;
        }
        
        ArticulosAgregados.append("\nTotal: " + total + "\n");

    }

    private String obtenerNumeroFactura() {

        Random random = new Random();
        int numeroFactura = random.nextInt(10000) + 1;
        String numeroFacturaFormateado = String.format("F-%04d", numeroFactura);

        return numeroFacturaFormateado;

    }

    private void inicializarProductosDisponibles() {

        sistemaFacturacion.obtenerArticulosDisponibles().forEach((articulo) -> {
            ArticulosDisponibles.addItem(articulo.getNombre());
        });

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
        jScrollPane2 = new javax.swing.JScrollPane();
        ArticulosAgregados = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numeroFacturaTxt = new javax.swing.JLabel();
        fechaFacturaTxt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nitClienteTxt = new javax.swing.JTextField();
        nombreClienteTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ArticulosDisponibles = new javax.swing.JComboBox<>();
        cantidadArticuloTxt = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ArticulosAgregados.setEditable(false);
        ArticulosAgregados.setColumns(20);
        ArticulosAgregados.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ArticulosAgregados.setForeground(new java.awt.Color(0, 0, 0));
        ArticulosAgregados.setRows(5);
        jScrollPane2.setViewportView(ArticulosAgregados);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 710, 220));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 730, 10));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/eliminar_icono.png"))); // NOI18N
        jLabel1.setText("Eliminar articulos");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 300, 50));

        jPanel2.setBackground(new java.awt.Color(158, 210, 190));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("No. Factura :");

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha facturacion:");

        numeroFacturaTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        numeroFacturaTxt.setForeground(new java.awt.Color(0, 0, 0));

        fechaFacturaTxt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fechaFacturaTxt.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numeroFacturaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fechaFacturaTxt)
                .addGap(211, 211, 211))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numeroFacturaTxt))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(fechaFacturaTxt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("NIT:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre:");

        nitClienteTxt.setBackground(new java.awt.Color(255, 255, 255));
        nitClienteTxt.setForeground(new java.awt.Color(102, 102, 102));
        nitClienteTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        nombreClienteTxt.setBackground(new java.awt.Color(255, 255, 255));
        nombreClienteTxt.setForeground(new java.awt.Color(102, 102, 102));
        nombreClienteTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Detalles del cliente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nitClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(nitClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreClienteTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 570, 110));

        ArticulosDisponibles.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ArticulosDisponibles.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(ArticulosDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 270, 30));

        cantidadArticuloTxt.setBackground(new java.awt.Color(255, 255, 255));
        cantidadArticuloTxt.setForeground(new java.awt.Color(102, 102, 102));
        cantidadArticuloTxt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad Articulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        cantidadArticuloTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadArticuloTxtActionPerformed(evt);
            }
        });
        jPanel1.add(cantidadArticuloTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 120, 40));

        jPanel4.setBackground(new java.awt.Color(158, 210, 190));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agregar");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/guardar_icono.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadArticuloTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadArticuloTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadArticuloTxtActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        if (cantidadArticuloTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese la cantidad de articulos");
            return;
        }

        DetalleFactura detalleFactura = new DetalleFactura();

        int cantidad = Integer.parseInt(cantidadArticuloTxt.getText());
        String nombreArticulo = ArticulosDisponibles.getSelectedItem().toString();

        Articulo articulo = sistemaFacturacion.obtenerArticulosDisponibles()
                .stream()
                .filter(a -> a.getNombre().equals(nombreArticulo))
                .findFirst()
                .orElse(null);

        detalleFactura.setArticulo(articulo);
        detalleFactura.setCantidad(cantidad);
        detallesSeleccionados.add(detalleFactura);
        agregarArticulosSeleccionadosTextArea();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        detallesSeleccionados.clear();
        agregarArticulosSeleccionadosTextArea();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
    
        if (nitClienteTxt.getText().isEmpty() || nombreClienteTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese todos los campos");
            return;
        }

        if (detallesSeleccionados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor agregue al menos un articulo");
            return;
        }
        String fecha = fechaFacturaTxt.getText();
        SimpleDateFormat formato = new SimpleDateFormat("MM/dd/yyyy");
        Date fechaFormateada = null;
        
        try {
            fechaFormateada = formato.parse(fecha);
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha");
        }

        EncabezadoFactura encabezadoFactura = new EncabezadoFactura();
        encabezadoFactura.setNitCliente(nitClienteTxt.getText());
        encabezadoFactura.setNombreCliente(nombreClienteTxt.getText());
        encabezadoFactura.setFechaFactura(fechaFormateada);
        
        Factura factura = new Factura();
        factura.setNumeroFactura(numeroFacturaTxt.getText());
        factura.setEncabezado(encabezadoFactura);
        detallesSeleccionados.forEach(factura::agregarDetalle);
        sistemaFacturacion.agregarFactura(factura);

        JOptionPane.showMessageDialog(this, "Factura agregada con exito");
        limpiarCampos();


    }//GEN-LAST:event_jLabel8MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ArticulosAgregados;
    private javax.swing.JComboBox<String> ArticulosDisponibles;
    private javax.swing.JTextField cantidadArticuloTxt;
    private javax.swing.JLabel fechaFacturaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nitClienteTxt;
    private javax.swing.JTextField nombreClienteTxt;
    private javax.swing.JLabel numeroFacturaTxt;
    // End of variables declaration//GEN-END:variables
}
