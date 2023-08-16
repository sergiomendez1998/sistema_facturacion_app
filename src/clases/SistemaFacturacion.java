package clases;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;

public class SistemaFacturacion {

    private final List<Factura> facturas;
    private final List<Articulo> articulosDisponibles;

    public SistemaFacturacion() {
        facturas = new ArrayList<>();
        articulosDisponibles = new ArrayList<>();
        inicializarArticulosDisponibles();
    }

    public void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    public void mostrarFacturaEnTextArea(Factura factura, JTextArea txtAreaFactura) {
        txtAreaFactura.setText("");

        txtAreaFactura.append("Cliente: " + factura.getEncabezado().getNombreCliente() + "\n");
        txtAreaFactura.append("NIT: " + factura.getEncabezado().getNitCliente() + "\n");
        txtAreaFactura.append("Fecha: " + factura.getEncabezado().getFechaFactura() + "\n\n");

        for (DetalleFactura detalle : factura.getDetalles()) {
            txtAreaFactura.append("Artículo: " + detalle.getArticulo().getNombre() + "\n");
            txtAreaFactura.append("Cantidad: " + detalle.getCantidad() + "\n");
            txtAreaFactura.append("Precio unitario: " + detalle.getArticulo().getPrecio() + "\n");
            txtAreaFactura.append("Subtotal: " + detalle.getArticulo().getPrecio() * detalle.getCantidad() + "\n\n");
        }

        txtAreaFactura.append("Total: " + factura.calcularTotal() + "\n");
        txtAreaFactura.append("=================================\n");
    }

    public Factura buscarFactura(String numeroFactura) {
        for (Factura factura : facturas) {
            if (factura.getNumeroFactura().equals(numeroFactura)) {
                return factura;
            }
        }
        return null;
    }

    public List<Articulo> obtenerArticulosDisponibles() {
        return articulosDisponibles;
    }
    
        private void inicializarArticulosDisponibles() {
        articulosDisponibles.add(new Articulo("Laptop", 800.0));
        articulosDisponibles.add(new Articulo("Teléfono móvil", 500.0));
        articulosDisponibles.add(new Articulo("Tablet", 300.0));
        articulosDisponibles.add(new Articulo("Teclado", 50.0));
        articulosDisponibles.add(new Articulo("Mouse", 30.0));
        articulosDisponibles.add(new Articulo("Monitor", 200.0));
        articulosDisponibles.add(new Articulo("Impresora", 150.0));
        articulosDisponibles.add(new Articulo("Auriculares", 80.0));
        articulosDisponibles.add(new Articulo("Altavoces", 100.0));
        articulosDisponibles.add(new Articulo("Cámara digital", 250.0));
        articulosDisponibles.add(new Articulo("Reloj inteligente", 150.0));
        articulosDisponibles.add(new Articulo("Disco duro externo", 90.0));
        articulosDisponibles.add(new Articulo("Memoria USB", 20.0));
        articulosDisponibles.add(new Articulo("Cargador portátil", 40.0));
        articulosDisponibles.add(new Articulo("Router Wi-Fi", 60.0));
    }

}
