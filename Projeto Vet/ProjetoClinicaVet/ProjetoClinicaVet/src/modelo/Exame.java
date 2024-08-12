package modelo;

public class Exame {

    private int id_exame;
    private Veterinario veterinario;
    private Consulta c;
    private String exame;

    public Exame() {
    }

    public int getId_exame() {
        return id_exame;
    }

    public void setId_exame(int id_exame) {
        this.id_exame = id_exame;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getExame() {
        return exame;
    }

    public void setExame(String exame) {
        this.exame = exame;
    }

    public Exame(Veterinario vet) {
        veterinario = vet;
    }

    public Consulta getC() {
        return c;
    }

    public void setC(Consulta c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return this.getExame();
    }
}
