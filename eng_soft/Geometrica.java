package eng_soft;

public class Geometrica implements ICalcMedia{
	
	private double resultado;
	@Override
	public double CalculaMedia (double a, double b) {
		resultado = (a+b)/2;
		return resultado;
	}
	
	@Override 
	public String Situacao() {
		if (resultado > 5) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}
}
