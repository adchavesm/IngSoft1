/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author USUARIO
 */
public class NoveltyEntity {

   
    private int horasTrabajadas;
    private int horasExtra;
    private int horasNocturnas;
    private int horasDominicales;
    private int bonos;
    private int incapacidad;//en dias mayor a 3 
    private int faltas;//en dias
    private int adelanto; 
    private int vacaciones; //en dias
    
     public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public NoveltyEntity() {
    }

    public int getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(int vacaciones) {
        this.vacaciones = vacaciones;
    }

    
    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getHorasNocturnas() {
        return horasNocturnas;
    }

    public void setHorasNocturnas(int horasNocturnas) {
        this.horasNocturnas = horasNocturnas;
    }

    public int getBonos() {
        return bonos;
    }

    public void setBonos(int bonos) {
        this.bonos = bonos;
    }

    public int getIncapacidad() {
        return incapacidad;
    }

    public void setIncapacidad(int incapacidad) {
        this.incapacidad = incapacidad;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getAdelanto() {
        return adelanto;
    }

    public void setAdelanto(int adelanto) {
        this.adelanto = adelanto;
    }

    public int getHorasDominicales() {
        return horasDominicales;
    }

    public void setHorasDominicales(int horasDominicales) {
        this.horasDominicales = horasDominicales;
    }

    @Override
    public String toString() {
        return "Horas Nocturas :" + this.horasNocturnas + "Horas Dominicales :"
                + this.horasDominicales + "Bonificaciones :" + this.bonos + "Horas Extra :" + this.horasExtra
                + "Incapacidad :" + this.incapacidad + "Faltas :" + this.faltas + "Adelantos :" + this.adelanto +
                "Vacaciones :" + this.vacaciones;        
    }
    
    
}
