package eng_soft;

public class Aritmetica implements ICalcMedia {
	
	private double resultado;
	@Override
	public double CalculaMedia (double a, double b) {
		resultado = (a+b)/2;
		return resultado;
	}
	
	@Override
	public String Situacao (){
		if (resultado > 7) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}
}
