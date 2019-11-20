package com.wynn.model.wynnzuo;

import javax.persistence.*;

@Table(name = "`apple`")
public class Apple {
    @Column(name = "`name`")
    private String name;

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}