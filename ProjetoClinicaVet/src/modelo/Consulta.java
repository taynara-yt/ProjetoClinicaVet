package modelo;

import java.util.Date;

public class Consulta {

    private int id_consulta;
    private String sintomas;
    private Date datacon;
    private String turno;
    private String diagnostico;
    Veterinario vet;
    Animal animal;

    public int getId_consulta() {
        return id_consulta;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setId_consulta(int id_consulta) {
        this.id_consulta = id_consulta;
    }

    public Date getDatacon() {
        return datacon;
    }

    public void setDatacon(Date datacon) {
        this.datacon = datacon;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public Veterinario getVet() {
        return vet;
    }

    public void setVet(Veterinario vet) {
        this.vet = vet;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return this.getId_consulta() + "";
    }

}
