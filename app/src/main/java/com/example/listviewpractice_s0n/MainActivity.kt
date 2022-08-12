package com.example.listviewpractice_s0n

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractice_s0n.adapters.StudentAdapter
import com.example.listviewpractice_s0n.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : StudentAdapter //나중에 변수를 채워넣을거야. StudentAdapter 모양으로.

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

        //이제 변수 넣어줌. StudentAdapter(어떤 화면에서 보고잇는가용, 이 목록 모양에 맞게 뿌려주세여, 무슨 목록 뿌리려고하낭)
        mAdapter = StudentAdapter(mContext = this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter
    }
}