package com.pipimovie.dataobject;

public class TypeDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_type.tid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Short tid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_type.upid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Byte upid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_type.tname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String tname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_type.tenname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String tenname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_type.torder
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Integer torder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_type.templist
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String templist;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_type.templist_1
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String templist1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_type.templist_2
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String templist2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_type.title
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_type.keyword
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String keyword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_type.description
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_type.ishidden
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Short ishidden;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_type.unionid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String unionid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_type.tptype
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Short tptype;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_type
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public TypeDO(Short tid, Byte upid, String tname, String tenname, Integer torder, String templist, String templist1, String templist2, String title, String keyword, String description, Short ishidden, String unionid, Short tptype) {
        this.tid = tid;
        this.upid = upid;
        this.tname = tname;
        this.tenname = tenname;
        this.torder = torder;
        this.templist = templist;
        this.templist1 = templist1;
        this.templist2 = templist2;
        this.title = title;
        this.keyword = keyword;
        this.description = description;
        this.ishidden = ishidden;
        this.unionid = unionid;
        this.tptype = tptype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_type
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public TypeDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_type.tid
     *
     * @return the value of sea_type.tid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Short getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_type.tid
     *
     * @param tid the value for sea_type.tid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setTid(Short tid) {
        this.tid = tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_type.upid
     *
     * @return the value of sea_type.upid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Byte getUpid() {
        return upid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_type.upid
     *
     * @param upid the value for sea_type.upid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setUpid(Byte upid) {
        this.upid = upid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_type.tname
     *
     * @return the value of sea_type.tname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getTname() {
        return tname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_type.tname
     *
     * @param tname the value for sea_type.tname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_type.tenname
     *
     * @return the value of sea_type.tenname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getTenname() {
        return tenname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_type.tenname
     *
     * @param tenname the value for sea_type.tenname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setTenname(String tenname) {
        this.tenname = tenname == null ? null : tenname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_type.torder
     *
     * @return the value of sea_type.torder
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Integer getTorder() {
        return torder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_type.torder
     *
     * @param torder the value for sea_type.torder
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setTorder(Integer torder) {
        this.torder = torder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_type.templist
     *
     * @return the value of sea_type.templist
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getTemplist() {
        return templist;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_type.templist
     *
     * @param templist the value for sea_type.templist
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setTemplist(String templist) {
        this.templist = templist == null ? null : templist.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_type.templist_1
     *
     * @return the value of sea_type.templist_1
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getTemplist1() {
        return templist1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_type.templist_1
     *
     * @param templist1 the value for sea_type.templist_1
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setTemplist1(String templist1) {
        this.templist1 = templist1 == null ? null : templist1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_type.templist_2
     *
     * @return the value of sea_type.templist_2
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getTemplist2() {
        return templist2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_type.templist_2
     *
     * @param templist2 the value for sea_type.templist_2
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setTemplist2(String templist2) {
        this.templist2 = templist2 == null ? null : templist2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_type.title
     *
     * @return the value of sea_type.title
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_type.title
     *
     * @param title the value for sea_type.title
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_type.keyword
     *
     * @return the value of sea_type.keyword
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getKeyword() {
        return keyword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_type.keyword
     *
     * @param keyword the value for sea_type.keyword
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_type.description
     *
     * @return the value of sea_type.description
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_type.description
     *
     * @param description the value for sea_type.description
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_type.ishidden
     *
     * @return the value of sea_type.ishidden
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Short getIshidden() {
        return ishidden;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_type.ishidden
     *
     * @param ishidden the value for sea_type.ishidden
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setIshidden(Short ishidden) {
        this.ishidden = ishidden;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_type.unionid
     *
     * @return the value of sea_type.unionid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getUnionid() {
        return unionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_type.unionid
     *
     * @param unionid the value for sea_type.unionid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_type.tptype
     *
     * @return the value of sea_type.tptype
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Short getTptype() {
        return tptype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_type.tptype
     *
     * @param tptype the value for sea_type.tptype
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setTptype(Short tptype) {
        this.tptype = tptype;
    }
}