package com.example.android.navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.android.navigation.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
                R.layout.fragment_title,container, false)
        binding.playButton.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
        )
//        return inflater.inflate(R.layout.fragment_title, container, false)
        return binding.root
    }


}
