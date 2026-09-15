import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControlAcceso {

    Map<String, List<String>> baseDatosPermisos;

    public ControlAcceso() {
        this.baseDatosPermisos = new HashMap<>();
        baseDatosPermisos.put("EF-32", Arrays.asList("Sala de oficinas"));
            baseDatosPermisos.put("AD-12", Arrays.asList("Sala de oficinas", "Sala de Servidores"));
    }

        public boolean verificarAcceso(Credencial tarjeta, String zona) {
            if (tarjeta == null || zona == null) {
                return false;
            }

            List<String> zonasPermitidas = baseDatosPermisos.get(tarjeta.getCodigo());
            if (zonasPermitidas == null) {
                return false;
            }
            return zonasPermitidas.contains(zona);
        }
}
