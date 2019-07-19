package com.fbatista.navigationcontroller_jetpack_sample.main


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.fbatista.navigationcontroller_jetpack_sample.R
import kotlinx.android.synthetic.main.fragment_login.*

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class LoginFragment : Fragment() {

    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        loginbtn.setOnClickListener {
            val user = userNameEt.text.toString()
            val password = passwordEt.text.toString()


            if ((user == "fernando") && (password == "3333")) {
                val bundle = bundleOf(HomeFragment.ARG_NAME to user )
                NavHostFragment.findNavController(this).navigate(R.id.action_from_login_to_home, bundle)
            }
        }

        signupBtn.setOnClickListener {
            NavHostFragment.findNavController(this).navigate(R.id.action_from_login_to_signup)
        }
    }
}
