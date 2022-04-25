package com.lagou.dao;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;
import com.lagou.domain.Teacher;

import java.util.List;

public interface CourseMapper {
    /*
    * 多条件课程查询，根据课程名称和课程状态
    * */
    public List<Course> findCourseByCondition(CourseVO courseVO);

    /*
    * 保存课程信息
    * */
    public void saveCourse(Course course);

    /*
    * 保存老师信息
    * */
    public void saveTeacher(Teacher teacher);

    /*
    * 根据id查找课程信息
    * */
    public CourseVO findCourseById(int id);

    /*
     * 更新课程信息
     * */
    public void updateCourse(Course course);

    /*
     * 更新老师信息
     * */
    public void updateTeacher(Teacher teacher);

    /*
    * 修改课程状态
    * */
    public void updateCourseStatus(Course course);


}
