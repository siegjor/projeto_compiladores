package org.example;

import java.util.HashSet;

public class CustomNode {
    private String name;
    private String value;
    private boolean terminal;
    private int count = 1;
    private HashSet<String> types;

    CustomNode(String name, boolean terminal) {
        this.terminal = terminal;
        this.name = name;
    }

    CustomNode(String name, boolean terminal, String value) {
        this(name, terminal);
        this.value = value;
    }

    CustomNode(String name, boolean terminal, String value, String type) {
        this(name, terminal, value);
        this.types = new HashSet<>();
        types.add(type);
    }

    public String getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }

    public Boolean isTerminal() {
        return this.terminal;
    }

    public int getCount() {
        return this.count;
    }

    public void incrementCount() {
        this.count++;
    }

    public void addType(String type) {
        this.types.add(type);
    }

    public HashSet<String> getTypes() {
        return this.types;
    }
}
