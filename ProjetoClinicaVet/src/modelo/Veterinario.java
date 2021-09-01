package modelo;

public class Veterinario extends Funcionario {

    private int id_vet;
    private String crmv;

    public String getCrmv() {
        return crmv;
    }

    public void setCrmv(String crmv) {
        this.crmv = crmv;
    }

    public int getId_vet() {
        return id_vet;
    }

    public void setId_vet(int id_vet) {
        this.id_vet = id_vet;
    }

    @Override
    public String toString() {
        return this.getCrmv();
    }

}
