### Pré-requisitos
* Java 18.0.2.1 2022-08-18
* Make
* JavaCC (não é necessário, a menos que se queira gerar o parser novamente)

### Como executar o código
1. Abra a pasta *projeto_compiladores* em um terminal ou IDE
2. (opcional) Rode ``make compile`` para gerar o parser e outros arquivos
   (requer JavaCC)
3. Rode ``make build`` para compilar os arquivos .java (os arquivos .class
   gerados serão guardados em uma pasta chamada *classes*)
4. Rode ``make run`` para executar o programa
5. Se necessário, rode ``make clean`` para deletar os arquivos gerados

**CUIDADO**: ``make clean`` irá deletar todos os arquivos .java e .class gerados (exceto os arquivos "Custom..."), ou seja, para gerá-los novamente,
é necessário ter o JavaCC instalado!

**OBS:** Rodando ``make all`` irá executar os comandos *compile*,
*build* e *run* um atrás do outro.

### Escolhendo qual programa .lcc usar como input
No arquivo *Makefile* há três variáveis diferentes, **PROGRAM1**,
**PROGRAM2** e **PROGRAM3**, cada uma contendo um arquivo de um programa **.lcc**
diferente.

Para escolher qual programa rodar, basta substituir na
linha 34 do Makefile o **PROGRAM1** pela variável contendo o programa desejado.

### Observação
Ao executar o comando ``make build``, irá aparecer dois warnings no terminal. Estes warnings estão
relacionados a alguns métodos dos arquivos gerados pelo JavaCC estarem depreciados. Eles não interferem
em nada no funcionamento do programa, e a única maneira de tirá-los seria modificando o arquivo
gerado pelo JavaCC ao executar o comando ``make compile``, o que não funciona direito, pois gera um monte
de erros de import nos arquivos. Por isso, como é um problema da ferramenta, pedimos encarecidamente para
que o professor ignore estes warnings, já que não temos o que fazer em relação a eles.
