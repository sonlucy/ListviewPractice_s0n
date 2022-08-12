package com.example.listviewpractice_s0n.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviewpractice_s0n.R
import com.example.listviewpractice_s0n.datas.Student

class StuedentAdapter(
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

        return row

    }

}