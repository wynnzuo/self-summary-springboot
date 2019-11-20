package com.wynn.model.wynnzuo;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "`tencent_every_company_scores`")
public class TencentEveryCompanyScores {
    @Id
    @Column(name = "`id`")
    private String id;

    @Column(name = "`prvt_org_cde`")
    private String prvtOrgCde;

    @Column(name = "`score`")
    private BigDecimal score;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return prvt_org_cde
     */
    public String getPrvtOrgCde() {
        return prvtOrgCde;
    }

    /**
     * @param prvtOrgCde
     */
    public void setPrvtOrgCde(String prvtOrgCde) {
        this.prvtOrgCde = prvtOrgCde == null ? null : prvtOrgCde.trim();
    }

    /**
     * @return score
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * @param score
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }
}