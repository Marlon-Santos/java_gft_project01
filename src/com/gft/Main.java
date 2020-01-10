package com.gft;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Veiculo car = new Veiculo();
		int ok;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("qual a marca do seu carro?");
			car.setMarca(sc.nextLine());
			System.out.println("qual é o modelo do seu carro?");
			car.setModelo(sc.nextLine());
			System.out.println("qual é a placa do seu carro?");
			car.setPlaca(sc.nextLine());
			System.out.println("qual é a cor do seu carro?");
			car.setCor(sc.nextLine());
			System.out.println("cadastro realizado com sucesso, agora faça uma ação:");
			System.out.println("digite 1");
			ok = sc.nextInt();
			System.out.println(ok);
			sc.close();
			//fazer recursividade
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}