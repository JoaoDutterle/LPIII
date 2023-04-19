from VerifyCoordinates import VerifyCoordinates
from Board import Board
from Play import Play

class ReceiveCoordinates:
    def __init__(self):
        self.coordinates = [[0 for _ in range(2)] for _ in range(5)]
        self.board = [[' ' for _ in range(5)] for _ in range(5)]
        self.historic = [['-' for _ in range(5)] for _ in range(5)]

    def receiveCoordinates(self):
        user1 = ReceiveCoordinates()
        user2 = ReceiveCoordinates()
        verify = VerifyCoordinates()
        verifica = False
        board = Board()

        while True:
            print("PLAYER 1, ENTER YOUR SHIPS COORDINATES.")
            for i in range(5):
                print("Enter your ship", i+1, "location:")
                for j in range(2):
                    user1.coordinates[i][j] = int(input())

            verifica = verify.verify(user1)

            if verifica:
                print("Invalid coordinates. Choose different coordinates.")
            else:
                break

            for i in range(5):
                for j in range(5):
                    user1.historic[i][j] = '-'

        board.buildBoards(user1)  

        while True:
            print("PLAYER 2, ENTER YOUR SHIPS COORDINATES.")
            for i in range(5):
                print("Enter your ship", i+1, "location:")
                for j in range(2):
                    user2.coordinates[i][j] = int(input())

            verifica = verify.verify(user2)

            if verifica:
                print("Invalid coordinates. Choose different coordinates.")
            else:
                break

            for i in range(5):
                for j in range(5):
                    user2.historic[i][j] = '-'

        board.buildBoards(user2)

        play = Play()
        play.play(user1, user2)
