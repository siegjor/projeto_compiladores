### Pré-requisitos
* Java 18.0.2.1 2022-08-18
* Make
* JavaCC (não é necessário, a menos que se queira gerar o parser novamente)

### Como executar o código
1. (opcional) Rode ``make compile`` para gerar o parser e outros arquivos
   (requer JavaCC)
2. Rode ``make build`` para compilar os arquivos .java
3. Rode ``make run`` para executar o programa
4. Se necessário, rode ``make clean`` para deletar os arquivos gerados

**CUIDADO**: ``make clean`` irá deletar todos os arquivos gerados,
até os gerados pelo JavaCC, ou seja, para gerá-los novamente,
será necessário ter o JavaCC instalado!

**OBS:** Rodando ``make all`` irá executar os comandos *compile*, 
*build* e *run* ao mesmo tempo

### Usando outros programas .lcc como input
No arquivo "Makefile" há três variáveis diferentes, PROGRAM1,
PROGRAM2  e PROGRAM3, cada uma contendo um arquivo de um programa .lcc
diferente. Para mudar qual desses programas rodar, basta substituir na
linha 27 do Makefile o PROGRAM1 pela variável contendo o programa desejado.