import numpy as np

class VerifyCoordinates:

    def verify(self, user):
        k = 1

        for row in user.coordinates:
            for i in range(k, 4):
                if np.array_equal(row, user.coordinates[i]):
                    return True
            k += 1

        return False

    def verifyHit(self, hit, user1, user2, player, otherPlayer):
        result = 0

        for i in range(5):
            for j in range(5):
                if user2.board[i][j] == '@' and hit[0][0] == i and hit[0][1] == j:
                    user2.board[i][j] = 'X'
                    user1.historic[i][j] = 'X'
                    print(f"PLAYER {player} HIT PLAYER {otherPlayer}s SHIP!")
                    result = 1
                    break
                if user1.historic[i][j] == 'O' and hit[0][0] == i and hit[0][1] == j or user2.board[i][j] == 'X' and hit[0][0] == i and hit[0][1] == j:
                    print("You already fired on this spot. Choose different coordinates.")
                    result = 2
                    break
                if user2.board[i][j] == '-' and hit[0][0] == i and hit[0][1] == j:
                    user2.board[i][j] = 'O'
                    user1.historic[i][j] = 'O'
                    print(f"PLAYER {player} MISSED!")
                    result = 3
                    break
            if result == 1 or result == 2 or result == 3:
                break

        return result
