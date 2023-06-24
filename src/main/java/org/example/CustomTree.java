package org.example;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CustomTree {
    private ArrayList<CustomNode> tokenList;

    public CustomTree() {
        this.tokenList = new ArrayList<>();
    }

    public void addTokenToList(String tokenName, boolean terminal) {
        CustomNode node = new CustomNode(tokenName, terminal);
        tokenList.add(node);
    }

    public void addTokenToList(String tokenName, boolean terminal, String tokenValue) {
        CustomNode node = new CustomNode(tokenName, terminal, tokenValue);
        tokenList.add(node);
    }

    public ArrayList<CustomNode> getNonTerminals() {
        return tokenList.stream().filter(t -> !t.isTerminal()).collect(Collectors.toCollection(ArrayList::new));
    }

    public ArrayList<CustomNode> getTerminals() {
        return tokenList.stream().filter(CustomNode::isTerminal).collect(Collectors.toCollection(ArrayList::new));
    }

    public String getSententialForm() {
        ArrayList<String> leafStringList = getTerminals().stream().map(CustomNode::getName).collect(Collectors.toCollection(ArrayList::new));

        // Remove o símbolo terminal que causou o erro da lista de folhas
        leafStringList.remove(leafStringList.size() - 1);

        // Coloca o token não terminal mais à esquerda na posição certa na lista de folhas
        for (int i = tokenList.size() - 1; i > 0; i--){
            CustomNode node = tokenList.get(i);
            if (!node.isTerminal()) {
                int position = tokenList.size() - i;

                int correction = 2;
                if (tokenList.get(tokenList.size() - 1).getName().equals(node.getName())) {
                    correction = 1;
                }

                leafStringList.add(leafStringList.size() - position + correction, node.getName());
                break;
            }
        }


        return String.join(", ", leafStringList);
    }

    public String getLeftMostNonTerminal() {
        ArrayList<CustomNode> nonTerminals = getNonTerminals();
        return nonTerminals.get(nonTerminals.size() - 1).getName();
    }

    public ArrayList<String> getLeafNodeNamesList() {
        return getTerminals().stream().map(CustomNode::getValue).collect(Collectors.toCollection(ArrayList::new));
    }
}
