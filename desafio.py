from time import time
hora1= int(input("Digite o primeiro horário (hora):"))
min1 = int(input("Digite o primeiro horário (minutos):"))
hora2 = int(input("Digite o primeiro horário (hora):"))
min2 = int(input("Digite o segundo horário (minutos):"))

horaex = (min1 + min2) //60
minu = (min1 + min2) %60
horariofim = hora1 + hora2 + horaex - 24

if horariofim < 0:
    horariofim *= -1

if horariofim > 12:
    horariofim -= 12
    print(f'{hora1}:{min1} + {hora2}:{min2} = {horariofim}')







