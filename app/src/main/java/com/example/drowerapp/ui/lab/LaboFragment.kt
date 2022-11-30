package com.example.drowerapp.ui.lab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.example.drowerapp.R
import com.example.drowerapp.databinding.FragmentHomeBinding
import com.example.drowerapp.databinding.FragmentLaboratoryBinding


class LaboratoryFragment : Fragment() {
    private var _binding: FragmentLaboratoryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentLaboratoryBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val weblab: WebView = binding.weblab
        weblab.loadUrl("file:///android_asset/lab.html")
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}