package com.vanuvakta.softuser.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.vanuvakta.softuser.R
import com.vanuvakta.softuser.`object`.StudentList
import com.vanuvakta.softuser.adapter.StudentAdapter

class HomeFragment : Fragment() {
    private lateinit var rc_student: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, true)
        rc_student = view.findViewById(R.id.rc_student)
        val studentAdapter = StudentAdapter(StudentList.fetchStudent(), context!!)
        rc_student.layoutManager = LinearLayoutManager(context)
        rc_student.adapter=studentAdapter
        return view
         }

}