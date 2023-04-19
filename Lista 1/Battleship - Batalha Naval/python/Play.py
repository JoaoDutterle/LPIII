from VerifyCoordinates import VerifyCoordinates
class Play:
    def play(self, user1, user2):
        hit = [[0,0]]
        verifica_hit = 0
        cont_ships1 = 0
        cont_ships2 = 0
        verify_hit = VerifyCoordinates()

        print()
        print("LET'S START TO PLAY")

        while True:
            while True:
                print("Player 1, enter hit row/column:")

                for i in range(1):
                    for j in range(2):
                        hit[i][j] = int(input())

                verifica_hit = verify_hit.verifyHit(hit, user1, user2, 1, 2)

                if verifica_hit == 1:
                    cont_ships1 += 1
                if cont_ships1 == 5:
                    break

                if verifica_hit == 1 or verifica_hit == 3:
                    for i in range(5):
                        for j in range(5):
                            print(user1.historic[i][j], end=" ")
                        print()
                if verifica_hit != 2:
                    break

            if cont_ships1 == 5:
                break

            while True:
                print("Player 2, enter hit row/column:")
                for i in range(1):
                    for j in range(2):
                        hit[i][j] = int(input())

                verifica_hit = verify_hit.verifyHit(hit, user2, user1, 2, 1)
                if verifica_hit == 1:
                    cont_ships2 += 1
                if cont_ships2 == 5:
                    break

                if verifica_hit == 1 or verifica_hit == 3:
                    for i in range(5):
                        for j in range(5):
                            print(user2.historic[i][j], end=" ")
                        print()

                if verifica_hit != 2:
                    break

            if cont_ships2 == 5:
                break

        print()

        # verifica quem ganhou
        if cont_ships1 == 5:
            print("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENTS SHIPS!")
        if cont_ships2 == 5:
            print("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENTS SHIPS!")

        # imprimindo tabuleiros finais...
        print("Final boards:")

        for i in range(5):
            for j in range(5):
                print(user1.board[i][j], end=" ")
            print()

        print()
        for i in range(5):
            for j in range(5):
                print(user2.board[i][j], end=" ")
            print()
