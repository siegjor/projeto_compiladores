package org.example;

public class CustomNode {
    private String name;
    private String value;
    private boolean terminal;

    CustomNode(String name, boolean terminal) {
        this.terminal = terminal;
        this.name = name;
    }

    CustomNode(String name, boolean terminal, String value) {
        this(name, terminal);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public Boolean getTerminal() {
        return terminal;
    }
}
