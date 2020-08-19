package com.pipimovie.dao;

import com.pipimovie.dataobject.DataDO;

import java.util.List;

public interface DataDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_data
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int deleteByPrimaryKey(Integer vId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_data
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insert(DataDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_data
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int insertSelective(DataDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_data
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    DataDO selectByPrimaryKey(Integer vId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_data
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKeySelective(DataDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sea_data
     *
     * @mbg.generated Wed Jun 24 11:20:32 CST 2020
     */
    int updateByPrimaryKey(DataDO record);

    List<DataDO> listByTid(int tid);


}