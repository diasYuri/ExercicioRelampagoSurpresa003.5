import java.util.List;

public class Aluno extends Pessoa{
    private String matricula;
    private List<Float> notas;


    public void addNotas(Float nota){
        this.notas.add(nota);
    }

    public Float calculaMedia(){
        return this.notas
                .stream()
                .reduce(0.0f, (subtotal, nota) -> subtotal+nota)
                /this.notas.size();
    }

    public List<Float> getNotas() {
        return this.notas;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public Aluno setMatricula(String matricula) {
        this.matricula = matricula;
        return this;
    }
}