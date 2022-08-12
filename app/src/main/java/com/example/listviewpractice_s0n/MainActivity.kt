package com.example.listviewpractice_s0n

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractice_s0n.datas.Student

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(Student("손보경", 2001))  //mStudentList목록에 Student를 추가할것이다.
        mStudentList.add(Student("강호동", 1968))
        mStudentList.add(Student("손석구", 1985))
        mStudentList.add(Student("차현우", 2004))
        mStudentList.add(Student("김민지", 2003))
        mStudentList.add(Student("박지성", 1997))
        mStudentList.add(Student("이혜인", 1981))
        mStudentList.add(Student("우해미", 1999))
        mStudentList.add(Student("백지현", 2002))
        mStudentList.add(Student("최정인", 2001))

    }
}