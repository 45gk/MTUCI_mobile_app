package com.example.mtuci_mobile_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mtuci_mobile_app.databinding.Onbording1Binding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Onboarding_1 : Fragment() {

    private var _binding: Onbording1Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = Onbording1Binding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonNextOnb1.setOnClickListener() {
            findNavController().navigate(R.id.action_onboarding_1_to_onBoarding_2)
        }
        binding.textView.setOnClickListener{
            findNavController().navigate(R.id.action_onboarding_1_to_login)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}