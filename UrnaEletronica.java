import java.util.ArrayList;

public class UrnaEletronica {
    private ArrayList<Candidato> candidatos;
    private int votosNulos;
    private int votosBrancos;

    public UrnaEletronica() {
        this.candidatos = new ArrayList<>();
        this.votosNulos = 0;
        this.votosBrancos = 0;
    }
}