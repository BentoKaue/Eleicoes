public class Candidato {
    private int id;
    private String nome;
    private int votos;

    public Candidato(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.votos = 0;
    }

    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public int getVotos() {
        return votos;
    }
}
