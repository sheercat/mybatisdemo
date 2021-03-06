package net.vg4.mybatisdemo.mybatis.generate.mapper;

import net.vg4.mybatisdemo.mybatis.generate.model.People;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PeopleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated
     */
    int insert(People record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated
     */
    int insertSelective(People record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated
     */
    People selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(People record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table people
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(People record);
}