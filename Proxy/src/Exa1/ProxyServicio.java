package Exa1;

public class ProxyServicio implements IServicio {

    private IServicio servicio;
    private Usuario usuario;

    public ProxyServicio(IServicio servicio,Usuario usuario) {
        this.usuario = usuario;
        this.servicio= servicio;
    }

    public void leer() {
        this.obtenerServicio().leer();
    }

    public void escribir() {
        if (this.usuario.getNivelPermiso() >= 5) {
            this.obtenerServicio().escribir();
        } else {
            throw new UnsupportedOperationException("Error de seguridad");
        }

    }

    public void actualizar() {
        if (this.usuario.getNivelPermiso() >= 5) {
            this.obtenerServicio().actualizar();
        } else {
            throw new UnsupportedOperationException("Error de seguridad");
        }
    }

    public void eliminar() {
        if (this.usuario.getNivelPermiso() >= 5) {
            this.obtenerServicio().eliminar();
        } else {
            throw new UnsupportedOperationException("Error de seguridad");
        }
    }

    private IServicio obtenerServicio() {
        if (this.servicio == null) {
            this.servicio = new Servicio();//
        }
        return this.servicio;
    }
}
