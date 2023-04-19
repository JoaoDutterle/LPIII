import math
dado = []; distancia = [] 
soma = media = somatorio = resultDesvio = 0

for i in range(3):
   print("Digite o valor ", i+1, ": ")
   #dado[i] = input()
   dado.append(float(input()))
   soma += dado[i]

media = soma/3

for i in range(3):
    distancia.append(dado[i] - media)
    distancia[i] *= distancia[i]
    somatorio += distancia[i]
    print(dado[i], ", ")

somatorio /= 3
resultDesvio = math.sqrt(somatorio)

print("\n\nValor medio: ", media)
print("\nDesvio padrão: ", resultDesvio)

if resultDesvio > (media*0.10): print("O multimetro esta com defeito!")
else: print("O multimetro esta funcionando corretamente!")    
