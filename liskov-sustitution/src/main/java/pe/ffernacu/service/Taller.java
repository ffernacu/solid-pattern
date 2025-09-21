package pe.ffernacu.service;

public class Taller extends Provider{

    @Override
    public String recepcionPagos(Double monto) {
        return "El Taller recepciono pagos de: " + monto + " soles";
    }

    @Override
    public String gestionarInventario(Integer count) {
        return "El Taller tiene un inventario de: " + count + " productos";
    }
}
