package Reportes;

/**
 *
 * @author Dell
 */
public class reporte {

    private String personasAhorrantes;
    private String personasConPrestamos;
    private String serviciosPagadosEmpleados;
    private String personasAsociadas;

    public reporte(String personasAhorrantes, String personasConPrestamos, String serviciosPagadosEmpleados, String personasAsociadas) {
        this.personasAhorrantes = personasAhorrantes;
        this.personasConPrestamos = personasConPrestamos;
        this.serviciosPagadosEmpleados = serviciosPagadosEmpleados;
        this.personasAsociadas = personasAsociadas;
    }

    public String getPersonasAsociadas() {
        return personasAsociadas;
    }

    public void setPersonasAsociadas(String personasAsociadas) {
        this.personasAsociadas = personasAsociadas;
    }

    public String getPersonasAhorrantes() {
        return personasAhorrantes;
    }

    public void setPersonasAhorrantes(String personasAhorrantes) {
        this.personasAhorrantes = personasAhorrantes;
    }

    public String getPersonasConPrestamos() {
        return personasConPrestamos;
    }

    public void setPersonasConPrestamos(String personasConPrestamos) {
        this.personasConPrestamos = personasConPrestamos;
    }

    public String getServiciosPagadosEmpleados() {
        return serviciosPagadosEmpleados;
    }

    public void setServiciosPagadosEmpleados(String serviciosPagadosEmpleados) {
        this.serviciosPagadosEmpleados = serviciosPagadosEmpleados;
    }

}