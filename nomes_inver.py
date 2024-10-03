arrayNomes = [" "]*5
tam = len(arrayNomes)
for r in range(tam):
    arrayNomes[r] = input("Digite o nome:")

for k in range(tam):
    print(k, arrayNomes[k])

for y in range(tam-1, -1, -1):
    print(y, arrayNomes[y])

'''for k in range(tam, ):
    print(k, end=" ")'''
