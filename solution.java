import java.util.Scanner;
class solution{
	public static void main(String[]args){
		Scanner read = new Scanner(System.in);
		int valor;
		int i = 0;
		solution x = new solution();
		int vet[] = new int [100];
		while((valor = read.nextInt()) != -1){
			vet[i] = valor;
			i += 1;
		}
		for(int j = 0; j < i;j++){
			System.out.print(vet[i] + " ");
		}
		System.out.println();
	}
}