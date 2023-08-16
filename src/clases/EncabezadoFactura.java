package clases;

import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EncabezadoFactura {

    private String nombreCliente;
    private String nitCliente;
    private Date fechaFactura;

    public EncabezadoFactura(String nombreCliente, String nitCliente, Date fechaFactura) {
        this.nombreCliente = nombreCliente;
        this.nitCliente = nitCliente;
        this.fechaFactura = fechaFactura;
    }

}
