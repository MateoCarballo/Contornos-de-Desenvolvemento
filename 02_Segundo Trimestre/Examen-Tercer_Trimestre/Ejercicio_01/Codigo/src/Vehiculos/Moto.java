package Vehiculos;

import java.util.ArrayList;

public class Moto extends VehiculoMotor{

    private int potencia;

    public Moto(String marca, String modelo, ArrayList<Accidente> listadoAccidentes, ArrayList<Reparacion> listadoReparaciones, String matricula, int potencia) {
        super(marca, modelo, listadoAccidentes, listadoReparaciones, matricula);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}
