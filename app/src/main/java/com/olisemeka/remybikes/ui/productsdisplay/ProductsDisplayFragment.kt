package com.olisemeka.remybikes.ui.productsdisplay

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.olisemeka.remybikes.data.datasource.DataSource
import com.olisemeka.remybikes.databinding.FragmentProductsDisplayBinding

class ProductsDisplayFragment : Fragment() {
    private var _binding: FragmentProductsDisplayBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentProductsDisplayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bikeData = DataSource.getBikeData()
        binding.numberOfProducts.text = bikeData.size.toString()
        binding.recyclerviewProducts.adapter = BikeListAdapter(requireContext(), bikeData)
        binding.recyclerviewProducts.layoutManager = GridLayoutManager(requireContext(), 2)

    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}