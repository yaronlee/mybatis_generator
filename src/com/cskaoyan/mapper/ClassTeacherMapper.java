package com.cskaoyan.mapper;

import com.cskaoyan.bean.ClassTeacher;
import com.cskaoyan.bean.ClassTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassTeacherMapper {
    long countByExample(ClassTeacherExample example);

    int deleteByExample(ClassTeacherExample example);

    int deleteByPrimaryKey(String id);

    int insert(ClassTeacher record);

    int insertSelective(ClassTeacher record);

    List<ClassTeacher> selectByExample(ClassTeacherExample example);

    ClassTeacher selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ClassTeacher record, @Param("example") ClassTeacherExample example);

    int updateByExample(@Param("record") ClassTeacher record, @Param("example") ClassTeacherExample example);

    int updateByPrimaryKeySelective(ClassTeacher record);

    int updateByPrimaryKey(ClassTeacher record);
}