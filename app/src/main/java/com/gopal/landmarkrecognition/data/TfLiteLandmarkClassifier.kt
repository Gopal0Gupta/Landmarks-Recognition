package com.gopal.landmarkrecognition.data

import android.content.Context
import android.graphics.Bitmap
import com.gopal.landmarkrecognition.domain.Classification
import com.gopal.landmarkrecognition.domain.LandmarkClassifier

class TfLiteLandmarkClassifier(
    private val context : Context,
    private val threshold : Float = 0.5f,
    private val maxResults : Int = 1
):LandmarkClassifier {

    override fun classify(bitmap: Bitmap, rotation: Int): List<Classification> {

    }
}