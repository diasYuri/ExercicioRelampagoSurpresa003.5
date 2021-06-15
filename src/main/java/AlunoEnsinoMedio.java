public class AlunoEnsinoMedio extends Aluno{

    public boolean estaAprovado(){
        if(this.calculaMedia()>=6){
            return true;
        }
        return false;
    }

}
