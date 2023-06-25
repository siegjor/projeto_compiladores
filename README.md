### Pré-requisitos
* Java 18.0.2.1 2022-08-18
* Make
* JavaCC (não é necessário, a menos que se queira gerar o parser novamente)

### Como executar o código
1. Abra a pasta *projeto_compiladores* em um terminal ou IDE
2. (opcional, o projeto foi entregue com os arquuivos gerados)
   Rode ``make compile`` para gerar o parser e outros arquivos (requer JavaCC)
3. Rode ``make build`` para compilar os arquivos .java (os arquivos .class
   gerados serão guardados em uma pasta chamada *classes*)
4. Rode ``make run1``, ``make run2`` ou ``make run3`` para executar o programa com diferentes inputs
5. Somente se necessário, rode ``make clean`` para deletar os arquivos gerados

**CUIDADO**: ``make clean`` irá deletar todos os arquivos .java e .class gerados (exceto os arquivos CustomNode.java
e CustomTree.java, pois eles foram criados por nós), ou seja, para gerá-los novamente,
é necessário ter o JavaCC instalado!

### Escolhendo qual programa .lcc usar como input
No arquivo *Makefile* há três variáveis diferentes, **PROGRAM1**,
**PROGRAM2** e **PROGRAM3**, cada uma contendo um arquivo de um programa **.lcc**
diferente.

Cada variável (ou seja, cada arquivo) está associado a um comando _run_ diferente.
Para escolher qual input usar, basta exexutar o comando _run_ desejado:
- ``make run1`` para ler o input program_1.lcc
- ``make run2`` para ler o input program_2.lcc
- ``make run3`` para ler o input program_3.lcc

Caso seja necessário usar outro arquivo como input, basta mudar o valor da variável **PROGRAM1** para o
nome do arquivo desejado no _Makefile_, colocar este arquivo na pasta raiz do projeto, e executar o
comando ``make run1``.

### Observação
Ao executar o comando ``make build``, irá aparecer dois warnings no terminal. Estes warnings estão
relacionados a alguns métodos dos arquivos gerados pelo JavaCC estarem depreciados. Eles não interferem
em nada no funcionamento do programa, e a única maneira de tirá-los seria modificando o arquivo
gerado pelo JavaCC quando foi executado o comando ``make compile``, o que não funciona direito, pois gera um monte
de erros de import nos arquivos. Por isso, como é um problema da ferramenta, pedimos encarecidamente para
que o professor ignore estes warnings, já que não temos o que fazer em relação a eles.
