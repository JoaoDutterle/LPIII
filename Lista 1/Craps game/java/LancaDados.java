import java.util.Random;

public class LancaDados{
    public void primeiroLancamento(){
        int dado1 = new Random().nextInt(6) + 1;
        int dado2 = new Random().nextInt(6) + 1;

        System.out.println("Primeiro lançamento:");
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);

        verificaPrimeiroLancamento(dado1, dado2);
    }

    public void verificaPrimeiroLancamento(int d1, int d2){
        boolean resultado = false;
        Resultado res = new Resultado();

        if(d1 + d2 == 7 || d1 + d2 == 11){

            res.resultado(resultado = true);

        }if(d1 + d2 == 2 || d1 + d2 == 3 || d1 + d2 == 12){

            res.resultado(resultado = false);

        }if(d1 + d2 == 4 || d1 + d2 == 5 || d1 + d2 == 6 || d1 + d2 == 8 || d1 + d2 == 9 || d1 + d2 == 10){

            System.out.printf("Ponto marcado: %d - Vamos para os próximos lançamentos...\n", d1+d2);
            proximoLancamento(d1+d2, res);

        }

    }  

    public void proximoLancamento(int soma, Resultado res){
        boolean resultado = false;
        int dado1 = new Random().nextInt(6) + 1;
        int dado2 = new Random().nextInt(6) + 1;

        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2 + "\n");

        if(dado1 + dado2 == soma){

            res.resultado(resultado = true);

        }else if(dado1 + dado2 == 7){

            res.resultado(resultado = false);

        }else{
            proximoLancamento(soma, res);
        }
    }
}
