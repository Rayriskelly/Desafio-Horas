from bibli_funcao import nomes
nomes = []
senhas = []

print("Olá usuário")
print("1. Login\n"
      "2. Cadastrar\n")

escolha = int(input("digite o número da opção escolhida:"))
if escolha ==1:
    for r in range(2):
        nome = input(f"Digite o nome do usuário: ")
        senha = int(input(f"Digite a senha: "))
        nomes.append(nome)
        senhas.append(senha)

else:
    for r in range(2):
        nome = input(f"Digite um nome para usuário: ")
        senha = int(input(f"Digite um senha: "))

        if nome == nomes:
            print("Usuário já cadastrado!")