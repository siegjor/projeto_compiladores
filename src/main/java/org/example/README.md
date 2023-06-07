### Pré-requisitos
* Java 18.0.2.1 2022-08-18
* Make
* (JavaCC não é necessário, a menos que se queira gerar o parser novamente)

### Como executar o código
Rode ``make run`` para rodar o programa

### Usando outros programas .lcc como input
No arquivo "Makefile" há três variáveis diferentes, PROGRAM1,
PROGRAM2  e PROGRAM3, cada uma contendo um arquivo de um programa .lcc
diferente. Para mudar qual desses programas rodar, basta substituir na
linha 27 o PROGRAM1 pela variável contendo o programa desejado.