package com.fbatista.navigationcontroller_jetpack_sample.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fbatista.navigationcontroller_jetpack_sample.R
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var name: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(ARG_NAME)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        argTv.text = "$name : este foi o argumeto passado via fragment"
    }

    override fun onDetach() {
        super.onDetach()
    }

    companion object {
        const val ARG_NAME = "arg_name"

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_NAME, param1)
                }
            }
    }
}
