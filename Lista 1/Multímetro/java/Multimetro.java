import java.util.Scanner;

public class Multimetro {

    public static void main(String[] args) throws Exception {
        double soma = 0, media, somatorio = 0, resultDesvio;
        double []dados = new double[10];
        double []distancia = new double[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.printf("Digite o valor %d: ", i+1);
            dados[i] = sc.nextDouble();
            soma += dados[i];
        }
        
        sc.close();

        media = soma/10;

        for(int i = 0; i < 10; i++){
            distancia[i] = dados[i] - media;
            distancia[i] *= distancia[i];
            somatorio += distancia[i];
            System.out.printf(dados[i] + ", ");
        }
        
        resultDesvio = Math.sqrt(somatorio /= 10);

        System.out.println("\nValor medio: " + media);
        System.out.println("Desvio padrão: " + resultDesvio);

        if(resultDesvio > media * 0.10) System.out.println("O multimetro esta com defeito!");
        else System.out.println("O multimetro esta funcionando corretamente");
        
    }

}