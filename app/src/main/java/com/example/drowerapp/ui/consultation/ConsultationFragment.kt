package com.example.drowerapp.ui.consultation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.drowerapp.R
import com.example.drowerapp.databinding.FragmentConsultationBinding
import com.example.drowerapp.databinding.FragmentGalleryBinding

class ConsultationFragment : Fragment() {
    private var _binding: FragmentConsultationBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentConsultationBinding.inflate(inflater, container, false)
        val root: View = binding.root


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}