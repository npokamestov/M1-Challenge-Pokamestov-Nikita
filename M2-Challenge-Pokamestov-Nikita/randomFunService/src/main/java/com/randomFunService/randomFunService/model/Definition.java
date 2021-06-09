package com.randomFunService.randomFunService.model;

import java.util.Objects;

public class Definition {

    protected int id;
    protected String word;
    protected String definition;

    public Definition() {
    }

    public Definition(int id, String word, String definition) {
        this.id = id;
        this.word = word;
        this.definition = definition;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Definition definition = (Definition) o;
        return getId() == definition.getId() && Objects.equals(getWord(), definition.getWord()) && Objects.equals(getDefinition(), definition.getDefinition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getWord(), getDefinition());
    }

    @Override
    public String toString() {
        return "Definition{" +
                "id=" + id +
                ", word='" + word + '\'' +
                ", definition='" + definition + '\'' +
                '}';
    }
}
