package com.wynn.model.wynnzuo;

import javax.persistence.*;

@Table(name = "`bittest`")
public class Bittest {
    @Column(name = "`a`")
    private Boolean a;

    /**
     * @return a
     */
    public Boolean getA() {
        return a;
    }

    /**
     * @param a
     */
    public void setA(Boolean a) {
        this.a = a;
    }
}