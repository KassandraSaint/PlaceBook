package com.raywenderlich.placebook.adapter

import android.app.Activity
import android.graphics.Bitmap
import android.view.View
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import com.raywenderlich.placebook.databinding.ContentBookmarkInfoBinding

class BookmarkInfoWindowAdapter(context: Activity) : GoogleMap.InfoWindowAdapter {
    private val binding = ContentBookmarkInfoBinding.inflate(context.layoutInflater)
    override fun getInfoContents(marker: Marker): View? {
        binding.title.text = marker.title ?: ""
        binding.phone.text = marker.snippet ?: ""
        return binding.root
    }

    override fun getInfoWindow(marker: Marker): View? {
        val imageView = binding.photo
        imageView.setImageBitmap((marker.tag as Bitmap))
        return null
    }
}