package com.example.listviewpractice_s0n

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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


        studentListView.setOnItemClickListener { adapterView, view, position, id ->

            //눌린 사람의 이름을 토스트로 알리기
            val clickedStudent = mStudentList[position]  //클릭된 학생을 꺼내주고
            Toast.makeText(this, "${clickedStudent.name}이 클릭됨", Toast.LENGTH_SHORT).show()

        }


        //길게 누를떄
        studentListView.setOnItemLongClickListener { adapterView, view, position, id ->

            mStudentList.removeAt(position)  //길게 누르면 해당목록 삭제되게.
            //새로고침 기능. (리스트뷰의 목록 변경을 알려줘야지.)
            mAdapter.notifyDataSetChanged()

            /*
            val longClikedStudent = mStudentList[position]

            Toast.makeText(this, "${longClikedStudent.name} 길게 클릭됨", Toast.LENGTH_SHORT).show()
*/
            return@setOnItemLongClickListener true  //true로 햐면 longclick만 전용실행. 만약 false이면 손 떼는 시점에서 그냥 클릭이벤트도 실행됨.
        }

    }
}