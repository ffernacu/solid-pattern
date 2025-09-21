package pe.ffernacu.service;

public class Tienda extends Transporte {

    @Override
    public String recepcionPagos(Double monto) {
        return "La tienda recepcionó pagos de: " + monto + " soles";
    }

    @Override
    public String gestionarInventario(Integer count) {
        return "La Tienda tiene unb inventario de: " + count + " productos";
    }

    @Override
    public String entregarPedido(String producto) {
        return "La Tienda tiene un Pedido de: " + producto;
    }

}

