import time
from ReceiveCoordinates import ReceiveCoordinates

welcome = "Welcome to Battleship!!!\n\n"
# imprime a mensagem lentamente
for char in welcome:
    print(char, end="")
    time.sleep(0.08) # tempo em segundos

# iniciando o programa
inicia = ReceiveCoordinates()
inicia.receiveCoordinates()
