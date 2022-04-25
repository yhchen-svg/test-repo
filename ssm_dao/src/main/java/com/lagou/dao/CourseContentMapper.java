package com.lagou.dao;

import com.lagou.domain.Course;
import com.lagou.domain.CourseLesson;
import com.lagou.domain.CourseSection;

import java.util.List;

/*
* 查询章节和课时信息
* */
public interface CourseContentMapper {
    // 根据id查找章节和课时信息
    public List<CourseSection> findSectionAndLessonByCourseId(int id);

    // 根据id查询课程名称：回显章节对应的课程信息
    public Course findCourseByCourseId(int id);

    // 新增章节信息
    public void saveSection(CourseSection courseSection);

    // 修改章节信息
    public void updateSection(CourseSection courseSection);

    // 修改章节状态信息
    public void updateSectionStatus(CourseSection courseSection);

    // 添加课程信息
    public void saveLesson(CourseLesson courseLesson);



}
