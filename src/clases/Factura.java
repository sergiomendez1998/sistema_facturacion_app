package clases;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Factura {

    private EncabezadoFactura encabezado;
    private List<DetalleFactura> detalles  = new ArrayList<>();

    private String numeroFactura;

    public Factura(EncabezadoFactura encabezado) {
        this.encabezado = encabezado;
        ;
    }

    public void agregarDetalle(DetalleFactura detalle) {
        detalles.add(detalle);
    }

    public double calcularTotal() {
        double total = 0;
        for (DetalleFactura detalle : detalles) {
            total += detalle.getArticulo().getPrecio() * detalle.getCantidad();
        }
        return total;
    }
    


}
