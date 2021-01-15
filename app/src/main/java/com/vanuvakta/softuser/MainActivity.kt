package com.vanuvakta.softuser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.vanuvakta.softuser.`object`.StudentList
import com.vanuvakta.softuser.adapter.ViewPagerAdapter
import com.vanuvakta.softuser.fragments.AboutUsFragment
import com.vanuvakta.softuser.fragments.AddStudentFragment
import com.vanuvakta.softuser.fragments.HomeFragment
import com.vanuvakta.softuser.model.Student

class MainActivity : AppCompatActivity() {
    private var titleList=ArrayList<String>()
    private var fragmentList=ArrayList<Fragment>()
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager = findViewById(R.id.viewpager)
        tabLayout = findViewById(R.id.tablayout)

        loadTitle()
        loadFragment()
        loadStudent()

        val adapter = ViewPagerAdapter(fragmentList,supportFragmentManager,lifecycle)
        viewPager.adapter = adapter
        TabLayoutMediator(tabLayout,viewPager){ tab, position -> tab.text=titleList[position] }.attach()

    }
    private fun loadFragment(){
        fragmentList.add(HomeFragment())
        fragmentList.add(AddStudentFragment())
        fragmentList.add(AboutUsFragment())
    }
    private fun loadTitle(){
        titleList.add("Home")
        titleList.add("Add Student")
        titleList.add("About Us")
    }
    private fun loadStudent(){
        StudentList.addStudent(Student("Bhanubhakta Bhandari",24, "male", "chabel"))
        StudentList.addStudent(Student("Sabin Chapagain",13, "male", "jhapa"))
        StudentList.addStudent(Student("Unish Bhattrai",45, "male", "damak"))
    }
}