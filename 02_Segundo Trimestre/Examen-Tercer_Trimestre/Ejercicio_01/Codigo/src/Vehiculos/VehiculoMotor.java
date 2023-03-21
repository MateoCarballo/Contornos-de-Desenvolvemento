package Vehiculos;

import java.util.ArrayList;

public abstract class VehiculoMotor extends Vehiculo{

    private String matricula;

    public VehiculoMotor(String marca, String modelo, ArrayList<Accidente> listadoAccidentes, ArrayList<Reparacion> listadoReparaciones, String matricula) {
        super(marca, modelo, listadoAccidentes, listadoReparaciones);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
