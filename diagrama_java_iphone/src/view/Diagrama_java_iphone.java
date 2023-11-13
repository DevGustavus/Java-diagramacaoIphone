/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import controller.IphoneController;
import java.util.Scanner;

/**
 *
 * @author gusta
 */
public class Diagrama_java_iphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira seu numero de telefone: ");
        String numTelefone = input.nextLine();
        
        System.out.println("Qual o nome do proprietario do aparelho? ");
        String dono = input.nextLine();
        
        float preco;
        do{
            System.out.println("Valor R$ do aparelho: ");
            preco = input.nextFloat();
            if(preco < 0){
                System.out.println("\nNao pode valor negativo!\n");
            }
        }while(preco < 0);
        
        int flag = 0;
        int memoria;
        do{
            System.out.println("Quantidade de memoria interna: ");
            System.out.println("16GB, 32GB OU 64GB ? ");
            memoria = input.nextInt();
            if(memoria != 16 && memoria != 32 && memoria != 64){
                System.out.println("\nNao corresponde aos valores passados!\n");
            }
            else{
                flag = 1;
            }
            
        }while(flag != 1);
        
        System.out.println("Digite o modelo do aparelho: ");
        input.nextLine(); // Consumir a quebra de linha pendente
        String modelo = input.nextLine();
        
        IphoneController iphone = new IphoneController(numTelefone, dono, preco, memoria, modelo);
        
        iphone.toStringController();
        
        System.out.println("\n================================");
        System.out.println("Menu iphone:");
        System.out.println("1 - Tocar musica.");
        System.out.println("2 - Pausar musica.");
        System.out.println("3 - Selecionar musica.");
        System.out.println("4 - Ligar.");
        System.out.println("5 - Atender.");
        System.out.println("6 - Correio de voz.");
        System.out.println("7 - Exibir pagina WEB.");
        System.out.println("8 - Adicionar pagina WEB.");
        System.out.println("9 - Atualizar pagina WEB.");
        System.out.println("10 - Encerrar...");
        System.out.println("================================");
        
        boolean encerrar = false;
        int opc;
        String musica;
        String tell;
        String url;
        do{
            System.out.print("\nEscolha uma opcao: ");
            opc = input.nextInt();

            input.nextLine(); // Consumir a quebra de linha pendente
            
            switch (opc) {
                case 1:
                    System.out.println("Qual musica gostaria de tocar? ");
                    musica = input.nextLine();
                    iphone.tocar(musica);
                    break;
                case 2:
                    iphone.pausar();
                    break;
                case 3:
                    System.out.println("Qual musica gostaria de selecionar? ");
                    musica = input.nextLine();
                    iphone.selecionar(musica);
                    break;
                case 4:
                    System.out.println("Qual numero deseja ligar? ");
                    tell = input.nextLine();
                    iphone.ligar(tell);
                    break;
                case 5:
                    iphone.atender();
                    break;
                case 6:
                    iphone.iniciarCorreioVoz();
                    break;
                case 7:
                    System.out.println("Qual site que quer acessar? ");
                    url = input.nextLine();
                    iphone.exibirPagina(url);
                    break;
                case 8:
                    System.out.println("Qual site que quer acessar? ");
                    url = input.nextLine();
                    iphone.adicionarNovaAba(url);
                    break;
                case 9:
                    iphone.atualizarPagina();
                    break;
                case 10:
                    encerrar = true;
                default:
                    System.out.println("Opcao invalida. Escolha um numero de 1 a 10.");
                    break;
            }
        }while(encerrar != true);
    }
    
}
