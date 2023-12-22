package com.example.zen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zen.databinding.ActivityUserBinding

class UserFragment : Fragment() {
    private lateinit var binding: ActivityUserBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = ActivityUserBinding.inflate(layoutInflater)
        return inflater.inflate(R.layout.fragment_user, container, false)
    }

}