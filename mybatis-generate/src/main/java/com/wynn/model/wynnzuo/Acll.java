package com.wynn.model.wynnzuo;

import javax.persistence.*;

@Table(name = "`acll`")
public class Acll {
    @Column(name = "`perms`")
    private Byte perms;

    /**
     * @return perms
     */
    public Byte getPerms() {
        return perms;
    }

    /**
     * @param perms
     */
    public void setPerms(Byte perms) {
        this.perms = perms;
    }
}