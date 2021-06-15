public class AlunoGraduacao extends Aluno {

    public boolean estaAprovado(){
        if(this.calculaMedia()>=7){
            return true;
        }
        return false;
    }
}
