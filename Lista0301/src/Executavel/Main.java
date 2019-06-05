package Executavel;
import java.util.Scanner;
import Carros.CarroGeral;
import Imoveis.Albergue;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		List<CarroGeral> listCarro = new Arraylist<CarroGeral>();
		listCarro.add(new CarroGeral(TipoCarro.Basico,true,TipoCombustivel.Gasolina,120,true,
				"PBH-1863",2002,50100.7));
		listCarro.add(new CarroGeral(TipoCarro.Comum,false,TipoCombustivel.Flex,130,false,
				"PBH-1863",2012,0));
		listCarro.add(new CarroGeral(TipoCarro.Executivo,true,TipoCombustivel.Diesel,90,true,
				"PBH-1863",1990,2300));
		listCarro.add(new CarroGeral(TipoCarro.Luxo,false,TipoCombustivel.Eletrico,150,false,
				"PBH-1863",2014,19245));
		listCarro.add(new CarroGeral(TipoCarro.Basico,true,TipoCombustivel.Gasolina,250,true,
				"PBH-1863",1985,578910));
		
		List<Albergue> listAlbergue = new Arraylist<Albergue>();
		listAlbergue.add(new Albergue(120,3,true,"12:00","12:00",false,
				IdiomaFalado.Portugues,true,4));
		listAlbergue.add(new Albergue(150,2,false,"12:00","12:00",true,
				IdiomaFalado.Ingles,false,3));
		listAlbergue.add(new Albergue(90,4,true,"12:00","12:00",false,
				IdiomaFalado.Espanhol,true,5));
		
		List<ApartamentoOuCasa> listApartamento = new Arraylist<ApartamentoOuCasa>();
		listApartamento.add(new ApartamentoOuCasa(120,3,true,"12:00","12:00",false,
				IdiomaFalado.Portugues,true,4,false));
		listApartamento.add(new ApartamentoOuCasa(150,2,false,"12:00","12:00",true,
				IdiomaFalado.Ingles,false,3,true));
		listApartamento.add(new ApartamentoOuCasa(90,4,true,"12:00","12:00",false,
				IdiomaFalado.Espanhol,true,5,true));
		
		List<Hotel> listHotel = new Arraylist<Hotel>();
		listHotel.add(new Hotel(120,3,true,"12:00","12:00",false,
				IdiomaFalado.Portugues,true,false,4));
		listHotel.add(new Hotel(150,2,false,"12:00","12:00",true,
				IdiomaFalado.Ingles,false,true,3));
		listHotel.add(new Hotel(90,4,true,"12:00","12:00",false,
				IdiomaFalado.Espanhol,true,true,5));
		
		List<Pousada> listPousada = new Arraylist<Pousada>();
		listPousada.add(new Pousada(120,3,true,"12:00","12:00",false,
				IdiomaFalado.Portugues,true,false,4));
		listPousada.add(new Pousada(150,2,false,"12:00","12:00",true,
				IdiomaFalado.Ingles,false,true,3));
		listPousada.add(new Pousada(90,4,true,"12:00","12:00",false,
				IdiomaFalado.Espanhol,true,true,5));
		
		
		System.out.print("bom dia, o que voce deseja?"
				+ "\ndigite 1 para alugar um carro"
				+ "\ndigite 2 para reservar um imovel");
		int escolha = read.nextInt();
		
		switch(escolha) {
		case 1:
			System.out.print("escolha o tipo do carro:"
					+ "\n1 para Basico"
					+ "\n2 para Comum"
					+ "\n3 para Executivo"
					+ "\n4 para Luxo");
			int escolhaCarro = read.nextInt();
			System.out.print("digite 1 para ordenar por ano de fabricacao"
					+ "ou 2 para ordenar por preco da diaria"
					+ "ou 0 para nao ordenar");
			int escolhaOrdem = read.nextInt();
			switch(escolhaOrdem) {
			case 0:
				break;
			case 1:
				//ordenar fabricacao
				break;
			case 2:
				//ordenar por diaria
				break;
			default:
				break;
			
			}
			switch(escolhaCarro) {
			case 1:
				//passar pela lista e mostrar apenas Basico
				break;
			case 2:
				//Comum
				break;
			
			case 3:
				//Executivo
				break;
			
			case 4:
				//Luxo
				break;
			
			default:
				System.out.print("opcao invalida");
				break;
			}
			break;
		case 2:
			System.out.print("escolha o tipo de hospedagem:"
					+ "\n1 para Hoteis"
					+ "\n2 para Pousadas"
					+ "\n3 para Aluguel de casas ou apartamentos"
					+ "\n4 para Albergues");
			int escolhaImovel = read.nextInt();
			System.out.print("digite 1 para ordenar por valor da diaria"
					+ "ou 0 para nao ordenar");
			int escolhaOrdem = read.nextInt();
			if (escolhaOrdem==1) {
				//ordenar por valor da diaria
			}
			
			switch(escolhaImovel) {
			case 1:
				System.out.print("digite 1 ordenar a lista de hoteis por"
						+ "numero de estrelas, ou 0 para não ordenar");
				int ordenarFlag = read.nextInt();
				if (ordenarFlag==1) {
					//ordenar hoteis por estrela
				}
				//hoteis
				break;
			case 2:
				//pousadas
				break;
			case 3:
				System.out.print("digite 1 ordenar a lista de casas ou apartamentos por"
						+ "numero de quartos, ou 0 para não ordenar");
				int ordenarFlag = read.nextInt();
				if (ordenarFlag==1) {
					//ordenar casas por numero de quartos
				}
				//Aluguel de casas ou apartamentos
				break;
			case 4:
				//Albergues
				break;
			
			default:
				System.out.print("escolha invalida");
				break;
			}
			
			break;
		default:
			System.out.print("escolha invalida");
			break;
			
		
		
		read.close();
	}

}

}
