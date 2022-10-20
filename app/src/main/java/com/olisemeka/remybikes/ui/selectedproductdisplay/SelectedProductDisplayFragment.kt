package com.olisemeka.remybikes.ui.selectedproductdisplay

import android.os.Bundle
import android.text.Spannable
import android.text.style.BulletSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.olisemeka.remybikes.R
import com.olisemeka.remybikes.data.datasource.DataSource
import com.olisemeka.remybikes.databinding.FragmentSelectedProductDisplayBinding
import java.text.NumberFormat


class SelectedProductDisplayFragment : Fragment() {
    private var _binding: FragmentSelectedProductDisplayBinding? = null
    private val binding get() = _binding!!
    private val args: SelectedProductDisplayFragmentArgs by navArgs()
    val bikeData by lazy{ DataSource.getBikeData() }
    val accessoryData by lazy { DataSource.getAccessoryData() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSelectedProductDisplayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val itemIndicator = args.itemIndicator
        if (itemIndicator == "BIK"){
            displayBikeData()
        }
        if (itemIndicator == "ACC"){
            displayAccessoryData()
        }


    }

    private fun displayAccessoryData() {
        val itemPosition = args.itemPosition
        val accessory = accessoryData[itemPosition]
        Glide.with(requireContext())
            .load(accessory.imageUrl)
            .centerCrop()
            .into(binding.imageviewSelectedItem)

        binding.textviewBikeName.text = accessory.name
    }

    private fun displayBikeData() {
        val itemPosition = args.itemPosition
        val bike = bikeData[itemPosition]
        Glide.with(requireContext())
            .load(bike.imageUrl)
            .centerCrop()
            .into(binding.imageviewSelectedItem)

        binding.textviewBikeName.text = bike.name
        binding.textView8.text = getString(R.string.bike_brand, bike.brand)
        binding.textviewBikePrice.text = NumberFormat.getCurrencyInstance().format(bike.price)
        binding.ratingBar.rating = bike.rating.toFloat()
        val productDetails = bike.productDetails
        productDetails.apply {
            setSpan(BulletSpan(), 0, 19, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            setSpan(BulletSpan(), 22, 38, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            setSpan(BulletSpan(), 41, 52, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            setSpan(BulletSpan(), 55, 67, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
            setSpan(BulletSpan(), 70, productDetails.lastIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
            binding.textviewProductDetails.text = productDetails
        }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}