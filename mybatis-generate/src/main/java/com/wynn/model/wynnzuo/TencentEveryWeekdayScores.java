package com.wynn.model.wynnzuo;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "`tencent_every_weekday_scores`")
public class TencentEveryWeekdayScores {
    @Id
    @Column(name = "`id`")
    private String id;

    @Column(name = "`end_date`")
    private String endDate;

    @Column(name = "`neg_count`")
    private Integer negCount;

    @Column(name = "`neg_ratio`")
    private BigDecimal negRatio;

    @Column(name = "`pos_count`")
    private Integer posCount;

    @Column(name = "`prvt_org_cde`")
    private String prvtOrgCde;

    @Column(name = "`score`")
    private BigDecimal score;

    @Column(name = "`start_date`")
    private String startDate;

    @Column(name = "`very_neg_count`")
    private Integer veryNegCount;

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
     * @return end_date
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    /**
     * @return neg_count
     */
    public Integer getNegCount() {
        return negCount;
    }

    /**
     * @param negCount
     */
    public void setNegCount(Integer negCount) {
        this.negCount = negCount;
    }

    /**
     * @return neg_ratio
     */
    public BigDecimal getNegRatio() {
        return negRatio;
    }

    /**
     * @param negRatio
     */
    public void setNegRatio(BigDecimal negRatio) {
        this.negRatio = negRatio;
    }

    /**
     * @return pos_count
     */
    public Integer getPosCount() {
        return posCount;
    }

    /**
     * @param posCount
     */
    public void setPosCount(Integer posCount) {
        this.posCount = posCount;
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

    /**
     * @return start_date
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    /**
     * @return very_neg_count
     */
    public Integer getVeryNegCount() {
        return veryNegCount;
    }

    /**
     * @param veryNegCount
     */
    public void setVeryNegCount(Integer veryNegCount) {
        this.veryNegCount = veryNegCount;
    }
}