# Como executar
1. Gere o código do javacc
```
javacc Lexer.jj
```
2. Compile as classes java
```
javac *.java
```
3. Execute o parser, passando o conteúdo do arquivo ex.lcc como input
```
java MyParser < ex.lcc
```