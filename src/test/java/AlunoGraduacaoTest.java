import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoGraduacaoTest {

    @Test
    void deveRetornaAprovado() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.addNotas(7.0f);
        aluno.addNotas(7.0f);

        assertEquals(true, aluno.estaAprovado());
    }

    @Test
    void deveRetornaReprovado() {
        AlunoGraduacao aluno = new AlunoGraduacao();
        aluno.addNotas(6.9f);
        aluno.addNotas(7.0f);

        assertEquals(false, aluno.estaAprovado());
    }


}