class Board:
    def __init__(self):
        self.board = [['-' for _ in range(5)] for _ in range(5)]

    def buildBoards(self, user):
        for i in range(5):
            for j in range(5):
                user.board[i][j] = '-'  # preenche todos os espaços com valores em branco

        for i in range(5):
            coordinates = user.coordinates[i]
            row = coordinates[0]  # armazena linha
            column = coordinates[1]  # armazena coluna
            user.board[row][column] = '@'  # encontra coordenada escolhida e coloca um navio nela

        for i in range(5):
            for j in range(5):
                print(user.board[i][j], end=' ')  # imprime tabuleiro inicial
            print()
