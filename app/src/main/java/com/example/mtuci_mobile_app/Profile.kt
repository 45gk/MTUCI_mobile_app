package com.example.mtuci_mobile_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mtuci_mobile_app.databinding.ProfileBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class Profile : Fragment() {

    private var _binding: ProfileBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = ProfileBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGuessTheAnimal.setOnClickListener() {
            findNavController().navigate(R.id.action_profile2_to_guessTheAnimal)
        }
        binding.buttonListening.setOnClickListener(){
            findNavController().navigate(R.id.action_profile2_to_listening)
        }
        binding.buttonWordPractice.setOnClickListener(){
            findNavController().navigate(R.id.action_profile2_to_wordPractice)
        }
        binding.imageAvatar.setOnClickListener(){
            findNavController().navigate(R.id.action_profile2_to_mainProfile2)
        }
        binding.button2.setOnClickListener(){
            findNavController().navigate(R.id.action_profile2_to_widget)
        }
        binding.button3.setOnClickListener(){
            findNavController().navigate(R.id.action_profile2_to_widget)
        }
        binding.button4.setOnClickListener(){
            findNavController().navigate(R.id.action_profile2_to_widget)
        }

//        binding.buttonProfile.setOnClickListener{
//            findNavController().navigate(R.id.action_profile2_to_mainProfile2)
//        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}