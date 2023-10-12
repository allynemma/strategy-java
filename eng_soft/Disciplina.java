package eng_soft;

public class Disciplina{
    private ICalcMedia CalcMedia;
    private double Media;
    private String Nome;
    private double P1;
    private double P2;
    private String Situacao;

    public double getP1(){
        return this.P1;
    }

    public void setP1(double P1){
        this.P1 = P1;
    }

    public double getP2(){
        return this.P2;
    }

    public void setP2(double P2){
        this.P2 = P2;
    }

    public void setNome(String nome){
        this.Nome = nome;
    }

    public double getMedia(){
        return this.Media;
    }

    public String getSituacao(){
        return this.Situacao;
    }

    public Disciplina(ICalcMedia oper){
        this.CalcMedia = oper;
    }

    public Disciplina(){

    }

    public void CalcMedia(){
        this.Media = CalcMedia.CalculaMedia(this.P1, this.P2);
        this.Situacao = CalcMedia.Situacao();
    }
}