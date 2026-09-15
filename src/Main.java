//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
ControlAcceso cotrolador = new ControlAcceso();

LectorTarjetas lectorServidores = new LectorTarjetas("Sala de Servidores", cotrolador);
LectorTarjetas lectorOficinas  = new LectorTarjetas("Sala de oficinas", cotrolador);


Credencial tarjetaEmpleado = new Credencial("EF-32", "BASICO");
Credencial tarjetaAdmin = new Credencial("AD-12", "AVANZADO");


lectorOficinas.simularLectura(tarjetaEmpleado);

lectorServidores.simularLectura(tarjetaEmpleado);

lectorServidores.simularLectura(tarjetaAdmin);

}
