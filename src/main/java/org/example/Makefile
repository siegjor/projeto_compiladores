# Variáveis
JAVACC := javacc
JAVAC := javac
JAVA := java

# Nome dos arquivos
GRAMMAR := Lexer.jj
SOURCE := MyParser.java
PROGRAM1 := program_1.lcc
PROGRAM2 := program_2.lcc
PROGRAM3 := program_3.lcc

# Diretório para armazenar os arquivos compilados (.class)
CLASSES_DIR := classes

# Lista de arquivos .java a serem excluídos durante a limpeza (exceto CustomNode.java e CustomTree.java)
JAVA_FILES := $(filter-out CustomNode.java CustomTree.java,$(wildcard *.java))

# Builda o target
all: compile build run

# Compila a gramática JavaCC
compile:
	$(JAVACC) $(GRAMMAR)

# Compila os arquivos Java
build:
	$(JAVAC) -d $(CLASSES_DIR) *.$(JAVA)

# Roda o programa (run1 roda program_1.lcc, run2 roda o program_2.lcc e run3 roda o program_3.lcc)
run1:
	$(JAVA) -cp $(CLASSES_DIR) MyParser < $(PROGRAM1)

run2:
	$(JAVA) -cp $(CLASSES_DIR) MyParser < $(PROGRAM2)

run3:
	$(JAVA) -cp $(CLASSES_DIR) MyParser < $(PROGRAM3)

# Deleta os arquivos gerados
clean:
ifeq ($(OS),Windows_NT)
	@if exist $(CLASSES_DIR) ( rd /s /q $(CLASSES_DIR) )
	@for %%f in ($(JAVA_FILES)) do del "%%f"
else
	rm -rf $(CLASSES_DIR)
	rm -f $(JAVA_FILES)
endif