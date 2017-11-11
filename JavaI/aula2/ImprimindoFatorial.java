class ImprimindoFatorial {
	public static void main (String[] args) {
		for (int n = 1; n <= 20; n++) {
			long fatorial = 1;
			for (int j = 1;j <= n; j++) {
				fatorial *= j;
			}

			System.out.println("Fatorial de " + n + " é: " + fatorial);
		}
	}
}