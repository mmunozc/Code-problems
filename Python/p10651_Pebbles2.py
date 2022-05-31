
# Se hizo un pequeño arreglo en la parte de búsqueda del caso base '-oo' con el
# objetivo de mejorar el entendimiento del algoritmo y hacerlo más simple, antes
#  se hacía de derecha a izquierda, ahora se hace izquierda a derecha, este
# cambio no altera el funcionamiento del algoritmo.
# Respecto al tiempo, el manejo de un registro de casos resueltos hace que no
# sea necesario repetir operaciones lo cual optimiza el tiempo. Se considera que
# el gasto de memoria no es demasiado. Se utilizó el método de programación dinámica,
# en el cual se divide el problema en subproblemas (al hacer un movimiento el
# tablero se convierte en otro problema más pequeño) y se busca reducir el
# tiempo de ejecución guardando operaciones anteriores para no repetir cálculos
# (se elige gastar más memoria sobre gastar más tiempo)

import sys


def min_pebbles(case, registro):
    # Contar Pebbles
    mini  = case.count('o')
    # Verificar que el tablero no haya sido solucionado antes
    if case in registro:
        return registro.get(case)

    # Recorrer de izquierda a derecha el tablero buscando la forma base 'oo-'
    # resolverla y cada vez que al nuevo subproblema se le aplica la función nuevamente
    # se reconstruye al subproblema anterior para generar una nueva rama si se encuentra otro caso base
    for i in range(len(case)-2):
        if case[i] == 'o' and case[i+1] == 'o' and case[i+2] == '-':
            case = case[:i] + '--o'+ case[i+3:]
            mini_nuevo = min_pebbles(case, registro)
            case = case[:i] + 'oo-'+ case[i+3:]
            if mini_nuevo < mini:
                mini = mini_nuevo

    # Guardar solución
    registro[case] = mini

    # Recorrer de izquierda a derecha buscando el caso '-oo'
    for i in range(len(case)-2):
        if case[i] == '-' and case[i+1] == 'o' and case[i+2] == 'o':
            case = case[:i] + 'o--'+ case[i+3:]
            mini_nuevo = min_pebbles(case, registro)
            case = case[:i] + '-oo'+ case[i+3:]
            if mini_nuevo < mini:
                mini = mini_nuevo

    # Guardar solución
    registro[case] = mini

    return mini


def main():
    lines = sys.stdin.readlines()
    n = int(lines[0].strip())

    for i in range(1,n+1):
        case = lines[i].strip()
        registro = {}
        print(min_pebbles(case, registro))

main()
