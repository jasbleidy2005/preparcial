package problema1;

public enum ServicioPeluqueria {
    CORTE("mulec, ", "calvo a los lados y con pelo arriba ,", 5000) {
        @Override
        public String mostrarDescripcionServicio() {
            return null;
        }
    }, UNAS("el fraces, ", "una linea en la punta de la uña, ", 15000) {
        @Override
        public String mostrarDescripcionServicio() {
            return null;
        }
    }, TINTE("jasbleidy, ", "te da una rojo sangre, ", 12000) {
        @Override
        public String mostrarDescripcionServicio() {
            return null;
        }
    };

    private String nombre;
    private String descripcion;
    private int precio;

    ServicioPeluqueria(String nombre, String descripcion, int precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public abstract String mostrarDescripcionServicio();
}
