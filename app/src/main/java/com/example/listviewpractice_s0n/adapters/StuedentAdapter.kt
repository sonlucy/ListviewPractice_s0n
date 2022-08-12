package com.example.listviewpractice_s0n.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.listviewpractice_s0n.datas.Student

class StuedentAdapter(val mContext: Context,
                      val resId: Int,
                      val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {


}