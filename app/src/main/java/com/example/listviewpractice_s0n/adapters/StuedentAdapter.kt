package com.example.listviewpractice_s0n.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.listviewpractice_s0n.R
import com.example.listviewpractice_s0n.datas.Student

class StudentAdapter(
    val mContext: Context,
    val resId: Int,       //ArrayList<뿌려줄 데이터 클래스>
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {


    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow==null){
            //converView가 비어있었다면, 새로 대입
            tempRow = inf.inflate(R.layout.student_list_item, null)  //null:부가정보는 일단 null로 .

        }

        val row = tempRow!!  //

        val studentData = mList[position]  //position번째 위치에 맞는 데이터를 뽑아 studentData에 담아줌

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)  //nameTxt아이디를 가져다가 텍스트뷰 찾아서 변수에 담아줌
        val birthYearTxt = row.findViewById<TextView>(R.id.birthYearTxt)

        nameTxt.text = studentData.name
        birthYearTxt.text = "(${studentData.birthYear}년생)"

        return row

    }

}