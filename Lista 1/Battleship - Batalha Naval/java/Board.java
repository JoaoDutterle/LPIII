public class Board {
    protected char[][] board = new char[5][5];

    public void buildBoards(ReceiveCoordinates user){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                user.board[i][j] = '-';//preenche todos os espaços com valores em branco
            }
        }

        for(int i = 0; i < 5; i++){
            int[] coordinates = user.coordinates[i];
            int row = coordinates[0];//armazena linha
            int column = coordinates[1];//armazena coluna
            user.board[row][column] = '@';//encontra coordenada escolhida e coloca um navio nela
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(user.board[i][j] + " ");//imprime tabuleiro inicial
            }
            System.out.println();  
        }
    }
}
