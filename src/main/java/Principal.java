import Entities.AlunoEnsinoMedio;
import Entities.AlunoGraduacao;
import Entities.Professor;

public class Principal {
    public static void main(String[] args) {

        Professor professor1 = new Professor();
        professor1
                .setTitulacaoMaxima("PÓS-DOUTORADO")
                .setNome("Marco");

        Professor professor2 = new Professor();
        professor2
                .setTitulacaoMaxima("MESTRADO")
                .setNome("Luciana");


        AlunoGraduacao alunoGraduacao = new AlunoGraduacao();
        alunoGraduacao
                .setMatricula("1000")
                .setProfessor(professor1)
                .setNome("Joazinho");

        alunoGraduacao.addNotas(10.0f);
        alunoGraduacao.addNotas(10.0f);


        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        alunoEnsinoMedio
                .setMatricula("0001")
                .setProfessor(professor2)
                .setNome("Maria");

        alunoEnsinoMedio.addNotas(3.0f);
        alunoEnsinoMedio.addNotas(5.0f);


    }
}
