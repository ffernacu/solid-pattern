package pe.ffernacu.service;

public abstract class Provider {
    public abstract String recepcionPagos(Double monto);
    public abstract String gestionarInventario(Integer count);
}
