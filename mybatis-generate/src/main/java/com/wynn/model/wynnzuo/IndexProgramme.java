package com.wynn.model.wynnzuo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`index_programme`")
public class IndexProgramme {
    /**
     * 账号
     */
    @Id
    @Column(name = "`account`")
    private String account;

    /**
     * 方案序号
     */
    @Id
    @Column(name = "`programme_order`")
    private Integer programmeOrder;

    /**
     * 方案名
     */
    @Column(name = "`programme_name`")
    private String programmeName;

    /**
     * 修改时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;

    /**
     * 方案
     */
    @Column(name = "`programme`")
    private String programme;

    /**
     * 获取账号
     *
     * @return account - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取方案序号
     *
     * @return programme_order - 方案序号
     */
    public Integer getProgrammeOrder() {
        return programmeOrder;
    }

    /**
     * 设置方案序号
     *
     * @param programmeOrder 方案序号
     */
    public void setProgrammeOrder(Integer programmeOrder) {
        this.programmeOrder = programmeOrder;
    }

    /**
     * 获取方案名
     *
     * @return programme_name - 方案名
     */
    public String getProgrammeName() {
        return programmeName;
    }

    /**
     * 设置方案名
     *
     * @param programmeName 方案名
     */
    public void setProgrammeName(String programmeName) {
        this.programmeName = programmeName == null ? null : programmeName.trim();
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取方案
     *
     * @return programme - 方案
     */
    public String getProgramme() {
        return programme;
    }

    /**
     * 设置方案
     *
     * @param programme 方案
     */
    public void setProgramme(String programme) {
        this.programme = programme == null ? null : programme.trim();
    }
}