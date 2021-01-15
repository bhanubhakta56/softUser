package com.vanuvakta.softuser.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vanuvakta.softuser.R
import com.vanuvakta.softuser.model.Student
import de.hdodenhof.circleimageview.CircleImageView

class StudentAdapter(
    val studentList: ArrayList<Student>,
    val context: Context
) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {
    class  StudentViewHolder(view: View): RecyclerView.ViewHolder(view){
        val profile : CircleImageView
        val tv_name: TextView
        val tv_age: TextView
        val tv_gender: TextView
        val tv_address: TextView
        val img_delete: ImageView
        init {
            profile = view.findViewById(R.id.profile)
            tv_name = view.findViewById(R.id.tv_name)
            tv_age = view.findViewById(R.id.tv_age)
            tv_gender = view.findViewById(R.id.tv_gender)
            tv_address = view.findViewById(R.id.tv_address)
            img_delete = view.findViewById(R.id.img_delete)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_student_layout, parent, false)
        return  StudentViewHolder(view)
    }

    override fun getItemCount(): Int {
        return studentList.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        val student = studentList[position]
        holder.tv_name.text=student.Name
        holder.tv_age.text=student.Age.toString()
        holder.tv_address.text=student.Address
        holder.tv_gender.text=student.Gender
        holder.img_delete.setOnClickListener {
            studentList.removeAt(position)
            notifyDataSetChanged()
        }

    }
}