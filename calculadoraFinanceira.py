def calcular_valor_futuro(pv, i, n):
    vf = pv * (1 + i) ** n
    return vf

def calcular_valor_presente(vf, i, n):
    pv = vf / (1 + i) ** n
    return pv

print("Cálculo de Valor Futuro e Valor Presente")
print("========================================")


vf_desejado = float(input("\nDigite o valor futuro desejado: $"))
i = float(input("\nDigite a taxa de juros anual (em %): ")) / 100
n = int(input("\nDigite o número de anos: "))


pv_desejado = calcular_valor_presente(vf_desejado, i, n)
print(f"\nPara obter ${vf_desejado:.2f} após {n} anos, você precisaria depositar: ${pv_desejado:.2f}\n")


pv = float(input("\nDigite o valor presente (depósito inicial): $"))
i = float(input("\nDigite a taxa de juros anual (em %): ")) / 100
n = int(input("\nDigite o número de anos: "))


vf = calcular_valor_futuro(pv, i, n)
print(f"\nO valor futuro após {n} anos será: ${vf:.2f}\n")
