package com.pipimovie.dataobject;

public class ZykDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_zyk.zid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private Integer zid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_zyk.zname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String zname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_zyk.zapi
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String zapi;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sea_zyk.zinfo
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    private String zinfo;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_zyk
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public ZykDO(Integer zid, String zname, String zapi, String zinfo) {
        this.zid = zid;
        this.zname = zname;
        this.zapi = zapi;
        this.zinfo = zinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_zyk
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public ZykDO() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_zyk.zid
     *
     * @return the value of sea_zyk.zid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public Integer getZid() {
        return zid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_zyk.zid
     *
     * @param zid the value for sea_zyk.zid
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setZid(Integer zid) {
        this.zid = zid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_zyk.zname
     *
     * @return the value of sea_zyk.zname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getZname() {
        return zname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_zyk.zname
     *
     * @param zname the value for sea_zyk.zname
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setZname(String zname) {
        this.zname = zname == null ? null : zname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_zyk.zapi
     *
     * @return the value of sea_zyk.zapi
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getZapi() {
        return zapi;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_zyk.zapi
     *
     * @param zapi the value for sea_zyk.zapi
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setZapi(String zapi) {
        this.zapi = zapi == null ? null : zapi.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sea_zyk.zinfo
     *
     * @return the value of sea_zyk.zinfo
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public String getZinfo() {
        return zinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sea_zyk.zinfo
     *
     * @param zinfo the value for sea_zyk.zinfo
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    public void setZinfo(String zinfo) {
        this.zinfo = zinfo == null ? null : zinfo.trim();
    }
}