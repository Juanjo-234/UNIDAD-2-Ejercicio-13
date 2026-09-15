import java.util.ArrayList;
import java.util.List;
public class Credencial {
    String codigo;
    String nivelEmpleado;
    List<String> zonasPermitidas;


    public Credencial(String codigo, String nivelEmplead){
        this.codigo = codigo;
        this.nivelEmpleado = nivelEmpleado;
        this.zonasPermitidas = new ArrayList<>();
    }

    String getCodigo(){
        return codigo;
    }

    String getNivelEmpleado(){
        return nivelEmpleado;
    }



    List<String> getZonasPermitidas(){
        return zonasPermitidas;
    }
    public String toString() {
        return "TarjetaRFID [Código: " + codigo + ", Nivel: " + nivelEmpleado + "]";
    }
}
