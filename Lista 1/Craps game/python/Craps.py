import random

class LancaDados():

    def primeiroLancamento():
        dado1 = random.randint(1, 6)
        dado2 = random.randint(1, 6)
    
        print("Primeiro lançamento:\n")
        print("Dado 1: " + dado1)
        print("Dado 2: " + dado2)

        verificaPrimeiroLancamento(dado1, dado2)
    
    def verificaPrimeiroLancamento(d1, d2):
        resultado
        if(d1+d2 == 7 | d1+d2 == 11):
            resultado = True
        if(d1 + d2 == 2 | d1 + d2 == 3 | d1 + d2 == 12):
            resultado = False
        if(d1 + d2 == 3 | d1 + d2 == 5 | d1 + d2 == 6 | d1 + d2 == 8 | d1 + d2 == 9 | d1 + d2 == 10):
            print("Ponto marcado: %d - Vamos para os próximos lançamentos...\n", d1+d2)
            proximoLancamento(d1+d2, resultado)
    
    def proximoLancamento(soma, resultado):
        dado1 = random.randint(1, 6)
        dado2 = random.randint(1, 6)

        print("Dado 1: " + dado1)
        print("Dado 2: " + dado2 + "\n")

        if(dado1 + dado2 == soma):
            resultado(resultado = true)
        if(dado1 + dado2 == 7):
            resultado(resultado = false)
        else:
            proximoLancamento(soma, resultado)
        
    def resultado(resultado):
        if(resultado == false):
            print("Você perdeu! :(")
        else:
            print("Você venceu!!! ;)")
        
