// (C) Copyright 2003-2015 Hewlett-Packard Development Company, L.P.

package com.hp.mqm.client.model;

final public class ListItem {

    private final Long id;
    private final String name;
    private final ListItem root;

    public ListItem(Long id, String name, ListItem root) {
        this.id = id;
        this.name = name;
        this.root = root;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ListItem getRoot() {
        return root;
    }
}
