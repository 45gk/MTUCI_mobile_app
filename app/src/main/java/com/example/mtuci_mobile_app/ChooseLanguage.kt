package com.example.mtuci_mobile_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mtuci_mobile_app.databinding.ChooseLanguageBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class ChooseLanguage : Fragment() {

    private var _binding: ChooseLanguageBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = ChooseLanguageBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.buttonSecond.setOnClickListener {
//            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
//        }
//
//        binding.button2.setOnClickListener{
//            findNavController().navigate(R.id.action_SecondFragment_to_profile2)
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}