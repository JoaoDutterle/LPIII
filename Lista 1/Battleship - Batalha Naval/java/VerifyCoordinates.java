import java.util.Arrays;

public class VerifyCoordinates {

    //Função de validação das coordenadas
    public boolean verify(ReceiveCoordinates user){
        int k = 1;//começa em 1 porque "row" começa em 0, e não podemos comparar com ele mesmo
        
        for(int[] row : user.coordinates){//"row" pega as coordenadas do usuário
            for(int i = k; i < 4; i++){
                //row irá comparar as coordenadas armazenadas nele com as outras
                if(Arrays.equals(row, user.coordinates[i])){
                    return true;
                }  
            }
            k++;
        }

        //se não encontrar valores repetidos, retorna false
        return false;
    }

    //Função para verificar onde o usuário acertou o tiro
    public int verifyHit(int[][] hit, ReceiveCoordinates user1, ReceiveCoordinates user2, int player, int otherPlayer){
        int result = 0;

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(user2.board[i][j] == '@' && hit[0][0] == i && hit[0][1] == j){//aqui verificamos se ele acertou um navio
                    user2.board[i][j] = 'X';//substitui o navio do outro usuário por um X
                    user1.historic[i][j] = 'X';//substitui um espaço vazio do histórico com um X
                    System.out.println("PLAYER "+ player + " HIT PLAYER "+ otherPlayer + "s SHIP!");
                    result = 1;//resultado retornará 1 se ele acertar
                    break;
                }if(user1.historic[i][j] == 'O' && hit[0][0] == i && hit[0][1] == j || user2.board[i][j] == 'X' && hit[0][0] == i && hit[0][1] == j){//aqui verificamos se ele já havia atirado no local
                    System.out.println("You already fired on this spot. Choose different coordinates.");//imprime mensagem dizendo pra escolher outra coordenada
                    result = 2;//resultado retornará 2 nesse caso
                    break;
                }if(user2.board[i][j] == '-' && hit[0][0] == i && hit[0][1] == j){//verifica se o usuário acertou um espaço vazio
                    user2.board[i][j] = 'O';//substitui o espaço vazio do outro usuário por "O"
                    user1.historic[i][j] = 'O';//substitui o espaço vazio do histórico por "O"
                    System.out.println("PLAYER "+ player +" MISSED!");
                    result = 3;//retorna 3 se ele errar
                    break;
                }
            }
            if(result == 1 || result == 2 || result == 3){
                break;//sai do último se encontrar um resultado para o tiro
            }
       }

        return result;//retorna 1, 2 ou 3
    }
}
