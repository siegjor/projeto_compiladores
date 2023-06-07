# Makefile

# Variáveis
JAVACC := javacc
JAVAC := javac
JAVA := java

# Nome dos arquivos
GRAMMAR := Lexer.jj
SOURCE := MyParser.java
PROGRAM1 := ex.lcc

# Builda o target
all: compile build run

# Compila a gramática JavaCC
compile:
	$(JAVACC) $(GRAMMAR)

# Compila os arquivos Java
build:
	$(JAVAC) *.$(JAVA)

# Roda o programa
# Para ler outras entradas, mude PROGRAM1 para PROGRAM2 ou PROGRAM3
run:
	$(JAVA) MyParser < $(PROGRAM1)

# Deleta os arquivos gerados
clean:
ifeq ($(OS),Windows_NT)
	del /Q *.java *.class
else
	rm -f *.java *.class
endif

# Phony targets
.PHONY: all compile build run clean