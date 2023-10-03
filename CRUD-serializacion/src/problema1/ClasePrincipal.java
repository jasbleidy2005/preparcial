package problema1;

public class ClasePrincipal {
    public static void main(String[] args) {
        ServicioPeluqueria servicio= ServicioPeluqueria.CORTE;
        System.out.println(servicio.getNombre()+ servicio.getDescripcion()+ servicio.getPrecio());
        ServicioPeluqueria servicio1= ServicioPeluqueria.UNAS;
        System.out.println(servicio1.getNombre()+ servicio1.getDescripcion()+ servicio1.getPrecio());
        ServicioPeluqueria servicio2= ServicioPeluqueria.TINTE;
        System.out.println(servicio2.getNombre()+ servicio2.getDescripcion()+ servicio2.getPrecio());

    }
}
