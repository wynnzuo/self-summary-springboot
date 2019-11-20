package com.wynn.model.wynnzuo;

import javax.persistence.*;

@Table(name = "`acl`")
public class Acl {
    @Column(name = "`perms`")
    private String perms;

    /**
     * @return perms
     */
    public String getPerms() {
        return perms;
    }

    /**
     * @param perms
     */
    public void setPerms(String perms) {
        this.perms = perms == null ? null : perms.trim();
    }
}