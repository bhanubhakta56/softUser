package com.vanuvakta.softuser.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.vanuvakta.softuser.R
class AboutUsFragment : Fragment() {
    private lateinit var about_us: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_about_us, container, false)
        about_us=view.findViewById(R.id.about_us)
        about_us.loadUrl("https://softwarica.edu.np/")
        return view
    }
}