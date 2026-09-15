public class LectorTarjetas {
    String ubicacionLector;
    ControlAcceso controlador;

    public LectorTarjetas(String ubicacionLector, ControlAcceso controlador) {
        this.ubicacionLector = ubicacionLector;
        this.controlador = controlador;
    }

    public void simularLectura(Credencial tarjeta) {
        System.out.println("[LECTOR " + ubicacionLector + "] Tarjeta presentada (Código: " + tarjeta.getCodigo() + ")");


        boolean autorizado = controlador.verificarAcceso(tarjeta, ubicacionLector);

        if (autorizado) {
            System.out.println(" Bienvenido. Desbloqueando puerta para la zona: " + ubicacionLector + "\n");
        } else {
            System.out.println(" Credenciales insuficientes o tarjeta inactiva para la zona: " + ubicacionLector + "\n");
        }
    }

    public String getUbicacionLector() {
        return ubicacionLector;
    }

}

