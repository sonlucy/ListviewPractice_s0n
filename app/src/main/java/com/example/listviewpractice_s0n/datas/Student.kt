package com.example.listviewpractice_s0n.datas

// 학생 하위정보- 이름, 출생년도
class Student(val name: String,
              val birthYear: Int) {


    // 2022년의 나의 나이를 결과로 내보내주는 함수.
    fun getMyNameIn2022():Int {
        val myAge= 2022- this.birthYear +1

        return myAge
    }
}