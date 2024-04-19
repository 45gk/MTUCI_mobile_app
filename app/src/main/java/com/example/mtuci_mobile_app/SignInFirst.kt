package com.example.mtuci_mobile_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mtuci_mobile_app.databinding.SignInFirstBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SignInFirst : Fragment() {

    private var _binding: SignInFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = SignInFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.buttonSecond.setOnClickListener {
//            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
//        }
//
        binding.buttonCont.setOnClickListener{
            findNavController().navigate(R.id.action_signInFirst_to_signInSecond)
        }
        binding.backButtonLogin.setOnClickListener{
            findNavController().navigate(R.id.action_signInFirst_to_login)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}