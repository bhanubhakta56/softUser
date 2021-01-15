package com.vanuvakta.softuser.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import com.vanuvakta.softuser.R
import com.vanuvakta.softuser.`object`.StudentList
import com.vanuvakta.softuser.model.Student

class AddStudentFragment : Fragment() {
    private lateinit var et_name: EditText
    private lateinit var et_age: EditText
    private lateinit var et_address: EditText
    private lateinit var rd_male: RadioButton
    private lateinit var rd_female: RadioButton
    private lateinit var rd_others: RadioButton
    private lateinit var btn_save: Button
    private var gender=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_student, container, false)
        et_name=view.findViewById(R.id.et_name)
        et_age=view.findViewById(R.id.et_age)
        et_address=view.findViewById(R.id.et_address)
        rd_male=view.findViewById(R.id.rd_male)
        rd_female=view.findViewById(R.id.rd_female)
        rd_others=view.findViewById(R.id.rd_others)
        btn_save=view.findViewById(R.id.btn_save)
        rd_male.setOnClickListener {
            gender=rd_male.text.toString()
        }
        rd_female.setOnClickListener {
            gender=rd_female.text.toString()
        }
        rd_others.setOnClickListener {
            gender=rd_others.text.toString()
        }
        btn_save.setOnClickListener {
            val name = et_name.text.toString()
            val age = et_age.text.toString().toInt()
            val address = et_address.text.toString()
            StudentList.addStudent(Student(name, age, gender, address))
        }
        return view
    }

}