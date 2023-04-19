import java.util.Scanner;

public class Play {
    public void play(ReceiveCoordinates user1, ReceiveCoordinates user2){
        Scanner sc = new Scanner(System.in);
        int[][] hit = new int[1][2];
        int verificaHit;
        int contShips1 = 0, contShips2 = 0;
        VerifyCoordinates verifyHit = new VerifyCoordinates();

        System.out.println();
        System.out.println("LET'S START TO PLAY");

        //loop infinito até termos um resultado final
        while(2 > 1){
            do{
            System.out.println("Player 1, enter hit row/column:");
            //recebe coordenadas que o usuário deseja atirar
            for(int i = 0; i < 1; i++){
                for(int j = 0; j < 2; j++){
                    hit[i][j] = sc.nextInt();
                }
            }
            
            verificaHit = verifyHit.verifyHit(hit, user1, user2, 1, 2);//verifica onde o usuário acertou (recebe 1, 2 ou 3)

            if(verificaHit == 1){
                contShips1++;//conta quantidade de navios abatidos
            }
            if(contShips1 == 5){
                break;//se a quantidade de navios abatidos chegar a 5, ele sai do loop
            }
            
            if(verificaHit == 1 || verificaHit == 3){
                for(int i = 0; i < 5; i++){
                    for(int j = 0; j < 5; j++){
                        System.out.print(user1.historic[i][j] + " ");//imprime o histórico
                    }
                    System.out.println();
                }
            }   

            }while(verificaHit == 2);
            
            if(contShips1 == 5){
                break;
            }

            //repete o mesmo processo com o player 2
            do{
                System.out.println("Player 2, enter hit row/column:");
            
                for(int i = 0; i < 1; i++){
                    for(int j = 0; j < 2; j++){
                        hit[i][j] = sc.nextInt();
                    }
                }

                verificaHit = verifyHit.verifyHit(hit, user2, user1, 2, 1);
                if(verificaHit == 1){
                    contShips2++;
                }
                if(contShips2 == 5){
                    break;
                }

                if(verificaHit == 1 || verificaHit == 3){
                    for(int i = 0; i < 5; i++){
                        for(int j = 0; j < 5; j++){
                            System.out.print(user2.historic[i][j] + " ");
                        }
                        System.out.println();
                    }
                }   

            }while(verificaHit == 2);
            if(contShips2 == 5){
                break;
            }
        }
        System.out.println();

        //verifica quem ganhou
        if(contShips1 == 5){
            System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENTS SHIPS!");
        }
        if(contShips2 == 5){
            System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENTS SHIPS!");
        }

        //imprimindo tabuleiros finais...
        System.out.println("Final boards:");

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(user1.board[i][j] + " ");;
            }
            System.out.println();
        }
        
        System.out.println();
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(user2.board[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
        
    }
}
