package com.pipimovie.dataobject;

public class ArcrankDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_arcrank.id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Short id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_arcrank.rank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Short rank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_arcrank.membername
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String membername;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_arcrank.adminrank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Short adminrank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_arcrank.money
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Short money;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_arcrank.scores
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Integer scores;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_arcrank.purviews
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String purviews;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_arcrank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public ArcrankDO(Short id, Short rank, String membername, Short adminrank, Short money, Integer scores, String purviews) {
        this.id = id;
        this.rank = rank;
        this.membername = membername;
        this.adminrank = adminrank;
        this.money = money;
        this.scores = scores;
        this.purviews = purviews;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_arcrank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public ArcrankDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_arcrank.id
     *
     * @return the value of sea_arcrank.id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Short getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_arcrank.id
     *
     * @param id the value for sea_arcrank.id
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setId(Short id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_arcrank.rank
     *
     * @return the value of sea_arcrank.rank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Short getRank() {
        return rank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_arcrank.rank
     *
     * @param rank the value for sea_arcrank.rank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setRank(Short rank) {
        this.rank = rank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_arcrank.membername
     *
     * @return the value of sea_arcrank.membername
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getMembername() {
        return membername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_arcrank.membername
     *
     * @param membername the value for sea_arcrank.membername
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_arcrank.adminrank
     *
     * @return the value of sea_arcrank.adminrank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Short getAdminrank() {
        return adminrank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_arcrank.adminrank
     *
     * @param adminrank the value for sea_arcrank.adminrank
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setAdminrank(Short adminrank) {
        this.adminrank = adminrank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_arcrank.money
     *
     * @return the value of sea_arcrank.money
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Short getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_arcrank.money
     *
     * @param money the value for sea_arcrank.money
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setMoney(Short money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_arcrank.scores
     *
     * @return the value of sea_arcrank.scores
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Integer getScores() {
        return scores;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_arcrank.scores
     *
     * @param scores the value for sea_arcrank.scores
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setScores(Integer scores) {
        this.scores = scores;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_arcrank.purviews
     *
     * @return the value of sea_arcrank.purviews
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getPurviews() {
        return purviews;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_arcrank.purviews
     *
     * @param purviews the value for sea_arcrank.purviews
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setPurviews(String purviews) {
        this.purviews = purviews == null ? null : purviews.trim();
    }
}