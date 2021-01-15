package com.vanuvakta.softuser.`object`

import com.vanuvakta.softuser.model.Student

object StudentList {
    var studentList = ArrayList<Student>()
    fun addStudent(student: Student){
        studentList.add(student)
    }
    fun fetchStudent(): ArrayList<Student>{
        return studentList
    }
}