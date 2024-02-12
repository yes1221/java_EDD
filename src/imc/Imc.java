package imc;
/**
 * 
 * @author alumno
 */
public class Imc {
/**
 * 
 * @param peso pues es el peso cap de cavota
 * @param altura es la altura
 * @return devuelve el imc ya calculado
 */
	double calcularImc(int peso, double altura) { 

		double imc = (peso / (altura * altura));

		return imc;

	}
/**El metode classificarImc agarra el valor imc y te devuelve un mensaje
 * 
 * @param imc  le pasamos el valor del imc como parametro
 */
	void classificarImc(double imc) {

		// Determinar a classifica��o do IMC
		if (imc < 18.5) {
			System.out.println("Voc� est� ABAIXO DO PESO!!");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("PESO NORMAL");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("SOBREPESO");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("OBESIDADE GRAU 1");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("OBESIDADE GRAU 2");
		} else {
			System.out.println("OBESIDADE GRAU 3");
		}

	}

}
