package Modelo.vo;

public class Requerimiento_3 {
    // Su código

    private String Proveedor;
    private String Pagado;
    private String Constructora;
    
    public Requerimiento_3() {
    }    

    public Requerimiento_3(String pagado) {
        Pagado = pagado;
    }

    public String getProveedor() {
        return Proveedor;
    }
    public void setProveedor(String proveedor) {
        Proveedor = proveedor;
    }
    public String getPagado() {
        return Pagado;
    }
    public void setPagado(String pagado) {
        Pagado = pagado;
    }
    public String getConstructora() {
        return Constructora;
    }
    public void setConstructora(String constructora) {
        Constructora = constructora;
    }    
}
