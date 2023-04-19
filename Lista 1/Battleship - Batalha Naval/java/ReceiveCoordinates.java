import java.util.Scanner;

public class ReceiveCoordinates{

    protected int[][] coordinates = new int[5][2];//aqui serão armazenadas as coordenadas que o usuário escolher
    protected char[][] board = new char[5][5];//aqui será gravado o tabuleiro de cada usuário
    protected char[][] historic = new char[5][5];//aqui será gravado o histórico de jogadas de cada usuário

    public void receiveCoordinates(){
        ReceiveCoordinates user1 = new ReceiveCoordinates();
        ReceiveCoordinates user2 = new ReceiveCoordinates();
        VerifyCoordinates verify = new VerifyCoordinates();
        Boolean verifica = false;
        Board board = new Board();

        Scanner sc = new Scanner(System.in);

        //Pede ao primeiro usuário que insira suas coordenadas
        do{
            System.out.println("PLAYER 1, ENTER YOUR SHIPS COORDINATES.");
            for(int i = 0; i<5; i++){
                System.out.println("Enter you ship " + (i+1) + " location:");
                    for(int j = 0; j < 2; j++){
                            user1.coordinates[i][j] = sc.nextInt();
                    }
            }

            /*envia as cordenadas para a função da classe de verificação
             * retorna true se houver valores repetidos
            */
            verifica = verify.verify(user1);

            if(verifica == true){
                System.out.println("Invalid coordinates. Choose different coordinates.");
            }

            //grava o histórico inicial em branco:
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    user1.historic[i][j] = '-';
                }
            }
            
        }while(verifica == true);

        board.buildBoards(user1);//constrói o tabuleiro do player 1

        //aqui será repetido o processo tido com o pleyer 1, mas agora com o player 2
        do{
            System.out.println("PLAYER 2, ENTER YOUR SHIPS COORDINATES.");
            for(int i = 0; i<5; i++){
                System.out.println("Enter you ship " + (i+1) + " location:");
                for(int j = 0; j < 2; j++){
                    user2.coordinates[i][j] = sc.nextInt();
                }
            }

            verifica = verify.verify(user2);

            if(verifica == true){
                System.out.println("Invalid coordinates. Choose different coordinates.");
            }

            //grava o histórico em branco:
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    user2.historic[i][j] = '-';
                }
            }

        }while(verifica == true);

        board.buildBoards(user2);

        //iniciando a partida
        Play play = new Play();
        play.play(user1, user2);

    }
}    

