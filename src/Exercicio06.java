public class Exercicio06 {
	public static void main(String[] args) {
		int[] valores = {10, 20, 30};
		valores[1] = 99;

		for (int valor : valores) {
			System.out.println(valor);
		}
	}
}