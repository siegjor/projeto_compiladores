# Variáveis
JAVACC := javacc
JAVAC := javac
JAVA := java

# Nome dos arquivos
GRAMMAR := Lexer.jj
SOURCE := MyParser.java
PROGRAM1 := ex.lcc

# Diretório para armazenar os arquivos compilados (.class)
CLASSES_DIR := classes

# Lista de arquivos .java a serem excluídos durante a limpeza (exceto CustomNode.java)
JAVA_FILES := $(filter-out CustomNode.java CustomTree.java,$(wildcard *.java))

# Builda o target
all: compile build run

# Compila a gramática JavaCC
compile:
	$(JAVACC) $(GRAMMAR)

# Compila os arquivos Java
build:
	$(JAVAC) -d $(CLASSES_DIR) *.$(JAVA)

# Roda o programa
# Para ler outras entradas, mude PROGRAM1 para PROGRAM2 ou PROGRAM3
run:
	$(JAVA) -cp $(CLASSES_DIR) MyParser < $(PROGRAM1)

# Deleta os arquivos gerados
clean:
ifeq ($(OS),Windows_NT)
	@if exist $(CLASSES_DIR) ( rd /s /q $(CLASSES_DIR) )
	@for %%f in ($(JAVA_FILES)) do del "%%f"
else
	rm -rf $(CLASSES_DIR)
	rm -f $(JAVA_FILES)
endif

# Phony targets
.PHONY: all compile build run clean