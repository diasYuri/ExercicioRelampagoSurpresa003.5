import Entities.AlunoEnsinoMedio;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlunoEnsinoMedioTest {

    @Test
    public void deveRetornarAprovado() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.addNotas(6.0f);
        aluno.addNotas(6.0f);

        assertEquals(true, aluno.estaAprovado());
    }

    @Test
    public void deveRetornarReprovado() {
        AlunoEnsinoMedio aluno = new AlunoEnsinoMedio();
        aluno.addNotas(6.0f);
        aluno.addNotas(5.9f);

        assertEquals(false, aluno.estaAprovado());
    }
}