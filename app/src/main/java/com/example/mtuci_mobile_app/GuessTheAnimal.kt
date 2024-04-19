package com.example.mtuci_mobile_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mtuci_mobile_app.databinding.GuessTheAnimalBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class GuessTheAnimal : Fragment() {

    private var _binding: GuessTheAnimalBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = GuessTheAnimalBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonGuess.setOnClickListener{
            if (binding.editTextGuess.text.toString().equals("racoon") == true){
                findNavController().navigate(R.id.action_guessTheAnimal_to_guessTheAnimalRight)
            }
            else{
                findNavController().navigate(R.id.action_guessTheAnimal_to_guessTheAnimalIncorrect)
            }
        };
        binding.backButtonLogin.setOnClickListener(){
            findNavController().navigate(R.id.action_guessTheAnimal_to_profile2)
        }
//        binding.buttonNext1.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        };


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}